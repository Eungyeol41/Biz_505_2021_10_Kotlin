import kotlin.random.Random

fun main() {
    var rnd:Random = Random(System.currentTimeMillis())

    var num:Int = rnd.nextInt(100) + 2

    /**
     * 2~101까지 범위 중 생성된 1개의 난수가 prime 수 인지 판별
     *
     * 2 ~ 자기자신 -1까지 수 중에서 나누어 지는 수가 없는 수
     *                           약수가 없는 수
     */

    // flag변수를 이용해보자
    var bPrimeYes = true
    // until을 사용하면 ..과 같은 의미, 2부터 num-1까지 보여준다
    for( index in 2 until num-1) {
        if(num % index == 0) { // num값에 index
            bPrimeYes = false
            break
        }
    }
    if(bPrimeYes) {
        println("$num 는 소수")
    }else {
        println("$num 은 소수가 아님")
    }

    // while을 사용하는 방법

    var index = 2
    while (index <= num / 2) {
        if(num % index == 0) {
            break
        }
        index ++
    }
    if(index >= num /2) {
        println("$num 는 소수")
    }else {
        println("$num 는 소수가 아님")
    }
}