package com.test.datastructure.sort

import org.junit.Test

class HeapSort:BaseTest(){
    //출처 https://mygumi.tistory.com/310
    private val dataList = intArrayOf(0, 2, 1, 100, 82, 89, 99, 21, 26, 37, 10, 31, 19, 14, 77, 55, 33)

    @Test
    fun test(){
        showArray(dataList)
        heapSort(dataList)
        showArray(dataList)
    }

    private fun heapSort(array: IntArray) {
        val n = array.size
        // init, max heap
        for (i in n / 2 - 1 downTo 0) {
            heapify(array, n, i)
        }
        // for extract max element from heap
        for (i in n - 1 downTo 1) {
            swap(array, 0, i)
            heapify(array, i, 0)
        }
    }

    private fun heapify(array: IntArray, n: Int, i: Int) {
        var p = i
        val l = i * 2 + 1
        val r = i * 2 + 2
        if (l < n && array[p] < array[l]) {
            p = l
        }
        if (r < n && array[p] < array[r]) {
            p = r
        }
        if (i != p) {
            swap(array, p, i)
            heapify(array, n, p)
        }
    }

    private fun swap(array: IntArray, a: Int, b: Int) {
        val temp = array[a]
        array[a] = array[b]
        array[b] = temp
    }
}