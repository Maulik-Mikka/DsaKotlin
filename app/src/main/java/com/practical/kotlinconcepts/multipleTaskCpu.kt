package com.practical.kotlinconcepts

import kotlin.math.log


//When multiple tasks are executed on a single threaded CPU,
// the tasks are scheduled based on the principle of pre-emption.
// When A higher priority task arrives in the execution queue, then the lower priority task
// is pre-empted, te. its execution is paused until the higher priority task is complete.
//There are n functions to be executed on a single-threaded CPU,
// with each function having a unique ID between 0 and n-1.
// Given an integer n, representing the number of functions to be executed.
// and an execution log as an array of strings, logs, of size m,
// determine the exclusive times of each of the functions.
// Exclusive time is the sum of execution times for all calls to a function.
// Any string representing an execution fog is of the form (function_id): ("start"/"end"): (timestamp),
// indicating that the function with ID= function_id, either starts or ends at a time identified by the timestamp value.
//
//Note: While calculating the execution time of a function call, both the starting and ending times of the function call have to be included. The log of the form (function_id}:(start): {timestamp) means that the running function is preempted at the beginning of timestamp second.
// The log of the form (function_id}:(end): (timestamp) means that the function function_id is preempted after completing its execution at timestamp second i.e after timestamp second.
//Example
//Suppose n = 3, logs = ["0:start:0", "2:start:4", "2:end:5", "1:start:7", "1:end:10", "0:end:11"]
fun exclusiveTime(n: Int, logs: Array<String>): Array<Int> {
    var exclusiveTime =  Array<Int>(n){0}
    var consumedTime = 0
    var prevFunId = -1

    for (log in logs) {

        val (funId, funStaus, time) = log.split(":")
        val functionId: Int = funId.toInt()
        val timeStamp = time.toInt()


        if (funStaus == "start") {

            if (prevFunId !=-1) {
                consumedTime = timeStamp - consumedTime
                exclusiveTime[prevFunId] = consumedTime
            }
            prevFunId = functionId
            consumedTime = timeStamp
        } else {
            exclusiveTime[functionId] += timeStamp - consumedTime + 1
            consumedTime = timeStamp + 1
        }




    }
    return exclusiveTime

}


fun exclusiveTime1(n: Int, logs: Array<String>):IntArray {
    var exclusiveTime =   IntArray(n){0}
    var consumedTime = 0
    var prevFunId = -1

    for (log in logs) {

        val (funId, funStaus, time) = log.split(":")
        val functionId: Int = funId.toInt()
        val timeStamp = time.toInt()


        if (funStaus == "start") {

            if (prevFunId !=-1) {
                consumedTime = timeStamp - consumedTime
                exclusiveTime[prevFunId] += consumedTime
            }
            prevFunId = functionId
            consumedTime = timeStamp
        } else {
            exclusiveTime[functionId] += timeStamp - consumedTime + 1
            consumedTime = timeStamp + 1
        }




    }
    return exclusiveTime

}

fun main() {
    val n = 1 // Number of functions



    val logs = arrayOf("0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7")

    val exclusiveTimes = exclusiveTime1(n, logs)

    println("Exclusive times for each function:")
    exclusiveTimes.forEachIndexed { index, time ->
        println("Function $index: $time")
    }
}

fun exclusiveTimeexi(n: Int, logs: Array<String>): Array<Int> {
    val exclusiveTimes = Array(n) { 0 }
    val stack = mutableListOf<Pair<Int, Int>>() // Pair of function ID and start time

    var prevTime = 0
    for (log in logs) {
        val (functionId, status, timestamp) = log.split(":")
        val id = functionId.toInt()
        val time = timestamp.toInt()

        if (status == "start") {
            if (stack.isNotEmpty()) {
                val prevFunc = stack.last()
                exclusiveTimes[prevFunc.first] += time - prevTime
            }
            stack.add(id to time)
            prevTime = time
        } else {
            val (startFuncId, startTime) = stack.removeAt(stack.size - 1)
            exclusiveTimes[id] += time - startTime + 1
            prevTime = time + 1
            for (i in stack.indices) {
                stack[i] = stack[i].copy(second = time + 1)
            }
        }
    }
    return exclusiveTimes
}



