package com.practical.kotlinconcepts


fun main() {

    val a = intArrayOf(1, 3)
    val b = intArrayOf(2)
    findMedianSortedArrays(a, b)
}


// 1,3
// 2


fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

    val loopcount = nums1.size + nums2.size
    val resultArray = DoubleArray(loopcount)
    var median: Double = 0.00
    var n = nums1.size
    var m = nums2.size
    var first = 0
    var second = 0
    var loop = 0


    val mediunNumber = (loopcount + 1) / 2
    val isMiddle = (loopcount+1) % 2 == 0


    while (loop < loopcount) {

        if (first < n && second < m) {
            if (nums1[first] > nums2[second]) {
                resultArray[loop] = nums2[second].toDouble()
                second++
            } else {
                resultArray[loop] = nums1[first].toDouble()
                first++
            }
        } else if (first < n) {
            resultArray[loop] = nums1[first].toDouble()
            first++
        } else if (second < m) {
            resultArray[loop] = nums2[second].toDouble()
            second++
        }

        if (loop == mediunNumber - 1) median += resultArray[loop]
        if (!isMiddle) {
            if (mediunNumber == loop) {
                median += resultArray[loop]
                median /= 2
            }
        }


        loop++


    }


    return median


}
