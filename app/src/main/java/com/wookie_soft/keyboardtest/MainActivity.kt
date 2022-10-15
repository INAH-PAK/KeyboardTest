package com.wookie_soft.keyboardtest

import android.os.Bundle
import android.util.Log
import android.view.*
import android.view.GestureDetector.*
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.wookie_soft.keyboardtest.databinding.ActivityMainBinding
import com.wookie_soft.keyboardtest.databinding.PopupViewBinding



class MainActivity : AppCompatActivity() , View.OnLongClickListener {

    lateinit var popupView: View
    // val popupView: View = layoutInflater.inflate(R.layout.popup_view, null)
    lateinit var popupWindow : PopupWindow
    var TOUCH_UP_STATE : MotionEventUpState = MotionEventUpState.NONE

    val binding : ActivityMainBinding by lazy { ActivityMainBinding.inflate( layoutInflater ) }
    lateinit var popupViewBinding : PopupViewBinding
    var isLong : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        G.fixText = "CLICK"

         popupView = LayoutInflater.from(this).inflate(R.layout.popup_view, GridLayout(this))
        popupViewBinding = PopupViewBinding.bind( popupView )


        popupWindow = PopupWindow(popupViewBinding.root)

        val popup = binding.popup.root




        binding.btn.setOnClickListener {
            isLong = 0
            Log.i("dddddddddddddd","한번만 클릭ㄱㄱㄱㄱㄱㄱㄱㄱㄱ") }
        binding.btn.setOnLongClickListener(this)



    }

    override fun onLongClick(v: View?): Boolean {
        isLong = 1
        return false
    }


    // 화면 전체 터치
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {

        if (isLong == 1) {


            // 화면 전체

            Log.i("fff", "${ev!!.x}    ${ev.y}    ")
            var btnWidth = binding.btn.width
            var btnHight = binding.btn.height
            var bntXY = IntArray(2)
            binding.btn.getLocationOnScreen(bntXY)

            var pop1XY = IntArray(2)
            var pop1Width = binding.popup.btn1.width
            var pop1Hight = binding.popup.btn1.height
            binding.popup.btn1.getLocationOnScreen(pop1XY)

            var pop2XY = IntArray(2)
            var pop2Width = binding.popup.btn2.width
            var pop2Hight = binding.popup.btn2.height
            binding.popup.btn2.getLocationOnScreen(pop2XY)

            var pop3XY = IntArray(2)
            var pop3Width = binding.popup.btn3.width
            var pop3Hight = binding.popup.btn3.height
            binding.popup.btn3.getLocationOnScreen(pop3XY)

            var pop4XY = IntArray(2)
            var pop4Width = binding.popup.btn4.width
            var pop4Hight = binding.popup.btn4.height
            binding.popup.btn4.getLocationOnScreen(pop4XY)

            var pop5XY = IntArray(2)
            var pop5Width = binding.popup.btn5.width
            var pop5Hight = binding.popup.btn5.height
            binding.popup.btn5.getLocationOnScreen(pop5XY)

            var pop6XY = IntArray(2)
            var pop6Width = binding.popup.btn6.width
            var pop6Hight = binding.popup.btn6.height
            binding.popup.btn6.getLocationOnScreen(pop6XY)

            var pop7XY = IntArray(2)
            var pop7Width = binding.popup.btn7.width
            var pop7Hight = binding.popup.btn7.height
            binding.popup.btn7.getLocationOnScreen(pop7XY)

            var pop8XY = IntArray(2)
            var pop8Width = binding.popup.btn8.width
            var pop8Hight = binding.popup.btn8.height
            binding.popup.btn8.getLocationOnScreen(pop8XY)

            var pop9XY = IntArray(2)
            var pop9Width = binding.popup.btn9.width
            var pop9Hight = binding.popup.btn9.height
            binding.popup.btn9.getLocationOnScreen(pop9XY)

            var pop10XY = IntArray(2)
            var pop10Width = binding.popup.btn10.width
            var pop10Hight = binding.popup.btn10.height
            binding.popup.btn10.getLocationOnScreen(pop10XY)

            when (ev!!.action) {

                MotionEvent.ACTION_MOVE, MotionEvent.ACTION_DOWN -> {

                    if ((bntXY[0] <= ev.x) && (ev.x <= bntXY[0] + btnWidth) && (bntXY[1] <= ev.y) && (ev.y <= bntXY[1] + btnHight)) {
                        // 버튼 클릭시.
                        binding.popup.root.visibility = View.VISIBLE
                    }

                    if ((pop1XY[0] <= ev.x) && (ev.x <= pop1XY[0] + pop1Hight) && (pop1XY[1] <= ev.y) && (ev.y <= pop1XY[1] + pop1Hight)) {

                        G.fixText = binding.popup.btn1.text.toString()
                        TOUCH_UP_STATE = MotionEventUpState.BUTTON_1
                        Log.i("BYN", "POP 1 View")

                    } else if ((pop2XY[0] <= ev.x) && (ev.x <= pop2XY[0] + pop2Hight) && (pop2XY[1] <= ev.y) && (ev.y <= pop2XY[1] + pop2Hight)) {

                        G.fixText = binding.popup.btn2.text.toString()
                        TOUCH_UP_STATE = MotionEventUpState.BUTTON_2
                        Log.i("BYN", "POP2 View")

                    } else if ((pop3XY[0] <= ev.x) && (ev.x <= pop3XY[0] + pop3Hight) && (pop3XY[1] <= ev.y) && (ev.y <= pop3XY[1] + pop3Hight)) {
                        // 첫 번째 팝업 클릭
                        G.fixText = binding.popup.btn3.text.toString()
                        TOUCH_UP_STATE = MotionEventUpState.BUTTON_3
                    } else if ((pop4XY[0] <= ev.x) && (ev.x <= pop4XY[0] + pop4Hight) && (pop4XY[1] <= ev.y) && (ev.y <= pop4XY[1] + pop4Hight)) {
                        // 첫 번째 팝업 클릭
                        G.fixText = binding.popup.btn4.text.toString()
                        TOUCH_UP_STATE = MotionEventUpState.BUTTON_4
                    } else if ((pop5XY[0] <= ev.x) && (ev.x <= pop5XY[0] + pop5Hight) && (pop5XY[1] <= ev.y) && (ev.y <= pop5XY[1] + pop5Hight)) {
                        // 첫 번째 팝업 클릭
                        G.fixText = binding.popup.btn5.text.toString()
                        TOUCH_UP_STATE = MotionEventUpState.BUTTON_5
                    } else if ((pop6XY[0] <= ev.x) && (ev.x <= pop6XY[0] + pop6Hight) && (pop6XY[1] <= ev.y) && (ev.y <= pop6XY[1] + pop6Hight)) {
                        // 첫 번째 팝업 클릭
                        G.fixText = binding.popup.btn6.text.toString()
                        TOUCH_UP_STATE = MotionEventUpState.BUTTON_6
                    } else if ((pop7XY[0] <= ev.x) && (ev.x <= pop7XY[0] + pop7Hight) && (pop7XY[1] <= ev.y) && (ev.y <= pop7XY[1] + pop7Hight)) {
                        // 첫 번째 팝업 클릭
                        G.fixText = binding.popup.btn7.text.toString()
                        TOUCH_UP_STATE = MotionEventUpState.BUTTON_7
                    } else if ((pop8XY[0] <= ev.x) && (ev.x <= pop8XY[0] + pop1Hight) && (pop8XY[1] <= ev.y) && (ev.y <= pop8XY[1] + pop8Hight)) {
                        // 첫 번째 팝업 클릭
                        G.fixText = binding.popup.btn8.text.toString()
                        TOUCH_UP_STATE = MotionEventUpState.BUTTON_8
                    } else if ((pop9XY[0] <= ev.x) && (ev.x <= pop9XY[0] + pop9Hight) && (pop9XY[1] <= ev.y) && (ev.y <= pop9XY[1] + pop9Hight)) {
                        // 첫 번째 팝업 클릭
                        G.fixText = binding.popup.btn9.text.toString()
                        TOUCH_UP_STATE = MotionEventUpState.BUTTON_9
                    } else if ((pop10XY[0] <= ev.x) && (ev.x <= pop10XY[0] + pop10Hight) && (pop10XY[1] <= ev.y) && (ev.y <= pop10XY[1] + pop10Hight)) {
                        // 첫 번째 팝업 클릭
                        G.fixText = binding.popup.btn1.text.toString()
                        TOUCH_UP_STATE = MotionEventUpState.BUTTON_10
                    }

                }

                MotionEvent.ACTION_UP -> {
                    isLong = 0
                    when (TOUCH_UP_STATE) {
                        MotionEventUpState.BUTTON_1 -> {
                            binding.et.text.append(binding.popup.btn1.text.toString())
                            binding.btn.text = G.fixText
                            binding.popup.root.visibility = View.INVISIBLE
                        }
                        MotionEventUpState.BUTTON_2 -> {
                            binding.et.text.append(binding.popup.btn2.text.toString())
                            binding.btn.text = G.fixText
                            binding.popup.root.visibility = View.INVISIBLE

                        }
                        MotionEventUpState.BUTTON_3 -> {
                            binding.et.text.append(binding.popup.btn3.text.toString())
                            binding.btn.text = G.fixText
                            binding.popup.root.visibility = View.INVISIBLE

                        }
                        MotionEventUpState.BUTTON_4 -> {
                            binding.et.text.append(binding.popup.btn4.text.toString())
                            binding.btn.text = G.fixText
                            binding.popup.root.visibility = View.INVISIBLE

                        }
                        MotionEventUpState.BUTTON_5 -> {
                            binding.et.text.append(binding.popup.btn5.text.toString())
                            binding.btn.text = G.fixText
                            binding.popup.root.visibility = View.INVISIBLE

                        }
                        MotionEventUpState.BUTTON_6 -> {
                            binding.et.text.append(binding.popup.btn6.text.toString())
                            binding.btn.text = G.fixText
                            binding.popup.root.visibility = View.INVISIBLE

                        }
                        MotionEventUpState.BUTTON_7 -> {
                            binding.et.text.append(binding.popup.btn7.text.toString())
                            binding.btn.text = G.fixText
                            binding.popup.root.visibility = View.INVISIBLE

                        }
                        MotionEventUpState.BUTTON_8 -> {
                            binding.et.text.append(binding.popup.btn8.text.toString())
                            binding.btn.text = G.fixText
                            binding.popup.root.visibility = View.INVISIBLE

                        }
                        MotionEventUpState.BUTTON_9 -> {
                            binding.et.text.append(binding.popup.btn9.text.toString())
                            binding.btn.text = G.fixText
                            binding.popup.root.visibility = View.INVISIBLE

                        }
                        else -> {

                        }
                    }


                }
            }
        }
        return super.dispatchTouchEvent(ev)
    }





    fun clickLong(){
       // popupWindow.contentView = popupView
        //https://stackoverflow.com/questions/29390175/android-custom-keyboard-popup-keyboard-on-long-press

       shoPopWindow()



//
//        popupViewBinding.apply {
////            btn1.setOnClickListener {
////                binding.et.text.append("ㅎㅎ")
////                G.fixText = "ㅎㅎ"
////                this.root.requestDisallowInterceptTouchEvent(true)
////                binding.btn.text = G.fixText
////                popupWindow.dismiss()
////            }
//            with(btn1) {
//                setOnTouchListener ( object : View.OnTouchListener{
//                        override fun onTouch(v: View?, event: MotionEvent?): Boolean {
//                           var action = event!!.action
//                            when(action){
//                                MotionEvent.ACTION_DOWN -> {
//                                    popupViewBinding.root.requestDisallowInterceptTouchEvent(false)
//                                  Log.i("1111111111","ffffffffffffffffff")
//                                    return false
//                                }
//                                MotionEvent.ACTION_MOVE -> {
//                                    Log.i("2222222222221","ffffffffffffffffff")
//                                }
//
//                            }
//                            return true
//                        }
//                    })
//            }
//            btn2.setOnClickListener {
//                binding.et.text.append("ㅁㅁ")
//                G.fixText = "ㅁㅁ"
//                binding.btn.text = G.fixText
//                popupWindow.dismiss()
//            }
//            btn3.setOnClickListener {
//                binding.et.text.append("ddd")
//                G.fixText = "ㅎㅎ"
//                binding.btn.text = G.fixText
//                popupWindow.dismiss()
//            }
//            btn4.setOnClickListener {
//                binding.et.text.append("ddd")
//                popupWindow.dismiss()
//            }
//            btn5.setOnClickListener {
//                binding.et.text.append("ddd")
//                popupWindow.dismiss()
//            }
//            btn6.setOnClickListener {
//                binding.et.text.append("ddd")
//                popupWindow.dismiss()
//            }
//            btn7.setOnClickListener {
//                binding.et.text.append("ddd")
//                popupWindow.dismiss()
//            }
//            btn8.setOnClickListener {
//                binding.et.text.append("ddd")
//                popupWindow.dismiss()
//            }
//            btn9.setOnClickListener {
//
//            }
//        }

    }// long click

    fun shoPopWindow(){
        popupWindow.apply {
            if (isShowing){
                update(50,0,ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT)
            } else {
                width = ViewGroup.LayoutParams.WRAP_CONTENT
                height = ViewGroup.LayoutParams.WRAP_CONTENT
                isOutsideTouchable = true
                showAtLocation(binding.btn,Gravity.CENTER,200,-100)
            }

        }
    }


