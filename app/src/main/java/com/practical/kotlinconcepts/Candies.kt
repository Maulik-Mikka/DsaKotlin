package com.practical.kotlinconcepts


// [1,0,2]
// 1 -> 1
// 1,0 -> item[0]>item[1]
//1,0,0 -> item[]

//1,0,2
//2,1,1
//2,1,2
//29,51,87,87,72,12

//--> 1,2,3,3,2,1


//-->


fun main() {
    val ratings = intArrayOf(29, 51, 87, 87, 72, 12)
    candy(ratings)
}

fun candy(ratings: IntArray): Int {
    var distributedCandies = 0
    var candies = IntArray(ratings.size) { 1 }

val ind= ratings.size-2
    for (i in 0..ind ) {
        if (ratings[i] > ratings[i + 1]) {
            candies[i] = candies[i + 1] + 1
        }
    }

    for (i in ratings.size-1 downTo  1) {
        if (ratings[i] > ratings[i -1]) {
            candies[i] = candies[i - 1] + 1
        }


    }




return 0
}

