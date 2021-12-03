package com.ruchika.interview.color

sealed class Color(val name: String) {
    class Yellow : Color("Yellow")
    class Red : Color("Red")
    class Green : Color("Green")
    class Blue : Color("Blue")
}
