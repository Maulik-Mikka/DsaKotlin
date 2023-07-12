package com.practical.kotlinconcepts.Easy.Strings

fun main() {

    removeVowels("leetcodeisacommunityforcoders")
}


fun removeVowels(s: String): String {
    var result = ""
    for (i in s.indices) {
        if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
        } else {
            result += s[i]
        }
    }

    return result
}