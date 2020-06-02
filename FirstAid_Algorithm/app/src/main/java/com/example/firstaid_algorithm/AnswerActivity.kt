package com.example.firstaid_algorithm

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class AnswerActivity : AppCompatActivity() {

    lateinit var infoTextView: TextView
    lateinit var continueButton: Button
    lateinit var pictureimageView: ImageView
    lateinit var dialButton: Button

    val data_ = Data()
    val questions = data_.createQuestionsArrays()
    val infos = data_.createInfosArray()
    var index: Int = 0
    var pic: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        infoTextView = findViewById(R.id.info_textView)
        continueButton = findViewById(R.id.continue_button)
        pictureimageView = findViewById(R.id.picture_imageView)

        continueButton.setOnClickListener {
            showNextQuestion()
        }

        index = intent.getIntExtra(MainActivity.INTENT_QUESTION_KEY, 0)
        if(infos[index].getInformationText() == null){
            showNextQuestion()
        }

        infoTextView.setText(infos[index].getInformationText())

        if(infos[index].getPictureName() == null){
            pictureimageView.setImageResource(R.drawable.z3)
        }

        else{
            pic = infos[index].getPictureName()!!
            pictureimageView.setImageResource(pic)
        }

        if(index == 2 || index == 7) {
            dialButton = findViewById(R.id.dial_999)
            dialButton.visibility = View.VISIBLE
            dialButton.setOnClickListener { callAmbulance() }
        }
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

    private fun callAmbulance() {
        val number: Int = 111111111
        intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
        startActivity(intent)
    }
}