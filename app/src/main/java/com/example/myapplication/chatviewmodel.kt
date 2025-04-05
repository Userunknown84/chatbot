package com.example.myapplication

import android.util.Log
import androidx.lifecycle.ViewModel

class chatviewmodel: ViewModel() {
    fun sendMessage(question: String) {

       Log.i("In chatviewmodel",question)
    }
}