package com.test.datastructure.sort

import org.junit.Test

class ShellSort :BaseTest(){
    private val dataList = intArrayOf(0, 2, 1, 100, 82, 89, 99, 21)
//    private val dataList = intArrayOf(0, 2, 1, 100, 82, 89, 99, 21, 26, 37, 10, 31, 19, 14, 77, 55, 33)

    @Test
    fun test(){
        println("정렬할 원소:" + dataList.contentToString())
        println("-----------------셸 정렬 수행------------------")
        shellSort(dataList)
        showArray(dataList)
    }

    private fun intervalSort(a: IntArray, begin: Int, end: Int, interval: Int) {
        var j: Int
        var i = begin + interval

        while (i <= end) {
            val item = a[i]
            j = i - interval
            println("item = $item, i = $i, j = $j")
            while (j >= begin && item < a[j]) {
                a[j + interval] = a[j]
                j -= interval
                println("while i = $i, j = $j")
            }
            a[j + interval] = item
            i += interval
            println("break i = $i, j = $j")
        }
    }

    private fun shellSort(data: IntArray) {
        val size = data.size
        var interval = size / 2
        while (interval >= 1) {
            if(interval % 2 == 0){
                interval++
            }

            println("interval = $interval")
            for (i in 0 until interval) {
                println("--interval index = $i")
                intervalSort(data, i, size - 1, interval)
                showArray(data)
            }

            interval /= 2
        }
    }

}