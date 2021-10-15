import java.lang.Exception
import kotlin.random.Random

/**
 * 키보드를 사용
 *      10 ~ 100까지의 정수 입력받기
 *
 * 입력받은 정수만큼의 배열을 생성하여
 *      1 ~ 100까지의 임의의 난수 생성하여 채워넣기
 *
 * 각 배열 요소에 +2를 하여 새로운 배열 생성
 *
 * 원배열과 New 배열 Console에 출력
 */

fun main() {

    val rnd: Random = Random(System.currentTimeMillis())

    while (true) {
        print("숫자를 입력해주세요(단, 10 ~ 100 사이): ")
        var strNum: String = scan.nextLine()

        var intNum = 0
        try {
            intNum = Integer.valueOf(strNum)

            if (intNum < 10 || intNum > 100) {
                println("숫자는 10 ~ 100까지 범위에서 입력해주세요")
                println("다시 입력해주세요")
                println()
                continue
            }

        } catch (e: Exception) {
            println("10 ~ 100 범위의 숫자만 입력해주세요")
            println("다시 한 번 입력해주세요")
            continue
        }
        println("입력받은 숫자: $intNum")


        val numArray = arrayListOf<Int>()

        for (num in 1..intNum) {
            var rndNum = rnd.nextInt(100) + 1
            numArray.add(rndNum)
        }
        println("배열 요소: $numArray")

        val plusArray = numArray.map { it + 2 }
        println("+2 배열 요소: ${plusArray}")

        break
    }


}