//
//    var t : Long = 0L
//    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
//
//        var isViewOut :Boolean = false
//
//        when( event?.action){
//            MotionEvent.ACTION_DOWN -> {
//                Log.i("ddd","ddddddddddddd")
//                isViewOut = false
//                clickLong()
//            }
//            MotionEvent.ACTION_MOVE -> {
//
//               // if (v!!.isPressed == false) Log.i("오나갓음","666666666666666666666666666666666")
//            }
//            MotionEvent.ACTION_UP -> {
//                Log.i("뗌 ㅇㅇㅇㅇ","${event.eventTime}")
//
//                if (event.eventTime < 26167938) Log.i("짧클ㄹㄹㄹㄹㄹㄹ","ㅉㅉㅉㅉ클ㄹㄹㄹㄹㄹㄹ")
//                else Log.i("롱클ㄹㄹㄹㄹㄹㄹ","롱클ㄹㄹㄹㄹㄹㄹ")
//            }
//            MotionEvent.ACTION_OUTSIDE -> {
//                binding.root.requestDisallowInterceptTouchEvent(true)
//                Log.i("ㄴㄱㄴㄱㄴㄱㄴㄱㄴㄱㄴㄱㄴㄱ","ㄴㄱㄴㄱㄴㄱㄴㄱㄴㄱㄴㄱㄴㄱㄴ감")
//                binding.popup.btn1.requestFocus()
//                    if ( binding.popup.btn1.hasFocus()) Log.i("gjfjjfjjf","iewofnwlfnheriejrnlsd.fnjwsdkvnefvnoerj")
//
//            }
//        }
//
//        return true
//    }


}
