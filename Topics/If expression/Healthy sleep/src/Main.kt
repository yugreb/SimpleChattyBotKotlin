fun main() {    
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()

    if (b < h) {
        println("Excess")
    } else if (h < a) {
        println("Deficiency")
    } else {
        println("Normal")
    }
}