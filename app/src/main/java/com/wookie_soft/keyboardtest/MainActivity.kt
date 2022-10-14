package com.wookie_soft.keyboardtest

import android.graphics.Rect
import android.graphics.RectF
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.*
import android.view.inputmethod.InputMethod
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.wookie_soft.keyboardtest.databinding.ActivityMainBinding
import com.wookie_soft.keyboardtest.databinding.PopupViewBinding
import kotlinx.coroutines.*
import kotlin.concurrent.timer


class MainActivity : AppCompatActivity() , View.OnTouchListener {


    lateinit var popupView: View

    // val popupView: View = layoutInflater.inflate(R.layout.popup_view, null)
    lateinit var popupWindow: PopupWindow
    val coroutineScope = CoroutineScope(Dispatchers.IO)
    var timerJob: Job = Job()
    var timerCount = 0L
    var isActive = false

    val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var popupViewBinding: PopupViewBinding
    val viewModel by lazy { MyViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        G.fixText = "ppp"

        popupView = LayoutInflater.from(this).inflate(R.layout.popup_view, GridLayout(this))
        popupViewBinding = PopupViewBinding.bind(popupView)


        popupWindow = PopupWindow(popupViewBinding.root)
        popupWindow.isFocusable = true

        binding.btn.setOnTouchListener(this)


        popupWindow.setOnDismissListener {
            binding.et.append(G.fixText)
        }

//        binding.btn.setOnLongClickListener {
//
//            clickLong()
//
//            true
//        }


    }


    fun clickLong() {
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
//            btn2.setOnClickListener {
//                binding.et.text.append("ddd")
//                popupWindow.dismiss()
//            }
//            btn3.setOnClickListener {
//                binding.et.text.append("ddd")
//                popupWindow.dismiss()
//            }

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

    fun shoPopWindow() {
        popupWindow.apply {
            if (isShowing) {
                update(
                    40,
                    0,
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
            } else {
                width = ViewGroup.LayoutParams.WRAP_CONTENT
                height = ViewGroup.LayoutParams.WRAP_CONTENT
                isOutsideTouchable = true
                showAtLocation(binding.btn, Gravity.CENTER, 0, 0)
            }

        }
    }


    override fun onTouch(v: View?, event: MotionEvent?): Boolean {

        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                timerJob = coroutineScope.launch {
                    delay(1500L)
                   // shoPopWindow()
                    Log.i("ddd","dddddddddddd")


                }
                clickLong()

                }
            MotionEvent.ACTION_UP -> {
                Log.i("뗌 ㅇㅇㅇㅇ", "${event.eventTime}")

                popupWindow.dismiss()
            }


        }
        return true
    }


//
//    private fun get_letter( x : Float, y : Float) : String{
//        if(is_contain(x, y, btn1)) return btn1.getText();
//        else if(is_contain(x, y, btn2)) return btn2.getText();
//        else if(is_contain(x, y, btn3)) return btn3.getText();
//        else if(is_contain(x, y, btn4)) return btn4.getText();
//        else return "";
//    }
//
//    private fun is_contain(x : Float, y : Float, view : Button) : Boolean{
//        var rect : RectF = RectF();
//        var
//        view.getHitRect()
//        view.getHitRect(rect);
//        return rect..contains((int)x, (int)y);
//    }

}

private fun Button.setOnTouchListener() {

}




