package com.practical.kotlinconcepts

fun main() {
    addBinary("1010", "1011")
}

//11 ,1
//1,11

//1011
//1010
//10101
fun addBinary(a: String, b: String):String {
    val lenA = a.length
    val lenB = b.length
     var carry = 0
    var result = ""

    var i = lenA - 1
    var j = lenB - 1
    var index = 0
    while (i >= 0 || j >= 0 || carry==1) {

        var sum = carry
        if (i >= 0) sum += a[i--] - '0'
        if (j >= 0) sum += b[j--] - '0'
        carry = if(sum > 1) 1 else 0

       result += (sum%2)



    }
    if(carry!=0)
        result +=carry

    return result.reversed()





}