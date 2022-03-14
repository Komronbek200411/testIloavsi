package com.example.myapplication.model

import java.io.Serializable

data class ScienceModel(
val title:String,
        val quizList: List <QuizMode>
):Serializable


data class QuizMode(
    val title: String,
    val image: Int?,
    val answerA:String,
    val answerB:String,
    val answerC:String,
    val answerD:String,
    val correntAnswer: String

):Serializable