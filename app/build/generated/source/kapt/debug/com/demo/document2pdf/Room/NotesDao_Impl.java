package com.demo.document2pdf.Room;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NotesDao_Impl implements NotesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NoteModel> __insertionAdapterOfNoteModel;

  private final EntityDeletionOrUpdateAdapter<NoteModel> __deletionAdapterOfNoteModel;

  private final EntityDeletionOrUpdateAdapter<NoteModel> __updateAdapterOfNoteModel;

  public NotesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNoteModel = new EntityInsertionAdapter<NoteModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `notes_table` (`id`,`noteTitle`,`noteText`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getNoteTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNoteTitle());
        }
        if (value.getNoteText() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNoteText());
        }
      }
    };
    this.__deletionAdapterOfNoteModel = new EntityDeletionOrUpdateAdapter<NoteModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `notes_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteModel value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfNoteModel = new EntityDeletionOrUpdateAdapter<NoteModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `notes_table` SET `id` = ?,`noteTitle` = ?,`noteText` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getNoteTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNoteTitle());
        }
        if (value.getNoteText() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNoteText());
        }
        stmt.bindLong(4, value.getId());
      }
    };
  }

  @Override
  public void insertNote(final NoteModel note) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNoteModel.insert(note);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteNote(final NoteModel note) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfNoteModel.handle(note);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateNote(final NoteModel note) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfNoteModel.handle(note);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<NoteModel> getMostRecentModifiedNote() {
    final String _sql = "SELECT `notes_table`.`id` AS `id`, `notes_table`.`noteTitle` AS `noteTitle`, `notes_table`.`noteText` AS `noteText` from notes_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNoteTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "noteTitle");
      final int _cursorIndexOfNoteText = CursorUtil.getColumnIndexOrThrow(_cursor, "noteText");
      final List<NoteModel> _result = new ArrayList<NoteModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final NoteModel _item;
        _item = new NoteModel();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpNoteTitle;
        _tmpNoteTitle = _cursor.getString(_cursorIndexOfNoteTitle);
        _item.setNoteTitle(_tmpNoteTitle);
        final String _tmpNoteText;
        _tmpNoteText = _cursor.getString(_cursorIndexOfNoteText);
        _item.setNoteText(_tmpNoteText);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
