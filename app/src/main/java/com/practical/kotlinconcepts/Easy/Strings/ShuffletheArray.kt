package com.practical.kotlinconcepts.Easy.Strings



fun main() {
    shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3)
}

//0-0 = 2

//1 -> 3 =  3

//2 -> 1 =5

//3-> 4 = 4

//4 > 2 = 1

//5 = 5 // 7

fun shuffle(nums: IntArray, n: Int): IntArray {
    var resultArray: IntArray = IntArray(nums.size)
    resultArray[0] = nums[0]
    var iteration = n
    for (i in nums.indices) {
        if (i % 2 != 0) {
            resultArray[i] = nums[iteration]
            iteration += 1
        } else {
            resultArray[i] = nums[iteration - n]
        }
    }
    return resultArray

}