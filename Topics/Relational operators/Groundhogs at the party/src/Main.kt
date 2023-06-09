fun main() {
    val a = readln().toInt()
    val b = readln().toBoolean()

    if (b) {
        if (a >= 15 && a <= 25) {
            println(true)
        } else {
            println(false)
        }
    } else {
        if (a >= 10 && a <= 20) {
            println(true)
        } else {
            println(false)
        }
    }
}