package com.example.my_calculator

fun main() {
    while (true) {
        println("첫번째 숫자")
       var num1 = readLine()!!.toDouble()
        println("두번째 숫자")
       var num2 = readLine()!!.toDouble()
        println("연산자를 입력")
       var fbo = readLine()

       val ffbo = arrayOf("+", "-" , "*" , "/", "%")

        if (fbo in ffbo) {
           var gab = when (fbo) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            "%" -> (num1 / num2) * 100
            else -> {
                return
            }
        }
        println("값$gab")
       }
    }
}
