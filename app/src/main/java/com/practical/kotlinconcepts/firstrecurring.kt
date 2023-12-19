package com.practical.kotlinconcepts

fun main() {

    findFirstRecurringElement(intArrayOf(2, 3, 5,2,3))
}

fun findFirstRecurringElement(array: IntArray): Int {
    var map: HashMap<Int, Int> = HashMap()
     var recurringElement=0
    for (i in 0..array.size-1) {
        if (map.containsKey(array[i])) {
            recurringElement= array[i]
            break
        } else {
            map[array[i]] = array[i]
        }
    }
    println("return val " + recurringElement)
return recurringElement
}