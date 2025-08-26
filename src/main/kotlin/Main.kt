fun main() {
    println("Enter string to reverse:")
    val inputString = readln()

    val reverseString = reverseString(inputString)
    if (reverseString == inputString)
    println("this is a palindrome")
    else  println("The reversed string is: ${reverseString(inputString)}")

}

fun reverseString(reverse: String): String {
    val finalString = buildString {
        for (i in reverse.lastIndex downTo 0) {
            append(reverse[i])
        }
    }
    return finalString
}