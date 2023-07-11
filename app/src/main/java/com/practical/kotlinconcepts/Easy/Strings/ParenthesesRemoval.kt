package com.practical.kotlinconcepts.Easy.Strings

import androidx.compose.animation.core.animateRectAsState

fun main() {
    //Cases
    //Empty String
    // Odd Number String
    // Starting from closing Parenthesis
    //Here I am using Mutablelist which we can in future replace with Hashmap bcz Timecomplexity & space Complexity of
    //HashMap is O(1)


    isValid("[[[]")
}


fun isValid(s: String): Boolean {

    val itemList = mutableListOf<Char>()
    val itemArray = s.toCharArray()

    if (itemArray.size % 2 != 0) return false

    for (i in itemArray.indices) {
        if (itemList.isEmpty()) {
            if (itemArray[i] == '(' || itemArray[i] == '[' || itemArray[i] == '{')
                itemList.add(itemArray[i]) else return false
        } else {
            val lastIndex = itemList.lastIndex
            val lastChar = itemList[lastIndex]

            if (itemArray[i] == '}') {
                if (lastChar == '{') {
                    itemList.removeAt(lastIndex)
                } else {
                    itemList.add(itemArray[i])
                }
            } else if (itemArray[i] == ']') {
                if (lastChar == '[') {
                    itemList.removeAt(lastIndex)
                } else {
                    itemList.add(itemArray[i])
                }

            } else if (itemArray[i] == ')') {
                if (lastChar == '(') {
                    itemList.removeAt(lastIndex)
                } else {
                    itemList.add(itemArray[i])
                }

            } else {
                itemList.add(itemArray[i])
            }

        }
    }

    return itemList.isEmpty()
}

