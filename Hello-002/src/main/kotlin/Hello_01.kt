/**
 * 진입점 함수
 * Kotlin 프로젝트의 시작점 - (시작하는 함수)
 *
 * 프로젝트를 입력하고 Run을 실행했을 때 자동으로 호출되어 실행되는 함수
 */
fun main() {
    /**
     * java에서는 기본적으로 변수의 type을 지정하여 선언한다
     * type을 지정하여 변수를 선언하는 것이 익숙하지 않아서 많은 어려움을 겪는다
     *
     * var 변수 = 값
     *
     * Kotlin에서 변수 선언하는 방법
     *
     * Kotlin에서는 변수를 선언할 때 어떤 값을 저장할 지 결정이 되면 type을 지정하지 않아도
     *  자동으로 type이 설정되는 형식으로 생성이 된다
     *
     * 변수를 선언하고 초기값을 저장하면 자동으로 type이 지정된다
     * Ex) var 변수 = 0
     *      변수: 정수형으로 지정해버린다.
     *
     * 변수를 선언할 때 반드시 초기값을 지정해야하는 원칙이 있다
     * Ex) var num1 = 0 --> 정수 0을 사용하여 초기화하였으므로 정수형 ( Int ) 변수
     *     var str1 = "Korea" --> 문자열 값을 사용하여 초기화하였으므로 문자열형 변수
     *     var bYes = true --> true 값을 사용하여 초기화하였으므로 Boolean 형 변수
     *     var num2 = 0L --> 정수 0L 값을 사용하여 초기화하였으므로 Long 형 변수
     *     var num3 = 3.0 --> 실수 3.0 값을 사용하여 초기화하였으므로 Double 형 변수
     *     var num4 = 3.0F --> 실수 3.0F 값을 사용하여 초기화하였으므로 Float 형 변수
     *     var char1 = 'A' --> 문자 A를 사용하여 초기화하였으므로 Char 형 변수
     *
     */

    // 정수 0을 사용하여 초기화하였으므로 정수형 ( Int ) 변수
    var num1 = 0

    // 문자열 값을 사용하여 초기화하였으므로 문자열형 변수
    var str1 = "Korea"

    // true 값을 사용하여 초기화하였으므로 Boolean 형 변수
    var bYes = true

    // 정수 0L 값을 사용하여 초기화하였으므로 Long 형 변수
    var num2 = 0L

    // 실수 3.0 값을 사용하여 초기화하였으므로 Double 형 변수
    var num3 = 3.0

    // 실수 3.0F 값을 사용하여 초기화하였으므로 Float 형 변수
    var num4 = 3.0F

    // 문자 A를 사용하여 초기화하였으므로 Char 형 변수
    var char1 = 'A'

    // 변수를 선언하는 표준 문법
    // primitive 방식과 class 방식의 구분이 없다
    // int, long, float, double, boolean, string이 아니라 모두 첫 글자는 대문자
    var num5: Int = 0
    var num6: Long = 0L
    var num7: Float = 3.0F
    var num8: Double = 3.0
    var bYes1: Boolean = true
    var str2: String = "대한민국"

    // 기본적으로 Kotlin 변수는 null값을 지정할 수 없다
    // var str2 = null

    /**
     * 정말 null을 처리하고 싶은 경우 safe null이라는 형식을 사용해야 함
     * 1. 표준 문법으로 변수를 선언
     *      type을 강제 지정하여 선언
     * 2. type 키워드 뒤에 ?(safe null) 기호를 첨가한다.
     *      var str2:String? = null
     * 3. safe null 형식으로 강제로 null을 저장할 수 있다.
     */

    var str3: String? = null
    var str4: String? = "Korea"

}