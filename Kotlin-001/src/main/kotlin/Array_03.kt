import kotlin.random.Random

fun main() {

    val rnd: Random = Random(System.currentTimeMillis())

    val array = arrayListOf<Int>()

    for (num in 1..100) {
        val rndNum:Int = rnd.nextInt(100) + 1
        array.add(rndNum)
    }
    println(array)

//    array.map { num ->
//        for (index in 2 until num) {
//            if(num % index == 0) {
//            }
//        }
//    }

//    val primes = array.filter {
//        for (num in 2 until it) {
//            if (it % num == 0) return@filter false
//        }
//
//        return@filter true
//    }
//    println(primes)

    val primes = array.filter {

        var primeYes = true
        for (num in 2 until it) {
            if (it % num == 0) {
                primeYes = false
                break
            }
        }
        primeYes
    }
    println(primes)
}