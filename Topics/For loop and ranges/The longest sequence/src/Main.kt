fun main() {
    val n = readln().toInt()
    var maxSeq = 0
    var curSeq = 0
    var last = 0
    var current: Int

    for (i in 1..n) {
        current = readln().toInt()
        if (last <= current) {
            curSeq += 1
        }
        if (curSeq >= maxSeq) {
            maxSeq = curSeq
        }
        if (current < last) {
            curSeq = 1
        }
        last = current
    }

    println(maxSeq)
}