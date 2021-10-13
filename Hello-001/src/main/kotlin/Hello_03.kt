/**
 * Kotlin의 특징 중 하나
 * null 안정형 언어
 * 변수에는 절대 null값을 저장할 수 없다.
 *
 * null값 비교 : 값이 있냐 없냐
 * 숫자형에서 0이 저장된 경우: 정말 값이 0이냐, 아니면 값이 없냐!
 *  이러한 상황을 구분하기 위하여 null 사용
 * 그래서 언어에 null의 존재가 없으면 코딩에 상당히 많은 부분에 어려움이 발생한다
 *
 * Kotlin에서는 safe null이라는 개념이 있다.
 */

fun main() {
    var str1 = ""

    // 제한적으로 str2 변수는 null값을 저장할 수 있다
    var str2:String? = null
    println(str2.toString())

    if(str2 == null) {
        println("str2는 null이다")
    }

    // str2 = num || "str2는 null"
    println(str2?: "str2는 null")

    // 만약 str2가 null이면 str2에 Korea 문자열을 저장하라
    str2 = str2?: "Korea"
    println(str2)
}