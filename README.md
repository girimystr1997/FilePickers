# FilePickers
Android Library for the Files Selector.

//for Kotlin
FilePickerBuilder.instance
                .showImages(true)
                .showVideos(true)
                .showPdf(true)
                .videoQuality(0)
                .start(this,resultLauncher)



var resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode == Activity.RESULT_OK) {
            it.data?.getBundleExtra("FilePath").let { it1 ->
                it1?.getParcelable<FileModel>("FilePath").let { fileModel ->
                    fileModel?.let { fileModel1 ->
                        when(fileModel1.displayname.toString().substringAfterLast(".")){
                            "pdf", "PDF" -> {
                                //pdf file
                            }
                            "mp4", "3gp" -> {
                                //video file
                            }
                            else ->{
                                //image file
                            }
                        }
                    }
                }
            }
        }
    }
![Screenshot from 2021-12-16 13-08-23](https://user-images.githubusercontent.com/30863310/146371662-9f5223ac-7a81-416e-b970-36bce311458e.png)

