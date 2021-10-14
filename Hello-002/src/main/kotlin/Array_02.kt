fun main() {
    /**
     * java에서 배열은 한 번 생성이 되면 배열의 크기를 변경할 수 없다
     *
     * kotlin에서는 java와 같은 배열 요소가 없다
     * List 형의 특별한 데이터 type만 존재한다
     *
     * 불변형 List와 가변형 List
     *  불변형 List는 한 번 크기, 요소가 지정되면 요소를 추가,삭제할 수 없다
     *  가변형 List는 코드가 실행되는 과정에서 요소를 추가, 삭제할 수 있다
     */
    // 불변형
    var lList = listOf(1, 2, 3, 4, 5)

    // 가변형
    var mArray:MutableList<Int> = mutableListOf()
    mArray.add(100)
    mArray.add(120)
    println("mutable Array: ${mArray}")

    // java의 ArrayList를 가져온 가변형 list 데이터
    var aArray:ArrayList<Int> = arrayListOf<Int>()
    aArray.add(100)
    aArray.add(110)
    aArray.add(120)
    println("ArrayList: ${aArray}")

    aArray.remove(120)
    println("remove .. ArrayList: ${aArray}")

    aArray.removeAt(1)
    println("removeAt .. ArrayList: ${aArray}")
}