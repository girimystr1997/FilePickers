package com.kili.filepicker.utils

object Variables {
    private var showVideos: Boolean = false
    private var showImages: Boolean = false
    private var showPdf: Boolean = false
    private var videoQuality: Int = 0


    fun showVideo(): Boolean {
        return showVideos
    }

    fun setShowVideos(showVideos: Boolean) {
        this.showVideos = showVideos
    }

    fun showImages(): Boolean {
        return showImages
    }

    fun setShowImages(showImages: Boolean) {
        this.showImages = showImages
    }

    fun showPdf(): Boolean {
        return showPdf
    }

    fun setShowPdf(showPdf: Boolean) {
        this.showPdf = showPdf
    }

    fun videoQuality(): Int {
        return videoQuality
    }

    fun setVideoQuality(quality: Int) {
        this.videoQuality = quality
    }


}