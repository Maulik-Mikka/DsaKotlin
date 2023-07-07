package com.practical.kotlinconcepts

import kotlin.math.abs
import kotlin.math.pow


fun main() {
//    removeDuplicatesFromSortedArray()
//    reverse(1534236469)
    myPow(2.0, 10)
}

val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4) // Input array
fun removeDuplicatesFromSortedArray() {


    val k = removeDuplicates(nums); // Calls your implementation


}

fun removeDuplicates(nums: IntArray): Int {


    var uniquenumber = 0
    var indices = 0

    for (index in nums.indices) {
        if (index == 0) {
            uniquenumber++
        } else if (nums[index] == nums[indices]) {
            continue
        } else {
            nums[indices + 1] = nums[index]
            uniquenumber++
            indices += 1
        }

    }

    return uniquenumber
}

fun myPow(x: Double, n: Int): Double {

    if (n == 0 || x == 1.00)
        return 1.0
    var result: Double = if (n < 0) 1 / x else x
    var multiplicationNumber = if (n < 0) 1 / x else x
    var number =  Math.abs(n)
    var count=1

    var powerval = n
    while (powerval != 0) {
        if (x != 0.00) {
            if (abs(powerval) > 0) {
                if (number > 2) {
                    result = (result * result)
                    number = Math.abs(n) - (2 *count)
                    count+=count
                }
                else if(number>0) {
                    if(abs(number)==2)
                        number=1
                    result *= number * multiplicationNumber
                }else{
                    return result
                }
                powerval /= 2
            }
        }

    }

    return result

}

fun reverse(x: Int): Int {
    var reverseNumber = 0L
    var inputNumber = x
    var isNegative = false
    if (inputNumber < 0) {
        isNegative = true
    }
    while (inputNumber != 0) {
        val temp = inputNumber % 10
        reverseNumber = temp + (reverseNumber * 10)
        inputNumber /= 10

    }
    if (isNegative) reverseNumber = -abs(reverseNumber)


    return if (Int.MIN_VALUE < reverseNumber && reverseNumber < Int.MAX_VALUE) {
        reverseNumber.toInt()
    } else {
        0
    }


}












