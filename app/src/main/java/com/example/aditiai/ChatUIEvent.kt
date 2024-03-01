package com.example.aditiai

import android.graphics.Bitmap

sealed class ChatUIEvent {
    data class Updateprompt(val newPrompt:String):ChatUIEvent()
    data class Sendprompt(val prompt:String,val bitmap: Bitmap?):ChatUIEvent()

}