package com.kili.filepick

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.pdf.PdfRenderer
import android.net.Uri
import android.os.Bundle
import android.os.ParcelFileDescriptor
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.kili.filepick.databinding.ActivityMainBinding
import com.kili.filepicker.models.FileModel
import com.kili.filepicker.picker.FilePickerBuilder
import java.io.File


class MainActivity : AppCompatActivity() {
    lateinit var dataBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        dataBinding.apply {
            this.lifecycleOwner = this@MainActivity
        }
        dataBinding.textView.setOnClickListener {

            FilePickerBuilder.instance
                .showImages(true)
                .showVideos(true)
                .videoQuality(0)
                .start(this, resultLauncher)
        }
    }

    var resultLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == Activity.RESULT_OK) {
                it.data?.getBundleExtra("FilePath").let { it1 ->
                    it1?.getParcelable<FileModel>("FilePath").let { fileModel ->
                        fileModel?.let { fileModel1 ->
                            when (fileModel1.displayname.toString().substringAfterLast(".")) {
                                "pdf", "PDF" -> {
                                    //pdf file
                                    val fileDescriptor = ParcelFileDescriptor.open(
                                        File(fileModel.filepath!!),
                                        ParcelFileDescriptor.MODE_READ_ONLY
                                    )
                                    val pdfRenderer = PdfRenderer(fileDescriptor)
                                    val page = pdfRenderer.openPage(0)
                                    val bitmap = Bitmap.createBitmap(
                                        page.width,
                                        page.height,
                                        Bitmap.Config.ARGB_8888
                                    )
                                    page.render(
                                        bitmap,
                                        null,
                                        null,
                                        PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY
                                    )
                                    page.close()
                                    pdfRenderer.close()
                                    dataBinding.imageView2.setImageBitmap(bitmap)
                                    dataBinding.imageView2.visibility = View.VISIBLE
                                    dataBinding.videoView2.visibility = View.GONE
                                }
                                "mp4", "3gp" -> {
                                    //video file
                                    dataBinding.imageView2.visibility = View.GONE
                                    dataBinding.videoView2.visibility = View.VISIBLE
                                    dataBinding.videoView2.setVideoPath(fileModel.filepath)
                                    dataBinding.videoView2.start()
                                }
                                else -> {
                                    //image file
                                    dataBinding.imageView2.setImageURI(Uri.fromFile(File(fileModel.filepath!!)))
                                    dataBinding.imageView2.visibility = View.VISIBLE
                                    dataBinding.videoView2.visibility = View.GONE

                                }
                            }
                        }
                    }
                }
            }
        }
}