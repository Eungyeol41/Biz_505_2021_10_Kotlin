fun main() {
    var num1 = 30
    var num2 = 30.0

    // num2 변수에 담겨있는 값을 num1 변수에 담는다(할당한다)
    // num1 = num2 --> error
    // 실수형 변수 num2에 담긴 값을 강제로 정수형으로 변환(toInt())하여
    // 정수형 변수 num1에 저장하라
    // 실수형변수를 정수형변수로 강제 형변환
    num1 = num2.toInt() //    Integer.valueOf(num2) || Integer.parseInt(num2)

    // 문자열형 숫자
    var str = "12345"
    // num1 = str
    // 문자열형 숫자를 정수형 숫자로 변환하여 정수형 변수에 담기기
   num1 = Integer.parseInt(str)

    str = "$num1"
    str = num1.toString()

    /**
     * 변수.toInt() : 정수형으로
     * 변수.toLong()
     * 변수.toFloat()
     * 변수.toDouble()
     * 변수.toChar()
     * 변수.toByte()
     */

}
