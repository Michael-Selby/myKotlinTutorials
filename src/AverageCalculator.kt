class AverageOfThree(private val numbers: IntArray) {
    init {
        require(numbers.size == 3) { "Exactly 3 numbers are required" }
    }

    fun average(): Double {
        return numbers.sum().toDouble() / numbers.size
    }
}

fun main() {
    val sampleNumbers = intArrayOf(10, 20, 30)
    val calculator = AverageOfThree(sampleNumbers)
    println("Average of the three numbers: ${calculator.average()}")
}
