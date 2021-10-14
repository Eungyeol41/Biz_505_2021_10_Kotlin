import java.util.*
import kotlin.random.Random

fun main() {
    var scan:Scanner = Scanner(System.`in`)

    while (true) {
        prime()

        println("계속 할까요? ( END 입력 시 종료 )")
        var input:String = scan.nextLine()

        if(input.equals("END")) {
            break
        }
    }
    println("-- GAME OVER --")
}

fun prime() {
    var rnd:Random = Random(System.currentTimeMillis())

    var num1:Int = rnd.nextInt(100)

    println("생성된 난수: $num1")

    // it에는 2, 3, 4, 5, ..., num1이 담긴다 (차례대로)
    // 조건문이 true인 것만 뽑아서 배열로 만든다
    // range 데이터(일종의 유사배열)
    // filter를 사용하여 num1값과 % 연산을 하여 결과가 0인 친구들만 추출하여 resultArray 에 담아라
    var resultArray = (2 until num1).filter { num1 % it == 0 }
    println(resultArray)

    if(resultArray.isEmpty()) {
        println("$num1 은 소수")
    } else {
        println("$num1 은 소수가 아님")
    }

}