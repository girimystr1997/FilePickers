package com.kili.filepicker.picker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0003J\b\u0010\'\u001a\u00020&H\u0003J#\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0002\u00a2\u0006\u0002\u0010,J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020.H\u0002J\b\u00100\u001a\u00020.H\u0002J\u0012\u00101\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u000103H\u0014J-\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u001b2\u0006\u00106\u001a\u000207H\u0016\u00a2\u0006\u0002\u00108J\b\u00109\u001a\u00020.H\u0003J\u0010\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020.H\u0003J\b\u0010>\u001a\u00020.H\u0003J\u0010\u0010?\u001a\u00020.2\u0006\u0010;\u001a\u00020<H\u0003R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001cR\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lcom/kili/filepicker/picker/FilePicker;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "currentPhotoPath", "", "getCurrentPhotoPath", "()Ljava/lang/String;", "setCurrentPhotoPath", "(Ljava/lang/String;)V", "currentVideoPath", "getCurrentVideoPath", "setCurrentVideoPath", "dataBinding", "Lcom/kili/filepicker/databinding/FilepickerActivityBinding;", "getDataBinding", "()Lcom/kili/filepicker/databinding/FilepickerActivityBinding;", "setDataBinding", "(Lcom/kili/filepicker/databinding/FilepickerActivityBinding;)V", "fileModel", "Lcom/kili/filepicker/models/FileModel;", "getFileModel", "()Lcom/kili/filepicker/models/FileModel;", "setFileModel", "(Lcom/kili/filepicker/models/FileModel;)V", "permissionRequestCode", "", "permissions", "", "[Ljava/lang/String;", "resultCameraLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "resultFileLauncher", "resultMediaImageLauncher", "resultMediaVideoLauncher", "resultVideoLauncher", "createImageFile", "Ljava/io/File;", "createVideoFile", "hasPermissions", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;[Ljava/lang/String;)Ljava/lang/Object;", "loadDocs", "", "loadImages", "loadVideos", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openCamera", "openGallery", "images", "", "openVideoCamera", "showBottomSheetDialog", "showBottomSheetDialogForImages", "filepicker_debug"})
public final class FilePicker extends androidx.appcompat.app.AppCompatActivity {
    public java.lang.String currentPhotoPath;
    public java.lang.String currentVideoPath;
    public com.kili.filepicker.models.FileModel fileModel;
    private final java.lang.String[] permissions = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    private final int permissionRequestCode = 101;
    public com.kili.filepicker.databinding.FilepickerActivityBinding dataBinding;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultFileLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultMediaImageLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultMediaVideoLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultCameraLauncher;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultVideoLauncher;
    
    public FilePicker() {
        super();
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.kili.filepicker.models.FileModel getFileModel() {
        return null;
    }
    
    public final void setFileModel(@org.jetbrains.annotations.NotNull()
    com.kili.filepicker.models.FileModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kili.filepicker.databinding.FilepickerActivityBinding getDataBinding() {
        return null;
    }
    
    public final void setDataBinding(@org.jetbrains.annotations.NotNull()
    com.kili.filepicker.databinding.FilepickerActivityBinding p0) {
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
    
    @android.annotation.SuppressLint(value = {"QueryPermissionsNeeded"})
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
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final java.io.File createImageFile() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final java.io.File createVideoFile() {
        return null;
    }
}