package com.practical.kotlinconcepts


//Cases:
//strs = ["flower","flow","flight"]


fun main() {
//    longestCommonPrefix(arrayOf("flower", "flight", "flight"))
    isValid("{[]}")
}

fun longestCommonPrefix(strs: Array<String>): String {

    strs.sort()

    val first = strs[0]
    first.forEachIndexed { i, c ->
        if (strs.any { it.length == i || it[i] != c })
            return first.substring(0, i)
    }
    return first

}


fun isValid(s: String): Boolean {
    val s = s.replace("()", "").replace("{}", "").replace("[]", "")
    return s == ""

}


