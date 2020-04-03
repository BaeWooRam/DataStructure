package com.test.datastructure.sort

import android.util.Log
import org.junit.Test

class QuickSort:BaseTest() {
    private val dataList = intArrayOf(5,6,7,1,2,10,4,9,8,10,1,4)

    @Test
    fun test(){
        showArray(dataList)
        quickSort(dataList, 0, dataList.size - 1)
        showArray(dataList)
    }

    private fun quickSort(array: IntArray, left: Int, right: Int) {
        if (left >= right)
            return

        var pi = partition(array, left, right);

        quickSort(array, left, pi - 1);
        quickSort(array, pi + 1, right);
    }


    private fun partition(array: IntArray, left: Int, right: Int): Int {
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
            println("pivot = $pivot, i = $i, j = $j")
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

        showArray(array)
    }

}