fun main() {

    /**
     * var: 내용이 변경가능한 변수
     * val: 한 번 저장되면 내용을 변경할 수 없는 변수
     */
    val str1 = "Korea"
    // str1 = "Republic of Korea" : 오류 발생

    // listOf() 리스트형 변수를 생성하는 함수
    val 과일들 = listOf("사과", "바나나", "오렌지")
    for(과일 in 과일들) {
        println(과일)
    }

    // 과일들 변수의 위치값을 담아서 index에 저장하라
    // index -> 0, 1, 2
    for(index in 과일들.indices) {
        println("$index 번째 : ${과일들[index]}")
    }

    if(3 in 1..10) { println("존재") }
    for(num in 1..10) {
        if(num == 3) {
            println("존재")
        }
    }

    // 과일들 요소 중에 사과가 있냐?
    if("사과" in 과일들) { println("사과 있음") }
    for(과일 in 과일들) {
        if(과일 == "사과") {
            println("사과 있음")
        }
    }

    // 과일들 요소 중에 배가 없냐?
    if("배" !in 과일들) { println("배 없음") }
}