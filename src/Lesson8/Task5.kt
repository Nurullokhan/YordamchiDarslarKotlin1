package Lesson8

import java.util.*

fun main(args: Array<String>) {

    //todo 5-topshiriq
    // m va n butun musbat sonlar berilgan , mxn o’lchamli matritsani shunday hosil qilingki, uning har bir i- satri elementlari 10*i ga teng bo’lsin.(i=0, 1, … , m-1).

    val input = Scanner(System.`in`)
    val row = input.nextInt()
    val column = input.nextInt()

    val matrix = Array(row) { IntArray(column) }

    for (i in matrix.indices) {
        for (j in matrix.indices) {
            matrix[i][j] = i * 10
        }
    }

    for (i in 0 until row) {
        for (j in 0 until column) {
            print("${matrix[i][j]} ")
        }
        println()
    }

}