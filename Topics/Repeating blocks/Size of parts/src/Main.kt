fun main() {
    val num = readln().toInt()
    var a = 0
    var b = 0
    var c = 0

    repeat(num) {
        val x = readln().toInt()
        if (x == 0) {
            a += 1
        } else if (x > 0) {
            b += 1
        } else {
            c += 1
        }
    }

    print(a)
    print(" ")
    print(b)
    print(" ")
    print(c)
}