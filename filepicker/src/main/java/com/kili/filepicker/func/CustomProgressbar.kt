package com.kili.filepicker.func

import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.view.Window
import com.kili.filepicker.R

class CustomProgressbar(context: Context) : Dialog(context) {
    private var mProgressbar: CustomProgressbar? = null
    private var mOnDissmissListener: DialogInterface.OnDismissListener? = null

    init {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.progress_dialog)
        this.window!!.setBackgroundDrawableResource(android.R.color.transparent)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (mOnDissmissListener != null) {
            mOnDissmissListener!!.onDismiss(this)
        }
    }

    private fun setListener(listener: DialogInterface.OnDismissListener) {
        mOnDissmissListener = listener
    }

    fun showProgress(context: Context?, cancelable: Boolean, message: String?) {
        if (mProgressbar != null && mProgressbar!!.isShowing) {
            mProgressbar!!.cancel()
        }
        mProgressbar!!.setCancelable(cancelable)
        mProgressbar!!.show()
    }

    companion object {
        private var mCustomProgressbar: CustomProgressbar? = null

        fun showProgressBar(context: Context, cancelable: Boolean) {
            try {
                if (mCustomProgressbar != null && mCustomProgressbar!!.isShowing) {
                    mCustomProgressbar!!.cancel()
                }
                mCustomProgressbar = CustomProgressbar(context)
                mCustomProgressbar!!.setCancelable(cancelable)
                mCustomProgressbar!!.show()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        fun hideProgressBar() {
            try {
                if (mCustomProgressbar != null) {
                    mCustomProgressbar!!.dismiss()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}