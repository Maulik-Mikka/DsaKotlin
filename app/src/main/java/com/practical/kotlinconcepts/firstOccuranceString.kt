package com.practical.kotlinconcepts

fun main() {

    strStr("mississippi", "issipi")

}

//m-0
//i-s-s-i

fun strStr(haystack: String, needle: String): Int {
    var invalidIndex = -1
    if (needle.length > haystack.length)
        return invalidIndex
    var nIndex = 0
    var index = 0
    val haystackLegnth = haystack.length
    val needleLegnth = needle.length

    while (index <= haystackLegnth - 1) {
        if (needle[nIndex] == haystack[index]) {
            nIndex = nIndex + 1
            index++

        } else {
            if (nIndex > 0) {
                index = index+1 -nIndex
            } else {
                index = index + 1
            }


            nIndex = 0
        }

        if (nIndex == needleLegnth) {
            return index - nIndex
        }

    }



    return invalidIndex
}