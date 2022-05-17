package com.demo.document2pdf;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\'H\u0002J\"\u0010+\u001a\u00020\'2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0012\u00100\u001a\u00020\'2\b\u00101\u001a\u0004\u0018\u000102H\u0015J\u0012\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u00107\u001a\u0002042\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\'H\u0003J\b\u0010;\u001a\u00020\'H\u0002J\u0010\u0010<\u001a\u00020\'2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u00020\'2\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020\'H\u0002J\b\u0010C\u001a\u00020\'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Lcom/demo/document2pdf/EditNoteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "CHOOSE_IMAGE_FROM_GALLERY", "", "IMAGE_CAPTURE_REQUEST", "currentPhotoPath", "", "db", "Lcom/demo/document2pdf/Room/NotesDatabase;", "getDb", "()Lcom/demo/document2pdf/Room/NotesDatabase;", "setDb", "(Lcom/demo/document2pdf/Room/NotesDatabase;)V", "etNoteText", "Landroid/widget/EditText;", "getEtNoteText", "()Landroid/widget/EditText;", "setEtNoteText", "(Landroid/widget/EditText;)V", "etNoteTitle", "getEtNoteTitle", "setEtNoteTitle", "noteId", "getNoteId", "()I", "setNoteId", "(I)V", "noteText", "getNoteText", "()Ljava/lang/String;", "setNoteText", "(Ljava/lang/String;)V", "noteTitle", "getNoteTitle", "setNoteTitle", "progressDialog", "Landroid/app/ProgressDialog;", "addphotos", "", "createImageFile", "Ljava/io/File;", "deleteNote", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "openCamera", "openGallery", "processRecognizedText", "recognizedText", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText;", "runTextRecognition", "bitmap", "Landroid/graphics/Bitmap;", "shareNote", "updateNote", "app_debug"})
public final class EditNoteActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.lang.String currentPhotoPath;
    private android.app.ProgressDialog progressDialog;
    private final int IMAGE_CAPTURE_REQUEST = 11;
    private final int CHOOSE_IMAGE_FROM_GALLERY = 12;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String noteText;
    private int noteId;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String noteTitle;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText etNoteTitle;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText etNoteText;
    @org.jetbrains.annotations.NotNull()
    public com.demo.document2pdf.Room.NotesDatabase db;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNoteText() {
        return null;
    }
    
    public final void setNoteText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getNoteId() {
        return 0;
    }
    
    public final void setNoteId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNoteTitle() {
        return null;
    }
    
    public final void setNoteTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtNoteTitle() {
        return null;
    }
    
    public final void setEtNoteTitle(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtNoteText() {
        return null;
    }
    
    public final void setEtNoteText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.document2pdf.Room.NotesDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull()
    com.demo.document2pdf.Room.NotesDatabase p0) {
    }
    
    @kotlinx.coroutines.InternalCoroutinesApi()
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void openGallery() {
    }
    
    @android.annotation.SuppressLint(value = {"QueryPermissionsNeeded"})
    private final void openCamera() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final java.io.File createImageFile() throws java.io.IOException {
        return null;
    }
    
    private final void runTextRecognition(android.graphics.Bitmap bitmap) {
    }
    
    private final void processRecognizedText(com.google.firebase.ml.vision.text.FirebaseVisionText recognizedText) {
    }
    
    private final void addphotos() {
    }
    
    private final void shareNote() {
    }
    
    private final void deleteNote() {
    }
    
    private final void updateNote() {
    }
    
    public EditNoteActivity() {
        super();
    }
}