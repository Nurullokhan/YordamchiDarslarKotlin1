package Lesson7

import java.util.*

fun main(args: Array<String>) {

    //todo 4-topshiriq
    // N!=1*2*...*N faktorialni hisoblovchi haqiqiy  toifadagi Fact(N) rekursiv funksiyasi tuzilsin.
    // (N>0 - butun toifadagi parametr). Shu funksiya yordamida berilgan 3ta sonning faktoriallari hisoblansin.

    val input = Scanner(System.`in`)
    val n1 = input.nextInt()

    println(Fact(n1))

}

fun Fact(n1: Int): Int {

    return if (n1 == 1) {
        1
    } else n1 * Fact(n1 - 1)
}
