package com.kili.filepicker.picker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J#\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H\u0002\u00a2\u0006\u0002\u00101J\b\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u000203H\u0002J\b\u00105\u001a\u000203H\u0002J\u0012\u00106\u001a\u0002032\b\u00107\u001a\u0004\u0018\u000108H\u0014J-\u00109\u001a\u0002032\u0006\u0010:\u001a\u00020\u00042\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00172\u0006\u0010;\u001a\u00020<H\u0016\u00a2\u0006\u0002\u0010=J\b\u0010>\u001a\u000203H\u0003J\u0010\u0010?\u001a\u0002032\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u000203H\u0002J\b\u0010C\u001a\u000203H\u0003J\u0010\u0010D\u001a\u0002032\u0006\u0010@\u001a\u00020AH\u0003R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0017X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018R(\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010!\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R(\u0010$\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R(\u0010\'\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 \u00a8\u0006E"}, d2 = {"Lcom/kili/filepicker/picker/FilePicker;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "PERMISSION_REQUEST_CODE", "", "getPERMISSION_REQUEST_CODE", "()I", "currentPhotoPath", "", "getCurrentPhotoPath", "()Ljava/lang/String;", "setCurrentPhotoPath", "(Ljava/lang/String;)V", "currentVideoPath", "getCurrentVideoPath", "setCurrentVideoPath", "dataBinding", "Lcom/kili/filepicker/databinding/BottomSheetDialogBinding;", "getDataBinding", "()Lcom/kili/filepicker/databinding/BottomSheetDialogBinding;", "setDataBinding", "(Lcom/kili/filepicker/databinding/BottomSheetDialogBinding;)V", "permissions", "", "[Ljava/lang/String;", "resultCameraLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "getResultCameraLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setResultCameraLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "resultFileLauncher", "getResultFileLauncher", "setResultFileLauncher", "resultMediaLauncher", "getResultMediaLauncher", "setResultMediaLauncher", "resultVideoLauncher", "getResultVideoLauncher", "setResultVideoLauncher", "createImageFile", "Ljava/io/File;", "createVideoFile", "hasPermissions", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;[Ljava/lang/String;)Ljava/lang/Object;", "loadDocs", "", "loadImages", "loadVideos", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openCamera", "openGallery", "images", "", "openVideoCamera", "showBottomSheetDialog", "showBottomSheetDialogForImages", "filepicker_debug"})
public final class FilePicker extends androidx.appcompat.app.AppCompatActivity {
    public com.kili.filepicker.databinding.BottomSheetDialogBinding dataBinding;
    public java.lang.String currentPhotoPath;
    public java.lang.String currentVideoPath;
    private final java.lang.String[] permissions = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    private final int PERMISSION_REQUEST_CODE = 101;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultFileLauncher;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultMediaLauncher;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultCameraLauncher;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultVideoLauncher;
    
    public FilePicker() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kili.filepicker.databinding.BottomSheetDialogBinding getDataBinding() {
        return null;
    }
    
    public final void setDataBinding(@org.jetbrains.annotations.NotNull()
    com.kili.filepicker.databinding.BottomSheetDialogBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentPhotoPath() {
        return null;
    }
    
    public final void setCurrentPhotoPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentVideoPath() {
        return null;
    }
    
    public final void setCurrentVideoPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPERMISSION_REQUEST_CODE() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n", "UseCompatLoadingForDrawables"})
    private final void showBottomSheetDialog() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n", "UseCompatLoadingForDrawables"})
    private final void showBottomSheetDialogForImages(boolean images) {
    }
    
    private final void openGallery(boolean images) {
    }
    
    private final void openVideoCamera() {
    }
    
    @android.annotation.SuppressLint(value = {"QueryPermissionsNeeded"})
    private final void openCamera() {
    }
    
    private final void loadDocs() {
    }
    
    private final void loadVideos() {
    }
    
    private final void loadImages() {
    }
    
    private final java.lang.Object hasPermissions(android.app.Activity activity, java.lang.String[] permissions) {
        return null;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getResultFileLauncher() {
        return null;
    }
    
    public final void setResultFileLauncher(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getResultMediaLauncher() {
        return null;
    }
    
    public final void setResultMediaLauncher(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getResultCameraLauncher() {
        return null;
    }
    
    public final void setResultCameraLauncher(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getResultVideoLauncher() {
        return null;
    }
    
    public final void setResultVideoLauncher(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> p0) {
    }
    
    private final java.io.File createImageFile() {
        return null;
    }
    
    private final java.io.File createVideoFile() {
        return null;
    }
}