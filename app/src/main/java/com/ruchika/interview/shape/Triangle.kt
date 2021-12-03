package com.ruchika.interview.shape

import com.ruchika.interview.color.Color

class Triangle(color: Color) : Shape("Triangle", color) {

    override fun applyRedColor(): Shape {
        return Rectangle(Color.Yellow())
    }

    override fun applyYellowColor(): Shape {
        return Line(Color.Yellow())
    }

    override fun applyBlueColor(): Shape {
        return Rectangle(Color.Yellow())
    }

    override fun applyGreenColor(): Shape {
        return Line(Color.Yellow())
    }

}