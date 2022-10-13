package com.wookie_soft.keyboardtest

import android.inputmethodservice.InputMethodService
import android.view.View
import android.widget.Button
import android.widget.PopupWindow
import androidx.core.widget.PopupWindowCompat
import java.security.Key
import java.text.FieldPosition

class MyKey : InputMethodService() , View.OnClickListener, View.OnLongClickListener {


    private val myKeyView: View = layoutInflater.inflate(R.layout.my_keyboard, null)
    val popupView: View = layoutInflater.inflate(R.layout.popup_view, null)
    val popupWindow = PopupWindow(this)

    override fun onCreateInputView(): View {

        val btn: Button = myKeyView.findViewById(R.id.btn)
        popupWindow.contentView = popupView

        btn.setOnClickListener(this)
        btn.setOnLongClickListener(this)


        return myKeyView
    }

    // just typing
    override fun onClick(v: View?) {
        val inputConnection = currentInputConnection


    }

    // show popup-window
    override fun onLongClick(v: View?): Boolean {

        if (popupWindow.isShowing) {
            popupWindow.update()



            return false
        }

        fun showPopupWindow(key: Key, position: Int) {


        }

        return true
    }

}