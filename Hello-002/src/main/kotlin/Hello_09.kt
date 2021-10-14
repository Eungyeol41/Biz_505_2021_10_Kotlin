import kotlin.random.Random

fun main() {

    var rnd:Random = Random(System.currentTimeMillis())
    var num1:Int = rnd.nextInt(100)

    print("$num1: ")
    when(num1 % 2) {
        0 -> println("짝수")
        1 -> println("홀수")
    }

    var result:String = when(num1 % 3) {
        0 -> "3의 배수"
        1 -> "나머지가 1"
        2 -> "나머지가 2"
        else -> "알 수 없음"
    }
    println("$num1: $result")
}