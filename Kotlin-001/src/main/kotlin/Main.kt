import java.lang.NumberFormatException
import java.util.*

fun main() {

    var scan: Scanner = Scanner(System.`in`)

    print("정수 1을 입력해주세요: ")
    var strNum1: String = scan.nextLine()

    var intNum1 = 0
    try {
        intNum1 = Integer.valueOf(strNum1)
    } catch (e: NumberFormatException) {
        println("정수를 입력해주세요")
        return
    }

    print("정수 2를 입력해주세요: ")
    var strNum2: String = scan.nextLine()

    var intNum2 = 0
    try {
        intNum2 = Integer.valueOf(strNum2)
    } catch (e: NumberFormatException) {
        println("정수를 입력해주세요")
        return
    }

    if (intNum1 < intNum2) {
        var _num = intNum1
        intNum1 = intNum2
        intNum2 = _num
    }

    println("=".repeat(30))
    println("정수 1: $intNum1, 정수 2: $intNum2")
    println("-".repeat(30))
    view(intNum1, intNum2)
    println("=".repeat(30))

    /**
     * 함수에 값을 전달하면서 직접 매개변수 이름에 값을 할당하여 전달
     * Call By Name 방식
     */
//    view(num2 = intNum1, num1 = intNum2)

}

fun view(num1: Int, num2: Int) {

    var sum = num1 + num2
    var minus = num1 - num2
    var times = num1 * num2
    var div = num1 / num2

    println("${num1} + ${num2}: $sum")
    println("${num1} - ${num2}: $minus")
    println("${num1} x ${num2}: $times")
    println("${num1} / ${num2}: $div")

}