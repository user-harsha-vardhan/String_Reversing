fun main () {
   println("Enter string to reverse:")
    val inputString = readln()

    val finalString = buildString {
        for (i in inputString.lastIndex downTo 0) {
            append(inputString[i])
        }
    }
    println("The reversed string is: $finalString")
}