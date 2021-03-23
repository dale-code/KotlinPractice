package wadale.apps.practicekotlin

fun getMaxPairwiseProduct(numbers: ArrayList<Int>):Int {
    fun max(a: Int, b: Int): Int {
        return if (a >= b) a else b
    }
    var maxProduct = 0
    var newNumber = 2
    val n = numbers.size
    for (first in 0 until n) {
        for (second in first + 1 until n) {
            maxProduct = max(maxProduct,
                    numbers[first] * numbers[second])
        }
    }
    return maxProduct
}fun main() {

    val numbers = arrayListOf(4, 5, 7, 8, 5, 3, 1, 6, 9, 11, 45, 32, 7)
    println(getMaxPairwiseProduct(numbers))

    Job_Seeker("Dare",23,"4ft")// initialized class properties


}

class Job_Seeker(val name: String, val age: Int, val height: String) // declaring class properties

