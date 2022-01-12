package com.kili.filepicker.alertdialog

import android.app.Dialog
import android.content.Context
import android.view.View
import android.view.Window
import android.widget.TextView
import com.kili.filepicker.R

class FileAlert(context: Context, message: String, dialogClickListener: DialogClickListener) {
    init {
        val dialog = Dialog(context, R.style.alertdialog)
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.file_alert)
        val tvMessage = dialog.findViewById<View>(R.id.tv_message) as TextView
        tvMessage.text = message
        val btnOk: TextView = dialog.findViewById<View>(R.id.btn_ok) as TextView
        btnOk.setOnClickListener {
            dialogClickListener.callback(true)
            dialog.dismiss()
        }
        dialog.show()
    }

    interface DialogClickListener {
        fun callback(result: Boolean)
    }
}