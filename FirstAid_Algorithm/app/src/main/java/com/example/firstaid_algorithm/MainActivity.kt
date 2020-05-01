package com.example.firstaid_algorithm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    val questions = arrayOf("Czy jesteś bezpieczny?", "Czy poszkodowany jest przytomny?")
    val information = arrayOf("Nie podchodź!", "Załóż rękawiczki. Zawołaj do poszkodowanego.")
    val data_list = arrayOf(questions, information)
    lateinit var startButton : Button

    companion object {
        const val INTENT_QUESTION_KEY = "question"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton = findViewById(R.id.startButton)
        startButton.setOnClickListener {
            startAlgorithm()
        }
    }

    private fun startAlgorithm() {
        val questionIntent = Intent(this, QuestionActivity::class.java)
        questionIntent.putExtra(INTENT_QUESTION_KEY, questions)
        startActivity(questionIntent)
    }
}
