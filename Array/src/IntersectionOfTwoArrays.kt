import java.util.*

class IntersectionOfTwoArrays{
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
/*
        var maiorArray = nums2
        var menorArray = nums1
        if (nums1.size > nums2.size){
            maiorArray = nums1
            menorArray = nums2
        }
        maiorArray.sort()
        menorArray.sort()

        var arrayResult = mutableListOf<Int>()

        var indiceMaiorElemento = -1
        var elemento = 0
        var indiceMenorElemento = 0
        while (indiceMaiorElemento < maiorArray.size) {

            indiceMaiorElemento++
            elemento = maiorArray[indiceMaiorElemento]
            indiceMenorElemento = menorArray.indexOf(elemento)
            if (indiceMenorElemento >= 0){
                arrayResult.add(elemento)

                if (indiceMenorElemento == menorArray.size-1 || (indiceMaiorElemento+1 == maiorArray.size))
                    break

                while (maiorArray[indiceMaiorElemento+1] == menorArray[indiceMenorElemento+1]){
                    indiceMaiorElemento++
                    indiceMenorElemento++
                    arrayResult.add(maiorArray[indiceMaiorElemento])

                    if (indiceMenorElemento == menorArray.size-1 || (indiceMaiorElemento+1 == maiorArray.size))
                        break
                }
                if (indiceMaiorElemento+1 == maiorArray.size)
                    break
                while (maiorArray[indiceMaiorElemento] == maiorArray[indiceMaiorElemento+1]){
                    indiceMaiorElemento++
                    if (indiceMaiorElemento+1 == maiorArray.size)
                        break
                }
            }
        }
        return arrayResult.toIntArray()
*/

        nums1.sort()
        nums2.sort()
        var arrayResult = ArrayList<Int>()
        var indice1 = 0
        var indice2 = 0
        while (indice1 < nums1.size && indice2 < nums2.size) {
            when {
                nums1[indice1] > nums2[indice2] -> indice2++
                nums1[indice1] < nums2[indice2] -> indice1++
                else -> {
                    arrayResult.add(nums1[indice1])
                    indice1++
                    indice2++
                }
            }
        }
        return arrayResult.toIntArray()

    }
}

fun main(args: Array<String>) {
    val solution = IntersectionOfTwoArrays()
    //val numArray1 = intArrayOf(1,2,2,1)
    //val numArray2 = intArrayOf(2,2)
    val numArray1 = intArrayOf(54,93,21,73,84,60,18,62,59,89,83,89,25,39,41,55,78,27,65,82,94,61,12,38,76,5,35,6,51,48,61,0,47,60,84,9,13,28,38,21,55,37,4,67,64,86,45,33,41)
    val numArray2 = intArrayOf(17,17,87,98,18,53,2,69,74,73,20,85,59,89,84,91,84,34,44,48,20,42,68,84,8,54,66,62,69,52,67,27,87,49,92,14,92,53,22,90,60,14,8,71,0,61,94,1,22,84,10,55,55,60,98,76,27,35,84,28,4,2,9,44,86,12,17,89,35,68,17,41,21,65,59,86,42,53,0,33,80,20)

    println(Arrays.toString(solution.intersect(numArray1,numArray2)))

    val resultadoEsperado = intArrayOf(54,21,73,84,60,18,62,59,89,89,41,55,27,65,94,61,12,76,35,48,0,60,84,9,28,55,4,67,86,33)
    resultadoEsperado.sort()
    println(Arrays.toString(resultadoEsperado))
}

//[54,93,21,73,84,60,18,62,59,89,83,89,25,39,41,55,78,27,65,82,94,61,12,38,76,5,35,6,51,48,61,0,47,60,84,9,13,28,38,21,55,37,4,67,64,86,45,33,41]
//[17,17,87,98,18,53,2,69,74,73,20,85,59,89,84,91,84,34,44,48,20,42,68,84,8,54,66,62,69,52,67,27,87,49,92,14,92,53,22,90,60,14,8,71,0,61,94,1,22,84,10,55,55,60,98,76,27,35,84,28,4,2,9,44,86,12,17,89,35,68,17,41,21,65,59,86,42,53,0,33,80,20]

//[54,21,73,84,60,18,62,59,89,89,41,55,27,65,94,61,12,76,35,48,0,60,84,9,28,55,4,67,86,33]