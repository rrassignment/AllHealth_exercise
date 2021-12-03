package com.ruchika.interview.shape

import com.ruchika.interview.color.Color

class Rectangle(color: Color) : Shape("Rectangle", color) {

    override fun applyRedColor(): Shape {
        return Circle(Color.Yellow())
    }

    override fun applyYellowColor(): Shape {
        return Square(Color.Yellow())
    }

    override fun applyBlueColor(): Shape {
        return Circle(Color.Yellow())
    }

    override fun applyGreenColor(): Shape {
        return Square(Color.Yellow())
    }

}