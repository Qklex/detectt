package com.demo.document2pdf.Room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\n"}, d2 = {"Lcom/demo/document2pdf/Room/NotesDao;", "", "deleteNote", "", "note", "Lcom/demo/document2pdf/Room/NoteModel;", "getMostRecentModifiedNote", "", "insertNote", "updateNote", "app_debug"})
public abstract interface NotesDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insertNote(@org.jetbrains.annotations.NotNull()
    com.demo.document2pdf.Room.NoteModel note);
    
    @androidx.room.Delete()
    public abstract void deleteNote(@org.jetbrains.annotations.NotNull()
    com.demo.document2pdf.Room.NoteModel note);
    
    @androidx.room.Update()
    public abstract void updateNote(@org.jetbrains.annotations.NotNull()
    com.demo.document2pdf.Room.NoteModel note);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from notes_table")
    public abstract java.util.List<com.demo.document2pdf.Room.NoteModel> getMostRecentModifiedNote();
}