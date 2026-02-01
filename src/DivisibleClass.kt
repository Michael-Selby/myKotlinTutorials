fun findFirstDivisible(nums: IntArray): Int? {
    for (num in nums) {
        if (num % 3 == 0 && num % 5 != 0) {
            return num
        }
    }
    return null
}

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5)
    val result = findFirstDivisible(nums)

    if (result != null) {
        println("First divisible number: $result")
    } else {
        println("No matching number found")
    }
}