package com.practical.kotlinconcepts

//Log all pairs of array

fun main() {
    //findAllPairs(array)
//    twoSum(arraysum, target)
//    isPalindrome(-121)
    romanToInt("LVIII")
}


private fun findAllPairs(array: Array<out Any>) {

    for (item in array.indices) {

        for (subitem in array.indices) {

            val a = array[item]
            val b = array[subitem]
            println("pairs --> $a  $b")

        }

    }
}


// nums = [2,7,11,15], target = 9

fun twoSum(nums: Array<Int>, target: Int): IntArray {
    val map: HashMap<Int, Int> = HashMap()
    val result = IntArray(2)
    for (i in nums.indices) {
        if (map.containsKey(target - nums[i])) {
            result[0] = i
            result[1] = map[target - nums[i]]!!
            println("position ${result.toList()}")
        }

        map[nums[i]] = i


    }
    return result
}

fun isPalindrome(x: Int): Boolean {

    var num = x
    var reversed = 0
    if (num < 0) return false
    while (num != 0) {
        val myTemp = num % 10
        reversed = reversed * 10 + myTemp
        num /= 10
    }



    println("isPalindrome ${x == reversed}")

    return x == reversed
}


fun romanToInt(s: String): Int {
    val romanPatterns = arrayOf("I,V,X,L,C,D,M,IV,IX,XL,CX,CD,MC")
    var finalValue = 0

    val charArray: CharArray = s.toCharArray()

    var indicesCounted = -1
    for (indices in charArray.indices) {
        if (indices == indicesCounted)
            continue
        when (charArray[indices].toString()) {
            "I" -> {
                if(indices==charArray.size-1)
                {
                    finalValue += 1
                    println("Value -->$finalValue")
                    return finalValue
                }

                when (charArray[indices + 1].toString()) {
                    "V" -> {
                        finalValue += 4
                        indicesCounted = indices + 1
                    }

                    "X" -> {
                        finalValue += 9
                        indicesCounted = indices + 1
                    }

                    else -> finalValue += 1
                }

            }

            "V" -> finalValue += 5

            "X" -> {

                if(indices==charArray.size-1)
                {
                    finalValue += 10
                    println("Value -->$finalValue")
                    return finalValue
                }
                when (charArray[indices + 1].toString()) {
                    "L" -> {
                        finalValue += 40
                        indicesCounted = indices +1
                    }

                    "C" -> {
                        finalValue += 90
                        indicesCounted = indices +1
                    }

                    else -> finalValue += 10
                }

            }

            "L" -> finalValue += 50
            "C" -> {

                if(indices==charArray.size-1)
                {
                    finalValue += 100
                    println("Value -->$finalValue")
                    return finalValue
                }
                when (charArray[indices + 1].toString()) {
                    "M" -> {
                        finalValue += 900
                        indicesCounted = indices +1
                    }

                    "D" -> {
                        finalValue += 400
                        indicesCounted = indices +1
                    }

                    else -> finalValue += 100
                }

            }

            "D" -> finalValue += 500
            "M" -> finalValue += 1000


        }
    }

    println("Value -->$finalValue")
    return finalValue


}








