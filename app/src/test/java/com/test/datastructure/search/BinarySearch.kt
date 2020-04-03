package com.test.datastructure.search

import org.junit.Test

class BinarySearch {
    private val findValue =  4

    @Test
    fun test() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val index = binarySearch(arr,findValue)
        println("$findValue Index : $index")
    }

    private fun binarySearch(arr: IntArray, key: Int):Int {
        var mid: Int
        var left = 0
        var right = arr.size - 1
        while (right >= left) {
            mid = (right + left) / 2
            if (key == arr[mid]) {
                return mid
            }
            if (key < arr[mid]) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return -1
    }
}