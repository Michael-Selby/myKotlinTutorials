class SimpleCalculator {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }
}

fun main() {
    val calculator = SimpleCalculator()

    println("Enter first number:")
    val first = readLine()!!.toInt()

    println("Enter second number:")
    val second = readLine()!!.toInt()

    println("Choose operation: + for addition, - for subtraction")
    val op = readLine()!!

    val result = when (op) {
        "+" -> calculator.add(first, second)
        "-" -> calculator.subtract(first, second)
        else -> {
            println("Invalid operation")
            return
        }
    }

    println("Result: $result")
}
