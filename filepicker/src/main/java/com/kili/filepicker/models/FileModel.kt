package com.kili.filepicker.models

import android.net.Uri
import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.File


@Parcelize
data class FileModel(
    val filename: String?,
    val filepath: String?,
    val fileabsolutepath: String?,
    val displayname:String?,
    val size :Int,
    val file:File
):Parcelable