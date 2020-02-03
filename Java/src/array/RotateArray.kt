package array

class RotateArrayKotlin {
    fun rotate(nums: IntArray, k: Int): Unit {
        if (nums.isEmpty()) return
        if (nums.size == k) return
        var quantidadeRotacoes = k
        if (quantidadeRotacoes > nums.size) {
            quantidadeRotacoes = k % nums.size
        }

        val divisorArray = nums.size - quantidadeRotacoes
        val primeiraParteArray = nums.copyOfRange(divisorArray , nums.size)
        val segundaParteArray = nums.copyOfRange(0, divisorArray)

        for ((index, value) in nums.withIndex()) {
            if (index <= primeiraParteArray.size - 1) {
                nums[index] = primeiraParteArray[index]
            } else {
                nums[index] = segundaParteArray[index - primeiraParteArray.size]
            }
        }
    }
}

fun main(args: Array<String>) {

    val rotateArray = RotateArrayKotlin()
    val numArray = intArrayOf(-1,-100,3,99)
    //val numArray = intArrayOf(1,2,3,4,5,6,7)
    rotateArray.rotate(numArray,5)
    println(numArray)

}
