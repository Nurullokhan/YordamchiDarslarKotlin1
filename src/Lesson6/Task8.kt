package Lesson6

import java.util.*

fun main(args: Array<String>) {

    //todo 8-topshiriq
    // A, B, C musbat butun sonlar berilgan. AxB to'rtburchak ichida tomoni C bo'lgan kvadratdan nechtasi sig'ishini aniqlovchi programma tuzilsin.
    // Ko'paytirish va bo'lish amallarini ishlatmang.

    val input = Scanner(System.`in`)
    val a1 = input.nextInt()
    val b1 = input.nextInt()
    val c1 = input.nextInt()

    var a = 0
    var b = 0
    var i = 0

    while (a1 - a >= c1) {
        a += c1
        while (b1 - b >= c1) {
            b += c1
            i++
        }
        b = 0
    }
    println(i)

}