# FilePickers
Android Library for the Files Selector.

###  build.gradle

    implementation 'com.github.girimystr1997:FilePickers:v1.0.6'

### settings.gradle

    repositories {
        maven { url "https://jitpack.io" }
    }


### Kotlin

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

### Java

FilePickerBuilder:

    new FilePickerBuilder()
                .showImages(true)
                .showPdf(true)
                .showVideos(true)
                .videoQuality(0)
                .start(this,activityResultLauncher);
                
Callback:

    ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == Activity.RESULT_OK){
                    Bundle bundle = result.getData().getBundleExtra("FilePath");
                    FileModel fileModel = bundle.getParcelable("FilePath");
                    if (fileModel != null) {
                        if (fileModel.getDisplayname().endsWith("pdf")||fileModel.getDisplayname().endsWith("PDF")){
                            //pdf
                        }else if (fileModel.getDisplayname().endsWith("mp4")||fileModel.getDisplayname().endsWith("3gp")){
                            //videos
                        }else {
                            //images
                        }
                    }
                }
            }
        });


