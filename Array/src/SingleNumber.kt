class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        val num = nums.asList().groupingBy { it }.eachCount().filterValues { it == 1 }
        return num.keys.elementAt(0)
    }
}

fun main() {
    var numArray = intArrayOf(4,1,2,1,2)
    val solution = SingleNumber()
    println(solution.singleNumber(numArray))
}