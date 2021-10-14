import java.lang.NumberFormatException
import java.util.*
import kotlin.math.pow

fun main() {

    var scan: Scanner = Scanner(System.`in`)

    while (true) {

        print("반지름을 정수값으로 입력하세요 : ")
        var strInput = scan.nextLine()

        var radius: Double = try {
            strInput.toDouble()
        } catch (e: NumberFormatException) {
            println("실수를 입력해주세요")
            println("다시 입력해주세요")
            continue
        }

        var radius2 = radius.pow(2)
        var radius3 = radius.pow(3)

        // 원의 둘레: 반지름 * 2 * PI
        // 원의 넓이: 반지름 * 반지름 * PI

        // 구의 표면적: 반지름 * 반지름 * 4 * PI
        // 구의 부피: 반지름 * 반지름 * 반지름 * PI * (4/3)

        var pi = Math.PI
        println(pi)

        println("원의 둘레: ${radius * pi * 2}")
        println("원의 넓이: ${radius2 * pi}")
        println("구의 넓이: ${radius2 * pi * 4}")
        println("구의 부피: ${radius3 * pi * 4 / 3}")

        break
    }

}