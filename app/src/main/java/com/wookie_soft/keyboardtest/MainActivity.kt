package com.wookie_soft.keyboardtest

import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.*
import android.view.inputmethod.InputConnection
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.wookie_soft.keyboardtest.databinding.ActivityMainBinding
import com.wookie_soft.keyboardtest.databinding.PopupViewBinding


class MainActivity : AppCompatActivity() , View.OnTouchListener {



    lateinit var popupView: View
    // val popupView: View = layoutInflater.inflate(R.layout.popup_view, null)
    lateinit var popupWindow : PopupWindow


    val binding : ActivityMainBinding by lazy { ActivityMainBinding.inflate( layoutInflater ) }
    lateinit var popupViewBinding : PopupViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        G.fixText = "ppp"

         popupView = LayoutInflater.from(this).inflate(R.layout.popup_view, GridLayout(this))
        popupViewBinding = PopupViewBinding.bind( popupView )


        popupWindow = PopupWindow(popupViewBinding.root)

        binding.btn.setOnClickListener {
            binding.et.append(G.fixText)
        }

        binding.btn.setOnLongClickListener{
            clickLong()

            true
        }

        binding.btn.setOnTouchListener(this)

    }


    fun clickLong(){
       // popupWindow.contentView = popupView
        //https://stackoverflow.com/questions/29390175/android-custom-keyboard-popup-keyboard-on-long-press



       shoPopWindow()

        popupViewBinding.apply {
            btn1.setOnClickListener {
                binding.et.text.append("ddd")
                G.fixText = "ddd"
                binding.btn.text = G.fixText
                popupWindow.dismiss()
            }
            btn2.setOnClickListener {
                binding.et.text.append("ddd")
                popupWindow.dismiss()
            }
            btn3.setOnClickListener {
                binding.et.text.append("ddd")
                popupWindow.dismiss()
            }
            btn4.setOnClickListener {
                binding.et.text.append("ddd")
                popupWindow.dismiss()
            }
            btn5.setOnClickListener {
                binding.et.text.append("ddd")
                popupWindow.dismiss()
            }
            btn6.setOnClickListener {
                binding.et.text.append("ddd")
                popupWindow.dismiss()
            }
            btn7.setOnClickListener {
                binding.et.text.append("ddd")
                popupWindow.dismiss()
            }
            btn8.setOnClickListener {
                binding.et.text.append("ddd")
                popupWindow.dismiss()
            }
            btn9.setOnClickListener {

            }
        }

    }// long click

    fun shoPopWindow(){
        popupWindow.apply {
            if (isShowing){
                update(40,0,ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT)
            } else {
                width = ViewGroup.LayoutParams.WRAP_CONTENT
                height = ViewGroup.LayoutParams.WRAP_CONTENT
                isOutsideTouchable = true
                showAtLocation(binding.btn,Gravity.CENTER,0,0)
            }

        }
    }

    var t : Long = 0L
    override fun onTouch(v: View?, event: MotionEvent?): Boolean {

        when( event?.action){
            MotionEvent.ACTION_DOWN -> {
                Log.i("ddd","ddddddddddddd")
            }
            MotionEvent.ACTION_UP -> {
                Log.i("뗌 ㅇㅇㅇㅇ","${event.eventTime}")

                if (event.eventTime < 26167938) Log.i("짧클ㄹㄹㄹㄹㄹㄹ","ㅉㅉㅉㅉ클ㄹㄹㄹㄹㄹㄹ")
                else Log.i("롱클ㄹㄹㄹㄹㄹㄹ","롱클ㄹㄹㄹㄹㄹㄹ")
            }
        }



        return true
    }
}