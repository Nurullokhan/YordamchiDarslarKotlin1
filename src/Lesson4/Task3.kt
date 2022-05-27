package Lesson4

import kotlin.math.max

fun main(args: Array<String>) {

    //todo 3-toshiriq
    // Berilgan 3 ta sondan kattasini chiqaruvchi dastur tuzing.

    val a = 4
    val b = 3
    val c = 7

    val s = max(a, b)
    val big = max(c, s)

    println("Big number: $big")

}