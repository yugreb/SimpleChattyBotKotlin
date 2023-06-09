fun main() {
    val sourceStr = readln().split(' ')
    val firstName = sourceStr[0]
    val lastName = sourceStr[1]
    val age = sourceStr[2]

    println(firstName[0] + ". " + lastName + ", " + age + " years old")
}