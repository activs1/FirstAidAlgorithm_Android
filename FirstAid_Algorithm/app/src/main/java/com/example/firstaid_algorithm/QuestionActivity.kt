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
    val data_ = Data()
    val questions = data_.createQuestionsArrays()
    var index: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)


        questionTextView = findViewById(R.id.question_textView)

        index = intent.getIntExtra(MainActivity.INTENT_QUESTION_KEY, 0)
        questionTextView.setText(questions[index].getQuestionText())
        yesButton = findViewById(R.id.button_yes)
        noButton = findViewById(R.id.button_no)

        yesButton.setOnClickListener {
            showYesAnswer()
            //question_index++
        }
        noButton.setOnClickListener {
            showNoAnswer()
            //question_index++
        }
    }

    private fun showYesAnswer() {
        val answerIntent = Intent(this, AnswerActivity::class.java)
        answerIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, questions[index].getPointerOption1())
        startActivity(answerIntent)
    }

    private fun showNoAnswer() {

        val answerIntent = Intent(this, AnswerActivity::class.java)
        answerIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, questions[index].getPointerOption2())
        startActivity(answerIntent)
    }

}
