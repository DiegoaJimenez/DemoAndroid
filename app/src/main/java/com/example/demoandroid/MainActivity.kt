package com.example.demoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var leftNumber = (0..100).random()
    var rightNumber = (0..100).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun rightClick(param1: View){

        if(rightNumber > leftNumber)

        Toast.makeText(this, "Has Ganado", Toast.LENGTH_LONG).show()
        else{
            Toast.makeText(this, "Has Perdido", Toast.LENGTH_LONG).show()
        }
         leftNumber = (0..100).random()
         rightNumber = (0..100).random()
    }

    fun leftClick(param1: View){
        if(rightNumber < leftNumber)
            Toast.makeText(this, "Has Ganado", Toast.LENGTH_LONG).show()
        else{
            Toast.makeText(this, "Has Perdido", Toast.LENGTH_LONG).show()
        }
         leftNumber = (0..100).random()
         rightNumber = (0..100).random()
    }
}

