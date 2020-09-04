package com.example.level1_task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var answerOne = textView1.text.toString()

        binding.submitBtn.setOnClickListener{
            checkAnswers("T", answerOne)
        }
    }

    /** Check all answers and give toast message if correct or incorrect **/
    private fun checkAnswers(correctAnswer: String, answer: String){
        if (answer == correctAnswer){
            onAnswerCorrect()
        } else {
            onAnswerIncorrect()
        }
    }

    /** Displays an correct Toast message */
    private fun onAnswerCorrect() {
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
    }

    /** Displays an incorrect Toast message*/
    private fun onAnswerIncorrect() {
        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
    }
}