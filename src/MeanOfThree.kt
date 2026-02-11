class MeanOfThree {

    fun mean(a: Double, b: Double, c: Double): Double {
        return (a + b + c) / 3.0
    }
}

fun main() {
    val calculator = MeanOfThree()

    println("Enter first number:")
    val first = readLine()!!.toDouble()

    println("Enter second number:")
    val second = readLine()!!.toDouble()

    println("Enter third number:")
    val third = readLine()!!.toDouble()

    val result = calculator.mean(first, second, third)

    println("Mean of the three numbers: $result")
}
