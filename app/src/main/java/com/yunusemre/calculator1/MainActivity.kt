package com.yunusemre.calculator1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yunusemre.calculator1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.plusbutton.setOnClickListener {
            binding.resultbutton.setOnClickListener {
                add()
                binding.numbertext1.setText(null)
                binding.numbertext2.setText(null)
            }

        }

        binding.minusbutton.setOnClickListener {
            binding.resultbutton.setOnClickListener {
                minus()
                binding.numbertext1.setText(null)
                binding.numbertext2.setText(null)
            }

        }

        binding.multiplybutton.setOnClickListener {
            binding.resultbutton.setOnClickListener {
                multiply()
                binding.numbertext1.setText(null)
                binding.numbertext2.setText(null)
            }

        }

        binding.dividebutton.setOnClickListener {
            binding.resultbutton.setOnClickListener {
                divide()
                binding.numbertext1.setText(null)
                binding.numbertext2.setText(null)
            }

        }


    }

    fun add(){
        var number1=binding.numbertext1.text.toString().trim().toBigDecimal()
        var number2=binding.numbertext2.text.toString().trim().toBigDecimal()
        binding.resulttext.text=number1.add(number2).toString()

    }
    fun minus(){
        var number1=binding.numbertext1.text.toString().trim().toBigDecimal()
        var number2=binding.numbertext2.text.toString().trim().toBigDecimal()
        binding.resulttext.text=number1.minus(number2).toString()

    }

    fun multiply(){
        var number1=binding.numbertext1.text.toString().trim().toBigDecimal()
        var number2=binding.numbertext2.text.toString().trim().toBigDecimal()
        binding.resulttext.text=number1.multiply(number2).toString()
    }
    fun divide(){
        var number1=binding.numbertext1.text.toString().trim().toBigDecimal()
        var number2=binding.numbertext2.text.toString().trim().toBigDecimal()
        binding.resulttext.text=number1.divide(number2).toString()
    }
}