fun isVowel(letter: Char) = letter.uppercaseChar() in "AEIOU"

fun main() {
    val letter = readln().first()

    println(isVowel(letter))
}