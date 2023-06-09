fun main() {
    val oneA = readln().toInt()
    val oneB = readln().toInt()
    val twoA = readln().toInt()
    val twoB = readln().toInt()
    val num = readln().toInt()

    println(num in oneA..oneB || num in twoA..twoB)
}