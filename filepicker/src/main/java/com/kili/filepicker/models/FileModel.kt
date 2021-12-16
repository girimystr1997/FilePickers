package com.kili.filepicker.models

import android.os.Parcel
import android.os.Parcelable

data class FileModel(
    val filename: String?,
    val filepath: String?,
    val fileabsolutepath: String?,
    val displayname:String?,
    val size :Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(filename)
        dest?.writeString(fileabsolutepath)
        dest?.writeString(filepath)
        dest?.writeString(displayname)
        dest?.writeInt(size)
    }

    companion object CREATOR : Parcelable.Creator<FileModel> {
        override fun createFromParcel(parcel: Parcel): FileModel {
            return FileModel(parcel)
        }

        override fun newArray(size: Int): Array<FileModel?> {
            return arrayOfNulls(size)
        }
    }
}