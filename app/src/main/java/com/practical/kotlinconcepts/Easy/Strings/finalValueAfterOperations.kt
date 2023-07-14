package com.practical.kotlinconcepts.Easy.Strings

fun main() {

    finalValueAfterOperations(arrayOf("--X", "X++", "X++"))
}

fun finalValueAfterOperations(operations: Array<String>): Int {

    var result = 0
    for (i in operations.indices) {
        when (operations[i]) {
            "--X", "X--" -> result -= 1
            "X++", "++X" -> result += 1
        }

    }
    return result
}