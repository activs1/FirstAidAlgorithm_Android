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
    val data_ = Data()
    val questions = data_.createQuestionsArrays()
    val infos = data_.createInfosArray()
    var index: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        //val data = intent.getStringArrayExtra(MainActivity.INTENT_QUESTION_KEY)
        //data = intent.getSerializableExtra(MainActivity.INTENT_QUESTION_KEY) as Array<Array<String>>
        //val questions: Array<String>?  = data[0]
        //val answers: Array<String>?  = data[1]

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
        //if(infos[questions[index].getPointerOption1()!!].getInformationText() == null) {
            //val questionIntent = Intent(this, QuestionActivity::class.java)
            //questionIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, infos[questions[index].getPointerOption1()!!].getNextQuestionPointer())
            //startActivity(questionIntent)
       // }
       // else if (infos[questions[index].getPointerOption1()!!].getInformationText() != null){
            //val answerIntent = Intent(this, AnswerActivity::class.java)
           // answerIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, questions[index].getPointerOption2())
            //startActivity(answerIntent)
        //}
        val answerIntent = Intent(this, AnswerActivity::class.java)
        answerIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, questions[index].getPointerOption1())
        startActivity(answerIntent)
    }

    private fun showNoAnswer() {
        //if(infos[questions[index].getPointerOption1()!!].getInformationText() == null) {
           // val questionIntent = Intent(this, QuestionActivity::class.java)
            //questionIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, infos[questions[index].getPointerOption1()!!].getNextQuestionPointer())
            //startActivity(questionIntent)
        //}
        //else if (infos[questions[index].getPointerOption1()!!].getInformationText() != null){
            //val answerIntent = Intent(this, AnswerActivity::class.java)
           // answerIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, questions[index].getPointerOption2())
           // startActivity(answerIntent)
        //}
        val answerIntent = Intent(this, AnswerActivity::class.java)
        answerIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, questions[index].getPointerOption2())
        startActivity(answerIntent)
    }

}
