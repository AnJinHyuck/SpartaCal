package com.example.spartarpg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.time.times

/* 메인 함수안에서 24.03.06

 fun main() {
        val canCalculater = listOf("+","-","*","/")

        while (true) {
            println("숫자를 입력해주세요. (종료를 원하시면 '종료'를 입력하세요)")
            val exit = readln()

            if(exit == "종료"){
                break
            }

            var num1 = exit.toIntOrNull()

            while(num1 == null){
                println("숫자를 입력하세요")
                num1 = readln().toIntOrNull()
            }
            //숫자가 맞는지 확인하는 코드


            println("원하는 연산자를 입력하세요")
            var operator = readln()

            while(operator !in canCalculater){
                println("+ - * / 중에 하나를 입력하세요")
                operator = readln()
            }

            //올바른 연산자가 맞는지 확인하는 코드

            println("다음 숫자를 입력해주세요")
            var num2 = readln().toIntOrNull()

            while(num2 == null){
                println("두 번째 숫자를 입력하세요")
                num2 = readln().toIntOrNull()
            }

            //숫자가 맞는지 확인하는 코드


            result(num1, num2, operator)
            //결과가 도출되는 코드
            }

        }

fun result(num1:Int, num2:Int, operator: String?) {
    var result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> {
            return
        }
   }

        println("${result}")
}
*/

// 클래스를 이용한 계산기 03.06 수정
fun main() {
   var resultOfCal = Calculater()

    resultOfCal.cal()

}
   class  Calculater() {
       fun cal() {
           val canCalculater = listOf("+", "-", "*", "/")

           while (true) {
               println("숫자를 입력해주세요. (종료를 원하시면 '종료'를 입력하세요)")
               val exit = readln()

               if (exit == "종료") {
                   break
               }

               var num1 = exit.toIntOrNull()

               while (num1 == null) {
                   println("숫자를 입력하세요")
                   num1 = readln().toIntOrNull()
               }
               //숫자가 맞는지 확인하는 코드


               println("원하는 연산자를 입력하세요")
               var operator = readln()

               while (operator !in canCalculater) {
                   println("+ - * / 중에 하나를 입력하세요")
                   operator = readln()
               }

               //올바른 연산자가 맞는지 확인하는 코드

               println("다음 숫자를 입력해주세요")
               var num2 = readln().toIntOrNull()

               while (num2 == null) {
                   println("두 번째 숫자를 입력하세요")
                   num2 = readln().toIntOrNull()
               }

               //숫자가 맞는지 확인하는 코드


               result(num1, num2, operator)
               //결과가 도출되는 코드
           }

       }
   }
fun result(num1:Int, num2:Int, operator: String?) {
    var result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> {
            return
        }
    }

    println("결과는 ${result}")
}
// 이제 소수점을 입력했을때도 작동하게 만들어야 함
// 좀 더 효율적이게, 좀더 가독성 좋게


