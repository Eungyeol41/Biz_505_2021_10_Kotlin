fun main() {
    // numbers 배열에 1 ~ 45까지의 숫자를 담는다
    var numbers = Array(45, {index -> index +1})

    viewList(numbers)
    println("=".repeat(25))

    // Colelction에 담긴 데이터를 무작위로 섞어주는 함수
    numbers.shuffle()
    viewList(numbers)

    var lottoNum = numbers.slice(0..5)
    println("=".repeat(28))
    println("|   Today's Lucky Number   |")
    println("-".repeat(28))
    println("| " + lottoNum.sorted() + " |")
    println("=".repeat(28))

}

fun viewList(numbers:Array<Int>) {
    /*
    for (num in numbers) {
        print("$num ")
    }
    println()
     */

    for ((index, num) in numbers.withIndex()) {
        print("$num ")
        if((index +1) % 5 == 0) println()
    }
}