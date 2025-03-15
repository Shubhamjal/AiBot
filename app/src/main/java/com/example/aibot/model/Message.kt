package com.example.aibot.model

data class Message(
    val text: String,
    val isUser: Boolean // True if sent by user, false if from bot
)
