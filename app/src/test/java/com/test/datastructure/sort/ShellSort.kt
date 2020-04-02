package com.test.datastructure.sort

import org.junit.Test

class ShellSort {
    private val dataList = intArrayOf(0, 2, 1, 100, 82, 89, 99, 21, 26, 37, 10, 31, 19, 14, 77, 55, 33)

    @Test
    fun test(){
        shellSort(dataList)

        for(data in dataList){
            println("quickSort value = $data")
        }
    }

    private fun intervalSort(a: IntArray, begin: Int, end: Int, interval: Int) {
        var j: Int
        var i = begin + interval
        while (i <= end) {
            val item = a[i]
            j = i - interval
            while (j >= begin && item < a[j]) {
                a[j + interval] = a[j]
                j -= interval
            }
            a[j + interval] = item
            i += interval
        }
    }

    private fun shellSort(data: IntArray) {
        println("정렬할 원소:" + data.contentToString())
        println("-----------------셸 정렬 수행------------------")

        val size = data.size
        var interval = size / 2
        while (interval >= 1) {
            for (i in 0 until interval) {
                intervalSort(data, i, size - 1, interval)
            }
            println("interval = $interval")
            for (t in 0 until size) {
                print(data[t].toString() + " ")
            }
            println()
            interval /= 2
        }
    }

}