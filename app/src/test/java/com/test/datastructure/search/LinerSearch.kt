package com.test.datastructure.search

import org.junit.Test

class LinerSearch {
    private val findValue =  5

    @Test
    fun test() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val index = binarySearch(arr, findValue)
        println("$findValue Index : $index")
    }

    private fun binarySearch(arr: IntArray, key: Int):Int {
        for(index in arr.indices){
            if(arr[index] == key)
                return index
        }

        return -1
    }
}