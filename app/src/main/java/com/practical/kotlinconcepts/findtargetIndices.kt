package com.practical.kotlinconcepts

//You are given a 0-indexed integer array nums and a target element target.
//
//A target index is an index i such that nums[i] == target.
//
//Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.

//Example 1:
//
//Input: nums = [1,2,5,2,3], target = 2
//Output: [1,2]
//Explanation: After sorting, nums is [1,2,2,3,5].
//The indices where nums[i] == 2 are 1 and 2.

fun main() {


    targetIndices(intArrayOf(100,1,100),100)
}
fun targetIndices(nums: IntArray, target: Int): List<Int> {

    var resultList= ArrayList<Int>()
    var sortedNums = nums.sorted()
    var start = 0
    var end = nums.size

    while (start <= end) {
        var mid = (start + end) / 2

        if(mid >= sortedNums.size)
            break

        if (sortedNums[mid] > target) {
            end = mid - 1
        }else if( sortedNums[mid]== target)
        {
            resultList.add(mid)
            start = mid+1

        }else{
            start = mid+1
        }

    }

    return resultList.sorted()


}