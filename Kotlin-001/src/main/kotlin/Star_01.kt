fun main() {
    for (num in 1..5) {
        for (index in 1..num) {
            print("* ")
        }
        println()
    }
    println("=".repeat(11))

    for (num in 1..5) {
        for (i in 5 downTo num) {
            print("* ")
        }
        println()
    }
}
