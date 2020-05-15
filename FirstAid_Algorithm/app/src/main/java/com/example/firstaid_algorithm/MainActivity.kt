package com.example.firstaid_algorithm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    //val questions = arrayOf("Czy jesteś bezpieczny?", "Czy poszkodowany jest przytomny?")
    //val information = arrayOf("Nie podchodź!", "Załóż rękawiczki. Zawołaj do poszkodowanego.")
    //val data_list = arrayOf(questions, information)
    lateinit var startButton : Button
    lateinit var questions: ArrayList<Question>
    lateinit var infos: ArrayList<Information>



    companion object {
        const val INTENT_QUESTION_KEY = "question"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questions = createQuestionsArrays()
        infos = createInfosArray()


        startButton = findViewById(R.id.startButton)
        startButton.setOnClickListener {
            startAlgorithm()
        }
    }

    private fun startAlgorithm() {
        val questionIntent = Intent(this, QuestionActivity::class.java)
        questionIntent.putExtra(INTENT_QUESTION_KEY, 0)
        startActivity(questionIntent)
    }

    private fun createQuestionsArrays(): ArrayList<Question> {
        val data_ = Data()
        val data_questions = data_.questions
        val data_info: Array<String?> = data_.tips
        val questions = arrayListOf<Question>()
        val infos = arrayListOf<Information>()

        // Niebieska śceiżka
        questions.add(Question(data_questions[0], 1, 0))
        questions.add(Question(data_questions[1], 3, 2))
        questions.add(Question(data_questions[2], 5, 4))
        questions.add(Question(data_questions[3], 7, 6))


        questions.add(Question(data_questions[4], 9, 8))
        questions.add(Question(data_questions[5], 11, 10))
        questions.add(Question(data_questions[6], 13, 12))
        questions.add(Question(data_questions[7], 16, 15, 14))
        questions.add(Question(data_questions[8], 18, 17))
        questions.add(Question(data_questions[9], 20, 19))

        return questions
    }

    private fun createInfosArray(): ArrayList<Information> {
        val data_ = Data()
        //val data_questions = data_.questions
        val data_info: Array<String?> = data_.tips
        //val questions = arrayListOf<Question>()
        val infos = arrayListOf<Information>()
        infos.add(Information(data_info[0], null))
        infos.add(Information(data_info[1], 1))
        infos.add(Information(data_info[2], 4))
        infos.add(Information(data_info[4], 3))
        infos.add(Information(data_info[5], 3))
        infos.add(Information(data_info[6], null))
        infos.add(Information(data_info[7], null))

        infos.add(Information(data_info[8], 5))
        infos.add(Information(data_info[9], 5))
        infos.add(Information(data_info[10], 6))

        infos.add(Information(data_info[13], 8))
        infos.add(Information(data_info[14], 9))
        infos.add(Information(data_info[15], null))
        infos.add(Information(data_info[19], null))
        //infos.add(Information(data_info[15], 1))
        //infos.add(Information(data_info[16], 1))
        //infos.add(Information(data_info[17], 1))
        //infos.add(Information(data_info[18], 1))
        //infos.add(Information(data_info[19], 1))
        //infos.add(Information(data_info[20], 1))
        //infos.add(Information(data_info[20], 1))
        return infos
    }
}
