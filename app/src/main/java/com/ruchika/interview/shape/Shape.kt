package com.ruchika.interview.shape

import com.ruchika.interview.color.Color

abstract class Shape(val name: String, val color: Color) {
    abstract fun applyRedColor(): Shape
    abstract fun applyYellowColor(): Shape
    abstract fun applyBlueColor(): Shape
    abstract fun applyGreenColor(): Shape

    fun showShapeWithColor(): String {
        return "Shape: $name with Color ${color.name}"
    }
}