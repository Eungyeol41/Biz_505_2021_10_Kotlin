import kotlin.random.Random

fun main() {

    val rnd = Random(System.currentTimeMillis())

    // 내용을 추가, 삭제, 변경 가능한 배열
    val array = arrayListOf<Int>()

    //1 ~ 100까지 임의의 난수를 생성하여 array에 100개 추가
    for (num in 1..100) {
        val rndNum = rnd.nextInt(100) + 1
        array.add(rndNum)
    }

    println(array)

    // filter : array 배열에서 조건에 맞는 요소만 추출하여 evens 배열에 담기
    //    val evens = (array).filter { it % 2 == 0 }

    // it 키워드를 사용, kotlin 고유방식
    val evens = array.filter { it % 2 == 0 }
    println(evens)

    // 짝수의 합
    var evenSum = 0
    for (arr in evens) {
        evenSum += arr
    }
    println("배열 요소 중 짝수들의 합: $evenSum")

    val eventSum1 = array.sumOf { if(it % 2 == 0) it else 0 }
    println("배열 요소 중 짝수들의 합: $eventSum1")

}