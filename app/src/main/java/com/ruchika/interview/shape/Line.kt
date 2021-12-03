package com.ruchika.interview.shape

import com.ruchika.interview.color.Color

class Line(color: Color) : Shape("Line", color) {

    override fun applyRedColor(): Shape {
        return Square(Color.Yellow())
    }

    override fun applyYellowColor(): Shape {
        return Circle(Color.Yellow())
    }

    override fun applyBlueColor(): Shape {
        return Square(Color.Yellow())
    }

    override fun applyGreenColor(): Shape {
        return Circle(Color.Yellow())
    }

}