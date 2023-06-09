fun main() {
    val symb = readln().first()
    var dig = 0
    if (symb.isDigit()) {
        dig = symb.digitToInt()
        println(dig in 1..9)
    } else {
        println(symb.isUpperCase())
    }
}