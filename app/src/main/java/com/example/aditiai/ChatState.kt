package com.example.aditiai

import android.graphics.Bitmap
import com.example.aditiai.data.Chat

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String="",
    val bitmap: Bitmap?=null
)