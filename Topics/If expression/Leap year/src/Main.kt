fun main() {
    val num = readln().toInt()

    if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
        println("Leap")
    } else {
        println("Regular")
    }
}