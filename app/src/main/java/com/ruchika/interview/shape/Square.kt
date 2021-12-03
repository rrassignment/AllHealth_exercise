package com.ruchika.interview.shape

import com.ruchika.interview.color.Color

class Square(color: Color) : Shape("Square", color) {

    override fun applyRedColor(): Shape {
        return Circle(Color.Yellow())
    }

    override fun applyYellowColor(): Shape {
        return Rectangle(Color.Yellow())
    }

    override fun applyBlueColor(): Shape {
        return Circle(Color.Yellow())
    }

    override fun applyGreenColor(): Shape {
        return Rectangle(Color.Yellow())
    }

}