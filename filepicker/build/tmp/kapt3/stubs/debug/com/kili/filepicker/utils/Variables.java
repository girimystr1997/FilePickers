package com.kili.filepicker.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/kili/filepicker/utils/Variables;", "", "()V", "showImages", "", "showPdf", "showVideos", "videoQuality", "", "setShowImages", "", "setShowPdf", "setShowVideos", "setVideoQuality", "quality", "showVideo", "filepicker_debug"})
public final class Variables {
    @org.jetbrains.annotations.NotNull()
    public static final com.kili.filepicker.utils.Variables INSTANCE = null;
    private static boolean showVideos = false;
    private static boolean showImages = false;
    private static boolean showPdf = false;
    private static int videoQuality = 0;
    
    private Variables() {
        super();
    }
    
    public final boolean showVideo() {
        return false;
    }
    
    public final void setShowVideos(boolean showVideos) {
    }
    
    public final boolean showImages() {
        return false;
    }
    
    public final void setShowImages(boolean showImages) {
    }
    
    public final boolean showPdf() {
        return false;
    }
    
    public final void setShowPdf(boolean showPdf) {
    }
    
    public final int videoQuality() {
        return 0;
    }
    
    public final void setVideoQuality(int quality) {
    }
}