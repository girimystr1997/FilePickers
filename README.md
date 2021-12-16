# FilePickers
Android Library for the Files Selector.

//for Kotlin

FilePickerBuilder:
                
    FilePickerBuilder.instance
                .showImages(true)
                .showVideos(true)
                .showPdf(true)
                .videoQuality(0)
                .start(this,resultLauncher)

Callback:

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

