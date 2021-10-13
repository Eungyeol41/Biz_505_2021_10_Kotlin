import java.lang.NumberFormatException

/**
 * 숫자를 다루는 코드에서
 * 어떤 값이 0이 아닌 경우에만 처리하는 코드가 있고
 * 0인 경우에도 처리해야하는 코드가 있다
 *
 * 이 때는 변수에 담긴 값이 null인지 검사하여 코드실행 여부를 결정해야 한다.
 * 이 때는 변수에 null을 허용해야 한다.
 * 변수:타입? = null 처럼 null로 초기화된 변수를 선언한다.
 */
fun main() {
    print("정수형 숫자 1을 입력하세요 ")
    var num1: String = scan1.nextLine()

    print("정수형 숫자 2를 입력하세요 ")
    var num2: String = scan1.nextLine()

    // intNum1을 int형으로 선언하고 null값을 제한적으로 허용함.
    var intNum1: Int? = null
    try {
        intNum1 = Integer.valueOf(num1)
    } catch (e: NumberFormatException) {
        print("정수형 숫자를 입력해주세요 \n 첫 번째 입력한 문자열 : $num1")
        return
    }

    var intNum2: Int? = null
    try {
        intNum2 = Integer.valueOf(num2)
    } catch (e: NumberFormatException) {
        print("정수형 숫자를 입력해주세요 \n 두 번째 입력한 문자열 : $num2")
        return
    }

    if (intNum1 != null && intNum2 != null) {

        println("$num1 + $num2 = ${intNum1 + intNum2}")
        println("$num1 - $num2 = ${intNum1 - intNum2}")
        println("$num1 x $num2 = ${intNum1 * intNum2}")
        println("$num1 / $num2 = ${intNum1 / intNum2}")

    } else {
        println("숫자를 잘못 입력하여 연산 결과를 표시할 수 없음! \n 모두 0을 입력할 수 없습니다")
    }

}