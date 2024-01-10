package com.practical.kotlinconcepts

fun main() {

    finddistinctWays(4)


//    val fib_len = 9
//
//    print("Fibonacci Series of $fib_len numbers is: \n")
//
//    for (i in 0 until fib_len) {
//        print(" " + fibbonaci(i))
//    }
}

//0,1,1,2,3


fun fibbonaci(n: Int): Int {
    if (n == 0)
        return 0
    if (n == 1)
        return 1

    return fibbonaci(n - 1) + fibbonaci(n - 2)

}


//You are climbing a staircase. It takes n steps to reach the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


fun finddistinctWays(n: Int): Int {
    if (n < 2)
        return n
    var distinctways = 0
    var twosteps = 2
    var onesteps = 1
    for (i in 2..n) {
        distinctways = twosteps + onesteps
        twosteps = onesteps
        onesteps = distinctways

    }

    print("distinctways " + distinctways)

    return distinctways
}
