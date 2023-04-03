package com.example.visualnovel.screens.models

import com.example.visualnovel.data.ReplyButton

data class DialogueScreen(
    val mainText: String,
    val replyOptions: List<ReplyButton>
)