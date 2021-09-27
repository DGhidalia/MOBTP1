package com.example.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var display: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById<View>(R.id.textView2) as TextView
    }

    fun erase(view: View) {
        this.textView2.text = ""
    }

    fun numberPress(view: View) {
        when(view.id){
            R.id.BTN0 -> {
                addToLine("0")
            }
            R.id.BTN1 -> {
                addToLine("1")
            }
            R.id.BTN2 -> {
                addToLine("2")
            }
            R.id.BTN3 -> {
                addToLine("3")
            }
            R.id.BTN4 -> {
                addToLine("4")
            }
            R.id.BTN5 -> {
                addToLine("5")
            }
            R.id.BTN6 -> {
                addToLine("6")
            }
            R.id.BTN7 -> {
                addToLine("7")
            }
            R.id.BTN8 -> {
                addToLine("8")
            }
            R.id.BTN9 -> {
                addToLine("9")
            }
        }
    }

    fun addToLine(s: String){
        display.append(s)
    }

    fun onOperator(view: View) {
        addToLine((view as Button).text as String)
    }

    fun onEqual(view: View) {
        val txt = display.text.toString()

        val expression = ExpressionBuilder(txt).
    }
}