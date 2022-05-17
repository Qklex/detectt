package com.demo.document2pdf;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001AB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\bH\u0002J \u0010&\u001a\u00020$2\u0006\u0010\'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0002J\b\u0010*\u001a\u00020$H\u0002J\"\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0012\u00100\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u000102H\u0015J\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020\u0005H\u0016J\b\u00105\u001a\u00020$H\u0014J\u0012\u00106\u001a\u00020$2\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u0012\u00109\u001a\u00020$2\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u0010\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020?H\u0002J\u0006\u0010@\u001a\u00020$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lcom/demo/document2pdf/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/demo/document2pdf/NoteListAdapter$ItemClicked;", "()V", "CHOOSE_IMAGE_FROM_GALLERY", "", "IMAGE_CAPTURE_REQUEST", "currentPhotoPath", "", "db", "Lcom/demo/document2pdf/Room/NotesDatabase;", "getDb", "()Lcom/demo/document2pdf/Room/NotesDatabase;", "setDb", "(Lcom/demo/document2pdf/Room/NotesDatabase;)V", "fabAddNew", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "fabCamera", "fabGallery", "fabWrite", "isFabVisible", "", "notesList", "", "Lcom/demo/document2pdf/Room/NoteModel;", "notesRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "getNotesRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "setNotesRecycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "progressDialog", "Landroid/app/ProgressDialog;", "createImageFile", "Ljava/io/File;", "goToAddNewNoteScreen", "", "resultText", "goToEditNoteScreen", "noteId", "noteTitle", "noteText", "initviews", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "position", "onResume", "openCamera", "it", "Landroid/view/View;", "openGallery", "processRecognizedText", "recognizedText", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText;", "runTextRecognition", "bitmap", "Landroid/graphics/Bitmap;", "showHideFab", "FetchNotesAsyncTask", "app_debug"})
public class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.demo.document2pdf.NoteListAdapter.ItemClicked {
    private java.lang.String currentPhotoPath;
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView notesRecycler;
    private final int IMAGE_CAPTURE_REQUEST = 11;
    private final int CHOOSE_IMAGE_FROM_GALLERY = 12;
    private java.util.List<com.demo.document2pdf.Room.NoteModel> notesList;
    private android.app.ProgressDialog progressDialog;
    private com.google.android.material.floatingactionbutton.FloatingActionButton fabAddNew;
    private com.google.android.material.floatingactionbutton.FloatingActionButton fabWrite;
    private com.google.android.material.floatingactionbutton.FloatingActionButton fabGallery;
    private com.google.android.material.floatingactionbutton.FloatingActionButton fabCamera;
    private boolean isFabVisible;
    @org.jetbrains.annotations.NotNull()
    public com.demo.document2pdf.Room.NotesDatabase db;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getNotesRecycler() {
        return null;
    }
    
    public final void setNotesRecycler(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
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
    
    public final void showHideFab() {
    }
    
    private final void openGallery(android.view.View it) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void initviews() {
    }
    
    private final void openCamera(android.view.View it) {
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
    
    private final void goToAddNewNoteScreen(java.lang.String resultText) {
    }
    
    @java.lang.Override()
    public void onItemClicked(int position) {
    }
    
    private final void goToEditNoteScreen(int noteId, java.lang.String noteTitle, java.lang.String noteText) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0015\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0014J\b\u0010\f\u001a\u00020\u0002H\u0014\u00a8\u0006\r"}, d2 = {"Lcom/demo/document2pdf/MainActivity$FetchNotesAsyncTask;", "Landroid/os/AsyncTask;", "", "", "Lcom/demo/document2pdf/Room/NoteModel;", "(Lcom/demo/document2pdf/MainActivity;)V", "doInBackground", "p0", "", "([Lkotlin/Unit;)Ljava/util/List;", "onPostExecute", "result", "onPreExecute", "app_debug"})
    final class FetchNotesAsyncTask extends android.os.AsyncTask<kotlin.Unit, kotlin.Unit, java.util.List<? extends com.demo.document2pdf.Room.NoteModel>> {
        
        @java.lang.Override()
        protected void onPreExecute() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlinx.coroutines.InternalCoroutinesApi()
        @java.lang.Override()
        protected java.util.List<com.demo.document2pdf.Room.NoteModel> doInBackground(@org.jetbrains.annotations.NotNull()
        kotlin.Unit... p0) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.util.List<com.demo.document2pdf.Room.NoteModel> result) {
        }
        
        public FetchNotesAsyncTask() {
            super();
        }
    }
}