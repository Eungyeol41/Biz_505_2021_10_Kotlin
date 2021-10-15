import java.util.*
import kotlin.random.Random

fun main() {

    val scan = Scanner(System.`in`)
    val rnd = Random(System.currentTimeMillis())

    print("10 ~ 100까지 범위의 정수를 입력하세요: ")
    val strNum = scan.nextLine()

    val intNum = Integer.valueOf(strNum)

    val array = arrayListOf<Int>()

    // for (num in 1..intNum)
    for (num in 0 until intNum) {
        val rndNum = rnd.nextInt(100) + 1
        array.add(rndNum)
    }

    // 방법 1
    val newArray1 = arrayListOf<Int>()
    for (arr in array) {
        newArray1.add(arr + 2)
    }

    // 방법 2
    val newArray2 = array.map { it + 2 }

    println(" 원래 배열 : $array")
    println("새로운 배열: $newArray2")
}