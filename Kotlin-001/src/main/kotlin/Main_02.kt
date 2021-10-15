import java.util.*

var scan: Scanner = Scanner(System.`in`)

// title:String = "임의의" default 매개변수선언
// default로 매개변수를 선언하면 함수를 호출할 때 값을 전달하지 않아도 된다
// 값이 전달되지 않으면 default로 설정된 값이 매개변수에 전달된 것과 같이 작동된다
fun inputNum(title: String = "임의의"): Int {

    while (true) {
        print("$title 정수를 입력하세요")
        val strNum: String = scan.nextLine()
        val intNum: Int = try {
            Integer.valueOf(strNum)
        } catch (e: Exception) {
            println("$title 은 정수만 입력해주세요")
            continue
        }
        // catch문이 문제없이 넘어갔다는 의미, while이 완전히 종료되서
        return intNum
    }
}

fun main() {

    while (true) {
        val intNum1: Int = inputNum()
        val intNum2: Int = inputNum()

        if (intNum1 > intNum2) {
            println("첫 번째 정수값이 두 번째 정수값보다 커야합니다")
            continue
        }
        view(intNum1, intNum2)
    }
}