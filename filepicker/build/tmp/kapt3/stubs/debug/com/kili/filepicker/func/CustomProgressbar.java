package com.kili.filepicker.func;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\"\u0010\f\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/kili/filepicker/func/CustomProgressbar;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mOnDissmissListener", "Landroid/content/DialogInterface$OnDismissListener;", "mProgressbar", "onBackPressed", "", "setListener", "listener", "showProgress", "cancelable", "", "message", "", "Companion", "filepicker_debug"})
public final class CustomProgressbar extends android.app.Dialog {
    private com.kili.filepicker.func.CustomProgressbar mProgressbar;
    private android.content.DialogInterface.OnDismissListener mOnDissmissListener;
    @org.jetbrains.annotations.NotNull()
    public static final com.kili.filepicker.func.CustomProgressbar.Companion Companion = null;
    private static com.kili.filepicker.func.CustomProgressbar mCustomProgressbar;
    
    public CustomProgressbar(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void setListener(android.content.DialogInterface.OnDismissListener listener) {
    }
    
    public final void showProgress(@org.jetbrains.annotations.Nullable()
    android.content.Context context, boolean cancelable, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/kili/filepicker/func/CustomProgressbar$Companion;", "", "()V", "mCustomProgressbar", "Lcom/kili/filepicker/func/CustomProgressbar;", "hideProgressBar", "", "showProgressBar", "context", "Landroid/content/Context;", "cancelable", "", "filepicker_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void showProgressBar(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean cancelable) {
        }
        
        public final void hideProgressBar() {
        }
    }
}