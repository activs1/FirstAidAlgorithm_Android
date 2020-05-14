package com.example.firstaid_algorithm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AnswerActivity : AppCompatActivity() {

    lateinit var infoTextView: TextView
    lateinit var continueButton: Button

    lateinit var data: Array<Array<String>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        infoTextView = findViewById(R.id.info_textView)
        continueButton = findViewById(R.id.continue_button)
        continueButton.setOnClickListener {
            showNextQuestion()
        }

        data = intent.getSerializableExtra(MainActivity.INTENT_QUESTION_KEY) as Array<Array<String>>
        val questions: Array<String>?  = data[0]
        val answers: Array<String>?  = data[1]
        infoTextView.setText(answers?.get(0))

    }

    private fun showNextQuestion() {
        val questionIntent = Intent(this, QuestionActivity::class.java)
        questionIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, data)
        startActivity(questionIntent)
    }
}
