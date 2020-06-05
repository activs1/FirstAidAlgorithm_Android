package com.example.firstaid_algorithm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {


    lateinit var startButton : Button
    lateinit var questions: ArrayList<Question>
    lateinit var infos: ArrayList<Information>



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
        questionIntent.putExtra(INTENT_QUESTION_KEY, 0)
        startActivity(questionIntent)
    }


}
