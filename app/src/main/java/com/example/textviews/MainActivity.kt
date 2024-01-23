package com.example.textviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var myText : TextView // indicates to the editor that we will declare the variable later during the code execution

    //the very first function that executes when the lifecycle of the android activity is launched
    //it creates and implements the code that the activity will use before it loads on the screen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myText = findViewById(R.id.textExample) //R stands for the Resources folder, Id stands for the Id of the component and then the name

        myText.setTextColor(Color.BLACK)
        myText.setText("This is an example!")


        myText.setOnClickListener {
            myText.setTextColor(Color.WHITE)
            myText.setBackgroundColor(Color.BLACK)
        }
    }
}