package com.example.firstaid_algorithm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class QuestionThreeOptionsActivity : AppCompatActivity() {


    private lateinit var questionTextView: TextView
    private lateinit var option1_button: Button
    private lateinit var option2_button: Button
    private lateinit var option3_button: Button

    private val data_ = Data()
    private val questions = data_.createQuestionsArrays()
    private val infos = data_.createInfosArray()
    private var index: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_three_options)

        questionTextView = findViewById(R.id.questionTextView_3options)

        index = intent.getIntExtra(MainActivity.INTENT_QUESTION_KEY, 0)
        questionTextView.setText(questions[index].getQuestionText())
        option1_button = findViewById(R.id.answer1_button)
        option2_button = findViewById(R.id.answer2_button)
        option3_button = findViewById(R.id.answer3_button)

        option1_button.setOnClickListener {
            showFirstOptionAnswer()
            //question_index++
        }
        option2_button.setOnClickListener {
            showSecondOptionAnswer()
            //question_index++
        }
        option3_button.setOnClickListener {
            showThirdOptionAnswer()
            //question_index++
        }
    }

    private fun showFirstOptionAnswer() {
        if(infos[questions[index].getPointerOption1()!!].getInformationText() == null) {
            val questionIntent = Intent(this, QuestionActivity::class.java)
            questionIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, infos[questions[index].getPointerOption3()!!].getNextQuestionPointer())
            startActivity(questionIntent)
        }
        else {
            val answerIntent = Intent(this, AnswerActivity::class.java)
            answerIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, questions[index].getPointerOption3())
            startActivity(answerIntent)
        }
    }

    private fun showSecondOptionAnswer() {
        if(infos[questions[index].getPointerOption2()!!].getInformationText() == null) {
            val questionIntent = Intent(this, QuestionActivity::class.java)
            questionIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, infos[questions[index].getPointerOption2()!!].getNextQuestionPointer())
            startActivity(questionIntent)
        }
        else {
            val answerIntent = Intent(this, AnswerActivity::class.java)
            answerIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, questions[index].getPointerOption2())
            startActivity(answerIntent)
        }
    }

    private fun showThirdOptionAnswer() {
        if(infos[questions[index].getPointerOption2()!!].getInformationText() == null) {
            val questionIntent = Intent(this, QuestionActivity::class.java)
            questionIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, infos[questions[index].getPointerOption1()!!].getNextQuestionPointer())
            startActivity(questionIntent)
        }
        else {
            val answerIntent = Intent(this, AnswerActivity::class.java)
            answerIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, questions[index].getPointerOption1())
            startActivity(answerIntent)
        }
    }
}

