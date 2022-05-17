package com.demo.document2pdf

import android.annotation.SuppressLint
import android.app.Activity
import android.app.ProgressDialog
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import com.demo.document2pdf.Room.NoteModel
import com.demo.document2pdf.Room.NotesDatabase
import kotlinx.coroutines.InternalCoroutinesApi
import java.io.File
import java.io.IOException
import com.demo.document2pdf.MainActivity
import com.google.firebase.ml.vision.FirebaseVision
import com.google.firebase.ml.vision.common.FirebaseVisionImage
import com.google.firebase.ml.vision.text.FirebaseVisionText
import com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer
import java.text.SimpleDateFormat
import java.util.*

class EditNoteActivity : AppCompatActivity()  {
    private lateinit var currentPhotoPath: String
    private lateinit var progressDialog : ProgressDialog
    private val IMAGE_CAPTURE_REQUEST: Int = 11
    private val CHOOSE_IMAGE_FROM_GALLERY: Int =  12
    lateinit var noteText : String
    var noteId : Int =-1
    lateinit var noteTitle : String
    lateinit var etNoteTitle : EditText
    lateinit var etNoteText: EditText
    lateinit var db : NotesDatabase

    @InternalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_new_note)
        db = NotesDatabase.getDatabase(this)
        val previousScreen : Intent = intent
        noteId = previousScreen.getIntExtra("noteId",-1)
        noteTitle = previousScreen.getStringExtra("noteTitle").toString()
        noteText = previousScreen.getStringExtra("noteText").toString()
        etNoteText = findViewById(R.id.et_text_input)
        etNoteText.setText(noteText)
        etNoteTitle = findViewById(R.id.et_title_input)
        etNoteTitle.setText(noteTitle)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.save_delete_share_note_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_update_saved -> updateNote()
            R.id.menu_delete_saved -> deleteNote()
            R.id.share_saved -> shareNote()
            R.id.capture -> addphotos()


        }
        return true
    }
    private fun openGallery() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "image/*"
        startActivityForResult(intent,CHOOSE_IMAGE_FROM_GALLERY)
    }
    @SuppressLint("QueryPermissionsNeeded")
    private fun openCamera() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { intent ->
            intent.resolveActivity(packageManager).also {
                val photoFile: File? = try {
                    createImageFile()
                } catch (e: IOException) {
                    e.printStackTrace()
                    null
                }

                photoFile?.also {
                    val photoUri : Uri = FileProvider.getUriForFile(this,"com.demo.document2pdf",it)
                    intent.putExtra(MediaStore.EXTRA_OUTPUT, photoUri)
                    startActivityForResult(intent,IMAGE_CAPTURE_REQUEST)
                }
            }
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        var bitmap: Bitmap? = null
        if (requestCode == IMAGE_CAPTURE_REQUEST && resultCode == Activity.RESULT_OK) {
            bitmap = BitmapFactory.decodeFile(currentPhotoPath)
        } else if (requestCode == CHOOSE_IMAGE_FROM_GALLERY && resultCode == Activity.RESULT_OK) {
            bitmap = MediaStore.Images.Media.getBitmap(
                this.contentResolver,
                data?.data
            );

        }
        try {
            if (bitmap != null) {
                runTextRecognition(bitmap)
            } else {
                Toast.makeText(
                    this,
                    getString(R.string.bitmap_null_msg),
                    Toast.LENGTH_SHORT
                ).show()
            }
        } catch (ex: IllegalStateException) {
            Toast.makeText(
                this,
                getString(R.string.no_text_in_image_msg),
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    @Throws(IOException::class)
    private fun createImageFile() : File {
        val timestamp : String  = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        val location : File? = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile("Image_${timestamp}_",".jpg",location).apply { currentPhotoPath = absolutePath }

    }

    private fun runTextRecognition(bitmap : Bitmap){
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Подождите пожалуйста...")
        progressDialog.setMessage("Процесс чтения текста")
        progressDialog.show()
        val image : FirebaseVisionImage = FirebaseVisionImage.fromBitmap(bitmap)
        val detector: FirebaseVisionTextRecognizer = FirebaseVision.getInstance().onDeviceTextRecognizer
        detector.processImage(image).addOnSuccessListener{firebaseVisionText ->
            processRecognizedText(firebaseVisionText)
        }.addOnFailureListener{
            Toast.makeText(this,"Ошибка чтения",Toast.LENGTH_SHORT).show()
            finish()
        }
    }

    private fun processRecognizedText(recognizedText : FirebaseVisionText) {
        val newNote = NoteModel()
        var resultText : String? = ""
        if(recognizedText.textBlocks.size==0){
            resultText =null
            return
        }

        for(block in recognizedText.textBlocks){
            resultText =   resultText + block.text +"\n"
            etNoteText.setText(noteText+"\n"+resultText)
        }
        progressDialog.dismiss()


        Toast.makeText(this,getString(R.string.note_updated), Toast.LENGTH_SHORT).show()

    }

    private fun addphotos() {

        val builder : AlertDialog.Builder = AlertDialog.Builder(this)
        builder.create()
        builder.setTitle("Что вы выберите?")

        val positiveListener = {
                _: DialogInterface, _:Int ->
            openGallery()
        }
        val negativeListener = {
                _:DialogInterface,_:Int ->
            openCamera()
        }
        builder.setPositiveButton("Галерея", DialogInterface.OnClickListener(function= positiveListener))
        builder.setNegativeButton("Камера",DialogInterface.OnClickListener(function = negativeListener))
        builder.setCancelable(true)
        builder.show()
    }




    private fun shareNote() {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type="text/plain"
        intent.putExtra(Intent.EXTRA_TEXT,noteText)
        intent.putExtra(Intent.EXTRA_SUBJECT,noteTitle)
        startActivity(intent)
    }

    private fun deleteNote() {
        val builder : AlertDialog.Builder = AlertDialog.Builder(this)
        builder.create()
        builder.setTitle("Хотите удалить заметку?")
        builder.setMessage("Вы уверены, что хотите удалить заметку??")
        val positiveListener = {
                _: DialogInterface, _:Int ->
            val noteModel : NoteModel = NoteModel()
            noteModel.id = noteId
            noteModel.noteText = noteText
            noteModel.noteTitle = noteTitle
            db.notesDao().deleteNote(noteModel)
            Toast.makeText(this,getString(R.string.note_deleted),Toast.LENGTH_SHORT).show()
            finish()
        }
        val negativeListener = {
            _:DialogInterface,_:Int ->
        }
        builder.setPositiveButton("Да", DialogInterface.OnClickListener(function= positiveListener))
        builder.setNegativeButton("нет",DialogInterface.OnClickListener(function = negativeListener))
        builder.setCancelable(true)
        builder.show()
    }


    private fun updateNote(){
        val newNote = NoteModel()
        newNote.id = noteId
        noteText = etNoteText.text.toString()
        noteTitle = etNoteTitle.text.toString()
        newNote.noteTitle = noteTitle
        newNote.noteText = noteText
        db.notesDao().updateNote(newNote)
        Toast.makeText(this,getString(R.string.note_updated), Toast.LENGTH_SHORT).show()
        finish()
    }
}
