package com.ruchika.interview.shape

import com.ruchika.interview.color.Color

class Circle(color: Color) : Shape("Circle", color) {

    override fun applyRedColor(): Shape {
        return Square(Color.Yellow())
    }

    override fun applyYellowColor(): Shape {
        return Triangle(Color.Yellow())
    }

    override fun applyBlueColor(): Shape {
        return Triangle(Color.Yellow())
    }

    override fun applyGreenColor(): Shape {
        return Triangle(Color.Yellow())
    }

}