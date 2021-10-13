import java.util.*

// public 변수로 scan을 선언
// type : java.util.Scanner class
// class를 가져와서 객체로 선언 및 생성
// 생성자를 new라는 키워드 없이 그냥 호출하여 객체를 초기화
val scan: Scanner = Scanner(System.`in`)

fun main() {
//    print("문자열을 입력: ")
//    var input:String = scan.nextLine()
//    println("입력한 문자열 : $input")

    /**
     * 키보드를 사용하여 2개의 문자열형 숫자를 입력받고
     * 두 숫자의 사칙연산을 수행하여 console에 표시하시오
     */

    var str1: String = scan.nextLine()
    var num1 = Integer.parseInt(str1)

    var str2: String = scan.nextLine()
    var num2 = Integer.parseInt(str2)

    println("$num1 + $num2 = ${num1 + num2}")
    println("$num1 - $num2 = ${num1 - num2}")
    println("$num1 x $num2 = ${num1 * num2}")
    println("$num1 / $num2 = ${num1 / num2}")
}