package com.practical.kotlinconcepts

fun main() {
//    topKFrequent(intArrayOf(4, 1, -1, 2, -1, 2, 3), 2)
    topKFrequent(arrayOf("i","love","leetcode","i","love","coding"),3)
}


fun topKFrequent(nums: IntArray, k: Int): IntArray {
    var items: HashMap<Int, Int> = HashMap()
    var result = IntArray(k)

    //Time Complexity 0(n)
    for (n in nums.indices)
        if (items.containsKey(nums[n])) {
            items[nums[n]] = items[nums[n]]!! + 1
        } else {
            items[nums[n]] = 1
        }

    val list = items.toList().sortedBy { it.second }

    //Time Complexity 0(k)
    for (i in 0 until k) {
        result[i] = list[list.lastIndex-i].first
    }

    return result

//Total O(k+n)
//Space Complexity O(n+k)  Worst Case
}



fun topKFrequent(words: Array<String>, k: Int): List<String> {

    var items: HashMap<String, Int> = HashMap()
    var result = MutableList(k){""}

    //Time Complexity 0(n)
    for (n in words.indices)
        if (items.containsKey(words[n])) {
            items[words[n]] = items[words[n]]!! + 1
        } else {
            items[words[n]] = 1
        }

    val list = items.toList().sortedBy { it.second }

    //Time Complexity 0(k)
    for (i in 0 until k) {
        result[i] = list[list.lastIndex-i].first
    }

    return result

//Total O(k+n)
//Space Complexity O(n+k)  Worst Case

}