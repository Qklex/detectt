package com.demo.document2pdf;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001b\u001cB\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/demo/document2pdf/NoteListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/demo/document2pdf/NoteListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "noteList", "", "Lcom/demo/document2pdf/Room/NoteModel;", "(Landroid/content/Context;Ljava/util/List;)V", "activity", "Lcom/demo/document2pdf/NoteListAdapter$ItemClicked;", "getActivity", "()Lcom/demo/document2pdf/NoteListAdapter$ItemClicked;", "getContext", "()Landroid/content/Context;", "getNoteList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemClicked", "ViewHolder", "app_debug"})
public final class NoteListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.demo.document2pdf.NoteListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.demo.document2pdf.NoteListAdapter.ItemClicked activity = null;
    @org.jetbrains.annotations.Nullable()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.demo.document2pdf.Room.NoteModel> noteList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.document2pdf.NoteListAdapter.ItemClicked getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.demo.document2pdf.NoteListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.demo.document2pdf.NoteListAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.demo.document2pdf.Room.NoteModel> getNoteList() {
        return null;
    }
    
    public NoteListAdapter(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.util.List<com.demo.document2pdf.Room.NoteModel> noteList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/demo/document2pdf/NoteListAdapter$ItemClicked;", "", "onItemClicked", "", "position", "", "app_debug"})
    public static abstract interface ItemClicked {
        
        public abstract void onItemClicked(int position);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/demo/document2pdf/NoteListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/demo/document2pdf/NoteListAdapter;Landroid/view/View;)V", "tvNoteText", "Landroid/widget/TextView;", "getTvNoteText", "()Landroid/widget/TextView;", "tvNoteTitle", "getTvNoteTitle", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvNoteTitle = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvNoteText = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvNoteTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvNoteText() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}