package com.example.mindsharpener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1 = findViewById<View>(R.id.textView) as TextView
        val number2 = findViewById<View>(R.id.textView3) as TextView
        val operation = findViewById<View>(R.id.textView2) as TextView
        //val total = findViewById(R.id.radioGroup) as RadioGroup
        val rb1 = findViewById(R.id.radioButton) as RadioButton
        val rb2 = findViewById(R.id.radioButton2) as RadioButton
        val rb3 = findViewById(R.id.radioButton3) as RadioButton

        val button1Listener =
            View.OnClickListener {
                val myRandomValues = Random.nextInt(0, 9)
                val myRandomValues2 = Random.nextInt(0, 9)
                val myRandomValues3 = Random.nextInt(0, 3)
                number1.text = myRandomValues.toString()
                number2.text = myRandomValues2.toString()
                val n1 = Integer.parseInt(number1.toString())
                val n2 = Integer.parseInt(number1.toString())
                val total = addNumbers(n1, n2, myRandomValues3)
            }
        val button2Listener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View) {
                val myRandomValues = Random.nextInt(0, 99)
                val myRandomValues2 = Random.nextInt(0, 99)
                val myRandomValues3 = Random.nextInt(0, 3)
                number1.text = myRandomValues.toString()
                number2.text = myRandomValues2.toString()
                val n1 = Integer.parseInt(number1.toString())
                val n2 = Integer.parseInt(number1.toString())
                val total = addNumbers(n1, n2, myRandomValues3)
            }
        }
        val button3Listener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View) {
                val myRandomValues = Random.nextInt(0, 999)
                val myRandomValues2 = Random.nextInt(0, 999)
                val myRandomValues3 = Random.nextInt(0, 3)
                number1.text = myRandomValues.toString()
                number2.text = myRandomValues2.toString()
                val n1 = Integer.parseInt(number1.toString())
                val n2 = Integer.parseInt(number1.toString())
                val total = addNumbers(n1, n2, myRandomValues3)
            }
        }
        rb1.setOnClickListener(button1Listener)
        rb2.setOnClickListener(button2Listener)
        rb3.setOnClickListener(button3Listener)

        // finding the button
        val checkButton = findViewById<Button>(R.id.button)

        // finding the id on every variable
        val answerText = findViewById<EditText>(R.id.editTextTextPersonName)
        val result = findViewById<View>(R.id.textView6) as TextView

        // Setting On Click Listener
        checkButton.setOnClickListener {

            // Getting the user input
            val answer = answerText.text
            val point = 0
            //proving answer
            if (answerText == total){
                point = point + 1
                result.text = point.toString()
            }
        }
    }
}
fun addNumbers(n1: Int, n2: Int, rv:Int): Int {

    if (myRandomValues3 == 0) {
        operation.text = "+"
        val total = n1 + n2

    }
    else if (myRandomValues3 == 1) {
        operation.text = "-"
        val total = n1 - n2
    }
    else if (myRandomValues3 == 2) {
        operation.text = "*"
        val total = n1 * n2
    }
    else {
        operation.text = "/"
        val total = n1 / n2
    }

    return total
}