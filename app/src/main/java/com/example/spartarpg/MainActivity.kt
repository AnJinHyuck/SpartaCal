package com.example.spartarpg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.time.times

class Calculater() {

}
    fun main() {
        val canCalculater = listOf("+","-","*","/")
        while (true) {
            println("숫자를 입력해주세요. (종료를 원하시면 '종료'를 입력하세요)")
            val exit = readLine()!!
            if(exit == "종료"){
                break
            }

            var num1 = exit.toDouble()



            println("원하는 연산자를 입력하세요")
            var operator = readLine()



            println("다음 숫자를 입력해주세요")
            var num2 = readLine()!!.toDouble()

            result(num1, num2, operator)

            }

        }

fun result(num1:Double, num2:Double, operator: String?) {
    var result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> {
            println("지원하지 않는 연산자입니다 +,-,*,/ 중에 입력해주세요")
            return
        }
   }

        println("${result}")
}




