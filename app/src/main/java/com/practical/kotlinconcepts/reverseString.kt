package com.practical.kotlinconcepts


// ["h","e","l","l","o"]
//1.what if array is blank
//
fun main() {

//reverseString(charArrayOf('h','e','l','l','o'))
//    sum("2","3")
    val array = intArrayOf()
//    plusOne(intArrayOf(9))
    //legnthofLastWord("   fly me   to   the moon  ")

    searchInsert(intArrayOf(1, 3, 5, 6), 5)
}

fun reverseString(s: CharArray): Unit {
    s.apply { reverse() }
}

fun sum(s1: String, s2: String) {

}

fun legnthofLastWord(s: String) {
    val s = s.trim().substringAfterLast(" ").length
}

fun plusOne(digits: IntArray): IntArray {
    var items = digits.size - 1
    var itemsArray = digits

    while (items > -1) {
        if (digits[items] == 9) {
            itemsArray[items] = 0
            if (items == 0)
                itemsArray = intArrayOf(1, *digits.copyOf())
        } else {
            itemsArray[items] = digits[items] + 1

            break
        }
        items -= 1
    }
    return itemsArray
}


fun searchInsert(nums: IntArray, target: Int): Int {
    var k = 0
    nums.forEachIndexed { i, int ->
        if (nums[i] == target) return i
        else if (nums[i] > target)
            return i - 1
        else if (i == nums.lastIndex)
            return i + 1
    }
    return k
}

