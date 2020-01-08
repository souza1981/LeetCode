class ContainsDuplicate(){
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.size != nums.distinct().size
    }
}

fun main(args: Array<String>) {
    val numArray = intArrayOf(1,1,1,3,3,4,3,2,4,2)
    val solution = ContainsDuplicate()
    println(solution.containsDuplicate(numArray))
}