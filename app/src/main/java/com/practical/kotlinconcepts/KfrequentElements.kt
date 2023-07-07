package com.practical.kotlinconcepts

fun main() {
    topKFrequent(intArrayOf(4, 1, -1, 2, -1, 2, 3), 2)
}


fun topKFrequent(nums: IntArray, k: Int): IntArray {
    var items: HashMap<Int, Int> = HashMap()
    var result = IntArray(k)
    for (n in nums.indices)
        if (items.containsKey(nums[n])) {
            items[nums[n]] = items[nums[n]]!! + 1
        } else {
            items[nums[n]] = 1
        }

    items.toSortedMap()


    return result


}