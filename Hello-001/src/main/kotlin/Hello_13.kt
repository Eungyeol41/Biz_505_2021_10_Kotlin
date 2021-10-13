import kotlin.random.Random

fun main() {
    var num1:Int = Random.nextInt(100) + 1

    println("$num1")
    for(num in 0..num1) {
        print("$num ")
    }
    println()

    /**
     * 0 ~ 99까지의 범위 중 임의로 생성되어 num1에 저장된 숫자가 prime 수인지 판단하여 출력하시오
     *
     * 2 ~ (자기자신 -1)까지 범위의 숫자와 나누어 나머지가 한 번도 나오지 않는 숫자
     */
    for(num in 2..(num1 -1)) {

//        if(num1 % num == 0) {
//            println("$num1 은 소수가 아님")
//            break
//        } else {
//            println("$num1 은 소수")
//            break
//        }


    }
    println()




}