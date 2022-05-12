package com.demo.document2pdf;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0015J\u0012\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\"H\u0002J\b\u0010.\u001a\u00020\"H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d\u00a8\u0006/"}, d2 = {"Lcom/demo/document2pdf/EditNoteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "db", "Lcom/demo/document2pdf/Room/NotesDatabase;", "getDb", "()Lcom/demo/document2pdf/Room/NotesDatabase;", "setDb", "(Lcom/demo/document2pdf/Room/NotesDatabase;)V", "etNoteText", "Landroid/widget/EditText;", "getEtNoteText", "()Landroid/widget/EditText;", "setEtNoteText", "(Landroid/widget/EditText;)V", "etNoteTitle", "getEtNoteTitle", "setEtNoteTitle", "noteId", "", "getNoteId", "()I", "setNoteId", "(I)V", "noteText", "", "getNoteText", "()Ljava/lang/String;", "setNoteText", "(Ljava/lang/String;)V", "noteTitle", "getNoteTitle", "setNoteTitle", "deleteNote", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "shareNote", "updateNote", "app_debug"})
public final class EditNoteActivity extends androidx.appcompat.app.AppCompatActivity {
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