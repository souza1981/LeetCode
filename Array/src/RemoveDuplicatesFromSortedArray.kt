class Solution{
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        nums.sort()
        var actualNumber = -1
        var distinctIndex = 0
        nums.forEachIndexed {
            index, element ->
            if (element != actualNumber || distinctIndex == 0){
                actualNumber = element
                nums[distinctIndex] = nums[index]
                distinctIndex++
            }
        }
        return distinctIndex

    }
}

fun main(){
    val solution = Solution()
    val numArray = intArrayOf(1,1,2)
    println(solution.removeDuplicates(numArray))
}
