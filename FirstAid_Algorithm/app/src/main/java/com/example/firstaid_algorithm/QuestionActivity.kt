package com.example.firstaid_algorithm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class QuestionActivity : AppCompatActivity() {

    lateinit var questionTextView: TextView
    lateinit var yesButton: Button
    lateinit var noButton: Button
    lateinit var data: Array<Array<String>>

    companion object {
        var question_index = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        //val data = intent.getStringArrayExtra(MainActivity.INTENT_QUESTION_KEY)
        data = intent.getSerializableExtra(MainActivity.INTENT_QUESTION_KEY) as Array<Array<String>>
        val questions: Array<String>?  = data[0]
        val answers: Array<String>?  = data[1]

        questionTextView = findViewById(R.id.question_textView)
        questionTextView.setText(questions?.get(question_index))
        yesButton = findViewById(R.id.button_yes)
        noButton = findViewById(R.id.button_no)

        yesButton.setOnClickListener {
            showYesAnswer()
            question_index++
        }
        noButton.setOnClickListener {
            showNoAnswer()
            question_index++
        }
    }

    private fun showYesAnswer() {
        val answerIntent = Intent(this, AnswerActivity::class.java)
        answerIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, data)
        startActivity(answerIntent)
    }

    private fun showNoAnswer() {
        val answerIntent = Intent(this, AnswerActivity::class.java)
        answerIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, data)
        startActivity(answerIntent)
    }
}
