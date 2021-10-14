fun main() {

    var num1 = 10

    /**
     * 0부터 num1까지 반복하면서 각 요소를 num 변수에 담아 내부로 전달
     */
    for (num in 0..num1) {
        print("$num ")
    }
    println()

    for (num in 0..10) {
        print("$num ")
    }
    println()

    for (num in 0..(10 - 1)) {
        print("$num ")
    }
    println()

    // 10미만까지 반복
    for (num in 0 until 10) {
        print("$num ")
    }
    println()

    for(num in 0..20 step 2) {
        print("$num ")
    }
    println()

    for(num in 20 downTo 0 step 2) {
        print("$num ")
    }
    println()

    /**
     * 0부터 100까지 범위의 수 중에서 3의 배수의 합을 계산하여 sum 변수에 담고 결과를 console에 출력하시오
     */
    var sum = 0
//    for(num in 0..100 step 3) {
//        sum += num
//    }
    for(num in 0..100) {
        if(num % 3 == 0) {
            sum += num
        }
    }
    println("0 ~ 100까지의 3의 배수의 합 : $sum")

}