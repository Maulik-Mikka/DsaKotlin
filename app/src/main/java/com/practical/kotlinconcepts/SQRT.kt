package com.practical.kotlinconcepts



fun main() {
    BST(8)
}


fun sqrt(value: Int) {
    var num = value
    var count = 0
    var odd = 1;
    while (num > 0) {
        num = num - odd
        if (num < 0) break
        odd += 2
        count++
    }
    print(count)
}


fun BST(num: Int): Int {

    var start:Double =1.0
    var end:Double = num.toDouble()
    var value:Double=num.toDouble()
    var mid:Double =-1.toDouble()
    if (num == 0 || num == 1)
        return num


    while (start <= end) {
         mid = (start + end)/2
        if(mid * mid > num)
        {
            end=mid-1
        }else if(mid*mid ==value)
        {
            return mid.toInt()
        }else {

            start = mid+1

        }

    }

    print(Math.round(end.toDouble()).toInt())
return  Math.round(end.toDouble()).toInt()

}