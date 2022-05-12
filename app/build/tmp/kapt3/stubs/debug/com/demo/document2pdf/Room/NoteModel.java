package com.demo.document2pdf.Room;

import java.lang.System;

@androidx.room.Entity(tableName = "notes_table")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/demo/document2pdf/Room/NoteModel;", "", "()V", "id", "", "getId", "()I", "setId", "(I)V", "noteText", "", "getNoteText", "()Ljava/lang/String;", "setNoteText", "(Ljava/lang/String;)V", "noteTitle", "getNoteTitle", "setNoteTitle", "app_debug"})
public final class NoteModel {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String noteTitle;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String noteText;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNoteTitle() {
        return null;
    }
    
    public final void setNoteTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNoteText() {
        return null;
    }
    
    public final void setNoteText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public NoteModel() {
        super();
    }
}