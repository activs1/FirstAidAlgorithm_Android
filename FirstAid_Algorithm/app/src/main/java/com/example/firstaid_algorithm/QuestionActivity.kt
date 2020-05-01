package com.example.firstaid_algorithm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QuestionActivity : AppCompatActivity() {

    lateinit var yesButton: Button
    lateinit var noButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val data = intent.getStringArrayExtra(MainActivity.INTENT_QUESTION_KEY)
        println(data[0])

        yesButton = findViewById(R.id.button_yes)
        noButton = findViewById(R.id.button_no)

        yesButton.setOnClickListener {
            showYesAnswer()
        }
        noButton.setOnClickListener {
            showNoAnswer()
        }
    }

    private fun showYesAnswer() {

    }

    private fun showNoAnswer() {
        
    }
}
