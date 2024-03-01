package com.example.aditiai

import android.graphics.Bitmap
import android.hardware.biometrics.BiometricPrompt
import com.example.aditiai.data.Chat

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String="",
    val bitmap: Bitmap?=null
)