package com.wookie_soft.keyboardtest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*

class MyViewModel : ViewModel() {

    //https://hongbeomi.medium.com/android-timer-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0-ddac08dcb7e4

    val MIllIS_IN_FUTURE = 15000L
    val TICK_INTERVAL = 1000L

    val customTimerDuration: MutableLiveData<Long> = MutableLiveData(0L)
    private var oldTimeMills: Long = 0
//
//    val timerJob: Job = viewModelScope.launch(start = CoroutineStart.LAZY) {
//        withContext(Dispatchers.IO) {
//            oldTimeMills = System.currentTimeMillis()
//            while (customTimerDuration.value!! > 0L) {
//                val delayMills = System.currentTimeMillis() - oldTimeMills
//                if (delayMills == TICK_INTERVAL) {
//                    customTimerDuration.postValue(customTimerDuration.value!! + delayMills)
//                    oldTimeMills = System.currentTimeMillis()
//                }
//            }
//
//        }
//    }


}