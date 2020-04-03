package com.test.datastructure.sort

import org.junit.Test

class InsertionSort: BaseTest() {
    //출처 https://mygumi.tistory.com/310
    private val dataList = intArrayOf(0, 2, 1, 100, 82, 89, 99, 21, 26, 37, 10, 31, 19, 14, 77, 55, 33)

    @Test
    fun test(){
        showArray(dataList)
        insertionSort(dataList)
        showArray(dataList)
    }

    //삽입정렬(insertion sort)
    private fun insertionSort(array: IntArray) {
        val size = array.size
        for (index in 1 until size) {
            var point = index
            for (compare in index - 1 downTo 0) {
                if (array[point] < array[compare]) {
                    swap(array, point, compare)
                    point = compare
                }
            }
        }
    }

    private fun swap(array: IntArray, point: Int, compare: Int) {
        val temp = array[point]
        array[point] = array[compare]
        array[compare] = temp
    }

}