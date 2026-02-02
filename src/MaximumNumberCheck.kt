fun main() {
    val numbers = intArrayOf(42, 17, 68)   // supply your three numbers here
    var max = numbers[0]

    for (i in 1 until numbers.size) {
        if (numbers[i] > max) {
            max = numbers[i]
        }
    }

    println("Maximum value: $max")
}