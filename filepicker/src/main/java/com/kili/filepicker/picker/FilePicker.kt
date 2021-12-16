package com.kili.filepicker.picker

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.FileProvider
import androidx.core.view.isVisible
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.kili.filepicker.R
import com.kili.filepicker.alertdialog.FileAlert
import com.kili.filepicker.databinding.BottomSheetDialogBinding
import com.kili.filepicker.func.Func
import com.kili.filepicker.models.FileModel
import com.kili.filepicker.utils.Variables
import java.io.File
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

class FilePicker:AppCompatActivity() {

    lateinit var dataBinding: BottomSheetDialogBinding
    lateinit var currentPhotoPath: String
    lateinit var currentVideoPath: String

    private val permissions = arrayOf(
        Manifest.permission.CAMERA,
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE,
    )
    val PERMISSION_REQUEST_CODE = 101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (hasPermissions(this, permissions) as Boolean){
            ActivityCompat.requestPermissions(
                this,
                permissions,
                PERMISSION_REQUEST_CODE
            )
        }else {
            showBottomSheetDialog()
        }
    }

    @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
    private fun showBottomSheetDialog() {

        val bottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog)
        bottomSheetDialog.setCancelable(true)
        bottomSheetDialog.setOnCancelListener {
            val intent = Intent()
            intent.putExtra("FilePath","")
            setResult(RESULT_OK,intent)
            finish()
        }
        val camera = bottomSheetDialog.findViewById<ImageView>(R.id.camera)
        val cameratxt = bottomSheetDialog.findViewById<TextView>(R.id.first)
        val video = bottomSheetDialog.findViewById<ImageView>(R.id.video)
        val videotxt = bottomSheetDialog.findViewById<TextView>(R.id.second)
        val pdf = bottomSheetDialog.findViewById<ImageView>(R.id.pdf)
        val pdftxt = bottomSheetDialog.findViewById<TextView>(R.id.third)

        if (Variables.showImages()){
            camera?.isVisible = true
            camera?.setImageDrawable(getDrawable(R.drawable.ic_photos))
            cameratxt?.isVisible = true
            cameratxt?.text = "Images"
        }else{
            camera?.isVisible = false
            cameratxt?.isVisible = false
        }
        if (Variables.showVideo()){
            video?.isVisible = true
            video?.setImageDrawable(getDrawable(R.drawable.ic_videos))
            videotxt?.isVisible = true
            videotxt?.text = "Videos"
        }else{
            video?.isVisible = false
            videotxt?.isVisible = false
        }
        if (Variables.showPdf()){
            pdf?.isVisible = true
            pdf?.setImageDrawable(getDrawable(R.drawable.ic_pdf))
            pdftxt?.isVisible = true
            pdftxt?.text = "PDF"
        }else{
            pdf?.isVisible = false
            pdftxt?.isVisible = false
        }


        camera?.setOnClickListener {
            bottomSheetDialog.dismiss()
            loadImages()
        }
        video?.setOnClickListener {
            bottomSheetDialog.dismiss()
            loadVideos()
        }
        pdf?.setOnClickListener {
            bottomSheetDialog.dismiss()
            loadDocs()
        }

        bottomSheetDialog.show()
    }

    @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
    private fun showBottomSheetDialogForImages(images: Boolean) {

        val bottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog)
        bottomSheetDialog.setCancelable(true)
        bottomSheetDialog.setOnCancelListener {
            val intent = Intent()
            intent.putExtra("FilePath","")
            setResult(RESULT_OK,intent)
            finish()
        }
        val camera = bottomSheetDialog.findViewById<ImageView>(R.id.camera)
        val cameratxt = bottomSheetDialog.findViewById<TextView>(R.id.first)
        val video = bottomSheetDialog.findViewById<ImageView>(R.id.video)
        val videotxt = bottomSheetDialog.findViewById<TextView>(R.id.second)

        if (images){
            camera?.isVisible = true
            camera?.setImageDrawable(getDrawable(R.drawable.ic_camera))
            cameratxt?.isVisible = true
            cameratxt?.text = "Camera"
            video?.isVisible = true
            video?.setImageDrawable(getDrawable(R.drawable.ic_gallery))
            videotxt?.isVisible = true
            videotxt?.text = "Gallery"

        }else{
            camera?.isVisible = true
            camera?.setImageDrawable(getDrawable(R.drawable.ic_videos))
            cameratxt?.isVisible = true
            cameratxt?.text = "Record"
            video?.isVisible = true
            video?.setImageDrawable(getDrawable(R.drawable.ic_gallery))
            videotxt?.isVisible = true
            videotxt?.text = "Gallery"
        }

        camera?.setOnClickListener {
            bottomSheetDialog.dismiss()
            if (images){
                openCamera()
            }else{
                openVideoCamera()
            }
        }
        video?.setOnClickListener {
            bottomSheetDialog.dismiss()
            if (images){
                openGallery(images)
            }else{
                openGallery(images)
            }
        }

        bottomSheetDialog.show()
    }

    private fun openGallery(images: Boolean) {
        if (images){
            resultMediaLauncher.launch(Intent().setAction(Intent.ACTION_PICK).setType("image/*"))
        }else{
            resultMediaLauncher.launch(Intent().setAction(Intent.ACTION_PICK).setType("video/*"))
        }
    }

    private fun openVideoCamera() {
        resultVideoLauncher.launch(Intent(MediaStore.ACTION_VIDEO_CAPTURE).also { tpi->
            tpi.resolveActivity(packageManager)?.also {
                val videoFile:File?= try {
                    createVideoFile()
                }catch (e: Exception){ null }
                videoFile?.also { file ->
                    val videoURI:Uri = FileProvider.getUriForFile(
                        this,
                        "$packageName.provider",
                        file
                    )
                    tpi.putExtra(MediaStore.EXTRA_VIDEO_QUALITY,Variables.videoQuality())
                    tpi.putExtra(MediaStore.EXTRA_OUTPUT,videoURI)
                }
            }
        })
    }

    @SuppressLint("QueryPermissionsNeeded")
    private fun openCamera() {
        resultCameraLauncher.launch(Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { tpi ->
            tpi.resolveActivity(packageManager)?.also {
                val photoFile:File?=try {
                    createImageFile()
                }catch (e:Exception){null}
                photoFile?.also { file ->
                    val photoURI: Uri = FileProvider.getUriForFile(
                        this,
                        "$packageName.provider",
                        file
                    )
                    tpi.putExtra(MediaStore.EXTRA_OUTPUT,photoURI)
                }
            }
        })
    }


    private fun loadDocs() {
        resultFileLauncher.launch(Intent().setAction(Intent.ACTION_GET_CONTENT).setType("application/pdf"))
    }

    private fun loadVideos() {
        showBottomSheetDialogForImages(false)
    }

    private fun loadImages() {
        showBottomSheetDialogForImages(true)
    }

    private fun hasPermissions(activity: Activity, permissions: Array<String>): Any {

        for (item in permissions){
            if (ActivityCompat.checkSelfPermission(activity, item)!= PackageManager.PERMISSION_GRANTED){
                return true
            }
        }
        return false
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode) {
            PERMISSION_REQUEST_CODE -> {
                if (grantResults.isEmpty()
                    || grantResults[0] != PackageManager.PERMISSION_GRANTED ||
                    grantResults[1] != PackageManager.PERMISSION_GRANTED ||
                    grantResults[2] != PackageManager.PERMISSION_GRANTED
                ) {
                    FileAlert(this,"Need All Permissions",object : FileAlert.DialogClickListener {
                        override fun callback(result: Boolean) {
                            if (result){
                                ActivityCompat.requestPermissions(
                                    this@FilePicker,
                                    permissions,
                                    PERMISSION_REQUEST_CODE
                                )
                            }
                        }

                    })

                } else {
                    showBottomSheetDialog()
                }
            }
        }
    }

    var resultFileLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        when (it.resultCode) {
            Activity.RESULT_OK -> {
                if (it.data != null){
                    val data:Intent = it.data!!
                    val uridata: Uri? = data.data
                    uridata.let { uri ->
                        if (uri!=null){
                            val path = Func().getCreatedPath(this,uri)
                            val intent = Intent()
                            val bundle = Bundle()
                            bundle.putParcelable("FilePath",path)
                            intent.putExtra("FilePath",bundle)
                            setResult(RESULT_OK,intent)
                            finish()
                        }
                    }
                }
            }
            else->{
                val intent = Intent()
                intent.putExtra("FilePath","")
                setResult(RESULT_OK,intent)
                finish()
            }
        }
    }

    var resultMediaLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        when (it.resultCode) {
            Activity.RESULT_OK -> {
                if (it.data != null){
                    val data:Intent = it.data!!
                    val uridata: Uri? = data.data
                    uridata.let { uri ->
                        if (uri!=null){
                            val path = Func().getPath(this,uri)
                            val filee = File(path!!)
                            val fileModel = FileModel(filee.name,filee.path,filee.absolutePath,filee.name,0)
                            val intent = Intent()
                            val bundle = Bundle()
                            bundle.putParcelable("FilePath",fileModel)
                            intent.putExtra("FilePath",bundle)
                            setResult(RESULT_OK,intent)
                            finish()
                        }
                    }
                }
            }
            else->{
                val intent = Intent()
                intent.putExtra("FilePath","")
                setResult(RESULT_OK,intent)
                finish()
            }
        }
    }

    var resultCameraLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        when (it.resultCode) {
            Activity.RESULT_OK -> {
                if (it.data != null){
                    val filee = File(currentPhotoPath)
                    val fileModel = FileModel(filee.name,filee.path,filee.absolutePath,filee.name,0)
                    val intent = Intent()
                    val bundle = Bundle()
                    bundle.putParcelable("FilePath",fileModel)
                    intent.putExtra("FilePath",bundle)
                    setResult(RESULT_OK,intent)
                    finish()
                }
            }
            else->{
                val intent = Intent()
                intent.putExtra("FilePath","")
                setResult(RESULT_OK,intent)
                finish()
            }
        }
    }

    var resultVideoLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        when (it.resultCode) {
            Activity.RESULT_OK -> {
                if (it.data != null){
                    val filee = File(currentVideoPath)
                    val fileModel = FileModel(filee.name,filee.path,filee.absolutePath,filee.name,0)
                    val intent = Intent()
                    val bundle = Bundle()
                    bundle.putParcelable("FilePath",fileModel)
                    intent.putExtra("FilePath",bundle)
                    setResult(RESULT_OK,intent)
                    finish()
                }
            }
            else->{
                val intent = Intent()
                intent.putExtra("FilePath","")
                setResult(RESULT_OK,intent)
                finish()
            }
        }
    }



    private fun createImageFile(): File {
        val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        val storageDir: File = getExternalFilesDir(Environment.DIRECTORY_DCIM)!!
        return File.createTempFile(
            "JPEG_${timeStamp}_", /* prefix */
            ".jpg", /* suffix */
            storageDir /* directory */
        ).apply {
            currentPhotoPath = absolutePath
        }
    }

    private fun createVideoFile(): File {
        val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        val storageDir: File = getExternalFilesDir(Environment.DIRECTORY_DCIM)!!
        return File.createTempFile(
            "MP4${timeStamp}_", /* prefix */
            ".mp4", /* suffix */
            storageDir /* directory */
        ).apply {
            currentVideoPath = absolutePath
        }
    }




}