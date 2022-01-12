package com.kili.filepicker.alertdialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\tB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/kili/filepicker/alertdialog/FileAlert;", "", "context", "Landroid/content/Context;", "message", "", "dialogClickListener", "Lcom/kili/filepicker/alertdialog/FileAlert$DialogClickListener;", "(Landroid/content/Context;Ljava/lang/String;Lcom/kili/filepicker/alertdialog/FileAlert$DialogClickListener;)V", "DialogClickListener", "filepicker_debug"})
public final class FileAlert {
    
    public FileAlert(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.kili.filepicker.alertdialog.FileAlert.DialogClickListener dialogClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/kili/filepicker/alertdialog/FileAlert$DialogClickListener;", "", "callback", "", "result", "", "filepicker_debug"})
    public static abstract interface DialogClickListener {
        
        public abstract void callback(boolean result);
    }
}