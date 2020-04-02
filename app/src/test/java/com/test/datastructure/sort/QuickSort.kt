package com.test.datastructure.sort

import android.util.Log
import org.junit.Test

class QuickSort {
    private val dataList = intArrayOf(0, 2, 1, 100, 82, 89, 99, 21, 26, 37, 10, 31, 19, 14, 77, 55, 33)

    @Test
    fun test(){
        quickSort(dataList, 0, dataList.size - 1)

        for(data in dataList){
            println("quickSort value = $data")
        }
    }

    private fun quickSort(array: IntArray, left: Int, right: Int) {
        if (left >= right)
            return

        var pi = partition(array, left, right);

        quickSort(array, left, pi - 1);
        quickSort(array, pi + 1, right);
    }


    fun partition(array: IntArray, left: Int, right: Int): Int {
        val pivot = array[left]
        var i = left
        var j = right

        while (i < j) {
            while (pivot < array[j]) {
                j--
            }
            while (i < j && pivot >= array[i]) {
                i++
            }
            swap(array, i, j)
        }

        array[left] = array[i]
        array[i] = pivot
        return i
    }

    fun swap(array: IntArray, a: Int, b: Int) {
        val temp = array[b]
        array[b] = array[a]
        array[a] = temp
    }
}