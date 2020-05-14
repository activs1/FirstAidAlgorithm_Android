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

        val objects = createObjectArrays()

        startButton = findViewById(R.id.startButton)
        startButton.setOnClickListener {
            startAlgorithm()
        }
    }

    private fun startAlgorithm() {
        val questionIntent = Intent(this, QuestionActivity::class.java)
        questionIntent.putExtra(INTENT_QUESTION_KEY, data_list)
        startActivity(questionIntent)
    }

    private fun createObjectArrays() {
        val data_ = Data()
        val data_questions = data_.questions
        val data_info = data_.tips
        val questions = arrayListOf<Question>()
        val infos = arrayListOf<Information>()

        questions.add(Question(data_questions[0], 0, 1))
        questions.add(Question(data_questions[1], 2, 3))
        questions.add(Question(data_questions[2], 4, 5))
        questions.add(Question(data_questions[3], 6, 7))
        questions.add(Question(data_questions[4], 8, 9))
        questions.add(Question(data_questions[5], 10, 11))
        questions.add(Question(data_questions[6], 12, 13))
        questions.add(Question(data_questions[7], 14, 15))
        questions.add(Question(data_questions[8], 16, 17))
        questions.add(Question(data_questions[9], 18, 19))


        infos.add(Information(data_info[0], null))
        infos.add(Information(data_info[1], 1))
        infos.add(Information(data_info[2], 1))
        infos.add(Information(data_info[3], 1))
        infos.add(Information(data_info[4], 1))
        infos.add(Information(data_info[5], 1))
        infos.add(Information(data_info[6], 1))
        infos.add(Information(data_info[7], 1))
        infos.add(Information(data_info[8], 1))
        infos.add(Information(data_info[9], 1))
        infos.add(Information(data_info[10], 1))
        infos.add(Information(data_info[11], 1))
        infos.add(Information(data_info[12], 1))
        infos.add(Information(data_info[13], 1))
        infos.add(Information(data_info[14], 1))
        infos.add(Information(data_info[15], 1))
        infos.add(Information(data_info[15], 1))
        infos.add(Information(data_info[15], 1))
        infos.add(Information(data_info[15], 1))
        infos.add(Information(data_info[15], 1))
        infos.add(Information(data_info[15], 1))

    }
}
