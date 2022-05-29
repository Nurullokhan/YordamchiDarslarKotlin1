package Lesson8

fun main(args: Array<String>) {

    //todo 6-topshiriq
    // m va n butun musbat sonlari va m ta butun sonlar to’plami berilgan, mxn o’lchamli matrisani shunday hosil qilingki, uning har bir ustuni kiritilgan m ta sondan iborat bo’lsin.

    val row = 4
    val column = 4

    val matrixArray = arrayOf(3, 5, 7, 2, 4, 6)
    val matrix = Array(row) { IntArray(column) }

    for (i in matrix.indices) {
        for (j in 0 until column) {
            matrix[i][j] = matrixArray[i]
        }
    }

    for (i in 0 until row) {
        for (j in 0 until column) {
            print("${matrix[i][j]} ")
        }
        println()
    }

}