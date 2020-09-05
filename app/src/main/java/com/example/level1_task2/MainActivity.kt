package com.example.level1_task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import com.example.level1_task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Sets the activity layout resource file.

        val correctAnswers = arrayOf("T", "F", "F", "F")

        binding.submitBtn.setOnClickListener{
            checkAnswers(correctAnswers)
        }
    }

    /** Check all answers and give toast message if correct or incorrect **/
    private fun checkAnswers(correctAnswers: Array<String>){
        var answerOne = binding.answer1.text.toString()
        var answerTwo = binding.answer2.text.toString()
        var answerThree = binding.answer3.text.toString()
        var answerFour = binding.answer4.text.toString()

        var answers = arrayOf(answerOne, answerTwo, answerThree, answerFour)

        /** Loop through all answers given to see if they match the correct answers and add
         * one to amount correct if answer is correct **/
        var amountCorrect = 0
        for (i in answers.indices) {
            if (answers[i] == correctAnswers[i]) amountCorrect += 1
        }
        showResults(amountCorrect)
    }

    /** Displays an correct Toast message */
    private fun showResults(amountCorrect: Int) {
        Toast.makeText(this, "${amountCorrect}/4 questions correct", Toast.LENGTH_LONG).show()
    }
}