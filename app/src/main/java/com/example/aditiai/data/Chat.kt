package com.example.aditiai.data

import android.graphics.Bitmap

data class Chat (
    val prompt:String,
    val bitmap:Bitmap?,
    val isFromUser:Boolean
    )