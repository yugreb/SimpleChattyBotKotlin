fun main() {
    var max = 0
    do {
        val a = readln().toInt()
        max = maxOf(a, max)
    } while (a != 0)
    println(max)
}