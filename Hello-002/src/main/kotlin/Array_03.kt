fun main() {

    val map1 = mapOf(
        "name" to "Hong",
        "tel" to "010",
        "addr" to "Gwang-Ju"
    )
    println("map1 - name: ${map1["name"]}")
    // 위의 println과 동일
    // println(map1["name"])

    for ((key, value ) in map1) {
        println("Key: $key, Value: $value")
    }

    val map2 = mutableMapOf(
        "name" to "Lee",
        "tel" to "011",
        "addr" to "Seoul"
    )
    println(map2)
    map2["tel"] = "012"
    println(map2)
}