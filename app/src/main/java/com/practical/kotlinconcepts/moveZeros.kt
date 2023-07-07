package com.practical.kotlinconcepts


fun main() {
//    moveZeroes(intArrayOf(1))
    containsDuplicate(intArrayOf(1,2,3,1))
}


fun moveZeroes(nums: IntArray): Unit {

    var position = 0

    nums.forEachIndexed { index, value ->
        var temp = 0
        if (value != 0) {
            temp = nums[position]
            nums[position] = value
            nums[index] = temp
            position++
        }


    }

}
    fun containsDuplicate(nums: IntArray): Boolean {

        var map: HashMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            if (map.containsKey(nums[i])) {
                return true
            }
            map[nums[i]] = i
        }
        return false

    }

