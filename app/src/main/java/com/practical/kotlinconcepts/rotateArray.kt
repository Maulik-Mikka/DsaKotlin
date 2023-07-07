package com.practical.kotlinconcepts

fun main() {

    rotate(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3)
}

fun rotate(nums: IntArray, k: Int): Unit {
    val array2 = nums
    val length = array2.size
    val temp = nums[length-1]

    for (num in array2.indices) {
        if (num < length - 1) {
            nums[num+1] = nums[num]
        } else {
            nums[num] = temp
        }
    }


}