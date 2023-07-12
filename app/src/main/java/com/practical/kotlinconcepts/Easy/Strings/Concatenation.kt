package com.practical.kotlinconcepts.Easy.Strings


//case 1: if size 0 then return array
//case 2: if element 1 then create array of 2 first element is 1


fun main() {
    getConcatenation(intArrayOf())
}


fun getConcatenation(nums: IntArray): IntArray {

    val size = nums.size
    var resultArray = IntArray(2 * size)
    for (i in nums.indices) {
        resultArray[i] = nums[i]
        resultArray[size + (i)] = nums[i]
    }

    return resultArray


}