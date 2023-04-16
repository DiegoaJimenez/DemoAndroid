package com.example.demoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var leftNumber = 0
    var rightNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        assignNumbers()
    }


    fun assignNumbers(){
        leftNumber = (0..100).random()
        rightNumber = (0..100).random()
    }

    fun buttonClick(button: View) {

        val result = findViewById<TextView>(R.id.textResult)
        if (button.id == R.id.btn_right && rightNumber > leftNumber){
            Toast.makeText(this, "Has Ganado", Toast.LENGTH_LONG).show()
        result.text = "has ganado"
    }
        else if(button.id == R.id.btn_left && rightNumber < leftNumber) {
            Toast.makeText(this, "Has Ganado", Toast.LENGTH_LONG).show()
            result.text = "has ganado"
        }
        else{
            Toast.makeText(this, "Has Perdido", Toast.LENGTH_LONG).show()
            result.text = "has Perdido"
        }
        assignNumbers()

        //leer el texto del usuario
        val edit = findViewById<EditText>(R.id.inpText)
        Toast.makeText(this,edit.text.toString(), Toast.LENGTH_SHORT).show()
    }
    fun rightClick(param1: View){

        if(rightNumber > leftNumber)

        Toast.makeText(this, "Has Ganado", Toast.LENGTH_LONG).show()
        else{
            Toast.makeText(this, "Has Perdido", Toast.LENGTH_LONG).show()
        }
        assignNumbers()
    }

    fun leftClick(param1: View){
        if(rightNumber < leftNumber)
            Toast.makeText(this, "Has Ganado", Toast.LENGTH_LONG).show()
        else{
            Toast.makeText(this, "Has Perdido", Toast.LENGTH_LONG).show()
        }
        assignNumbers()
    }
}

