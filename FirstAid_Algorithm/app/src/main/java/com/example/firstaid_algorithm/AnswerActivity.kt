package com.example.firstaid_algorithm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class AnswerActivity : AppCompatActivity() {

    lateinit var infoTextView: TextView
    lateinit var continueButton: Button

    val data_ = Data()
    val questions = data_.createQuestionsArrays()
    val infos = data_.createInfosArray()
    var index: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        infoTextView = findViewById(R.id.info_textView)
        continueButton = findViewById(R.id.continue_button)
        continueButton.setOnClickListener {
            showNextQuestion()
        }

        index = intent.getIntExtra(MainActivity.INTENT_QUESTION_KEY, 0)
        if(infos[index].getInformationText() == null){
            showNextQuestion()
        }

        infoTextView.setText(infos[index].getInformationText())

    }

    private fun showNextQuestion() {
        if(infos[index].getNextQuestionPointer() == null) {
            val mainActivityIntent = Intent(this, MainActivity::class.java)
            val toast = Toast.makeText(applicationContext, "Koniec! Powrót na początek", Toast.LENGTH_SHORT)
            toast.show()
            startActivity(mainActivityIntent)
        }
        else if(questions[infos[index].getNextQuestionPointer()!!].getPointerOption3() == null) {
            println("HELLO")
            val questionIntent = Intent(this, QuestionActivity::class.java)
            questionIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, infos[index].getNextQuestionPointer())
            startActivity(questionIntent)
        }
        else if(questions[infos[index].getNextQuestionPointer()!!].getPointerOption3() != null) {
            println("Im here")
            val questionThreeOptionsIntent = Intent(this, QuestionThreeOptionsActivity::class.java)
            questionThreeOptionsIntent.putExtra(MainActivity.INTENT_QUESTION_KEY, infos[index].getNextQuestionPointer())
            startActivity(questionThreeOptionsIntent)
        }
    }
}
