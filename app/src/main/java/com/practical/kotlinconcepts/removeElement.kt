package com.practical.kotlinconcepts



/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.*/


fun main() {

    removeElement(intArrayOf(3,2,2,3),3)
}

fun removeElement(nums: IntArray, `val`: Int): Int {


   var counter=0

    for (i in 0..nums.size-1)
    {
        if(`val`!=nums[i])
            nums[counter++]=nums[i]
    }
    return counter

}