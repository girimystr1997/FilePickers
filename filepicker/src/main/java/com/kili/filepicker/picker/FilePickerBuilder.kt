package com.kili.filepicker.picker

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import com.kili.filepicker.utils.Variables

class FilePickerBuilder {

    fun showImages(status:Boolean):FilePickerBuilder{
        Variables.setShowImages(status)
        return this
    }

    fun showVideos(status:Boolean):FilePickerBuilder{
        Variables.setShowVideos(status)
        return this
    }

    fun showPdf(status:Boolean):FilePickerBuilder{
        Variables.setShowPdf(status)
        return this
    }
    fun videoQuality(quality:Int):FilePickerBuilder{
        Variables.setVideoQuality(quality)
        return this
    }

    fun start(context:Context,resultLauncher: ActivityResultLauncher<Intent>) {
        resultLauncher.launch(
            Intent(context, FilePicker::class.java)
        )
    }

    companion object{
        val instance:FilePickerBuilder
            get()  = FilePickerBuilder()
    }

}