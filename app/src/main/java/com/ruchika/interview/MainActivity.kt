package com.ruchika.interview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ruchika.interview.color.Color
import com.ruchika.interview.shape.Circle
import com.ruchika.interview.shape.Square

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val square = Square(Color.Red())
        Log.i(TAG, "Applying Yellow on Square")
        val updatedSquare = square.applyYellowColor()
        Log.i(TAG, "Result: ${updatedSquare.showShapeWithColor()}")

        val circle = Circle(Color.Blue())
        Log.i(TAG, "Applying Red on Circle")
        val updatedCircle = circle.applyRedColor()
        Log.i(TAG, "Result: ${updatedCircle.showShapeWithColor()}")
    }

    companion object {
        const val TAG = "Logging"
    }

}