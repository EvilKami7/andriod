package com.example.calculator

//import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var oper = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus_btn.setOnClickListener{
            oper = "+"
        }
        minus_btn.setOnClickListener{
            oper = "-"
        }
        multi_btn.setOnClickListener{
            oper = "*"
        }
        divide_btn.setOnClickListener{
            oper = "/"
        }
        equal_btn.setOnClickListener {
            val op_1 : Float = operand1_view.text.toString().toFloat()
            val op_2 : Float = operand2_view.text.toString().toFloat()
            var result : Float = 0.0F
            when (this.oper) {
                "+" -> {
                    result = op_1 + op_2
                }
                "-" -> {
                    result = op_1 - op_2
                }
                "*" -> {
                    result = op_1 * op_2
                }
                "/" -> {
                    result = op_1 / op_2
                }
            }
            result_view.text = "$op_1 $oper $op_2 = $result"

        }


    }

}