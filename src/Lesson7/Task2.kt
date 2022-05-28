package Lesson7

import java.util.*

fun main(args: Array<String>) {

    //todo 2-topshiriq
    // Haqiqiy sonning ishorasini aniqlovchi ishora nomli funksiya hozil qiling.
    // Funksiya argumenti noldan kichik bo’lsa -1, noldan katta bo’lsa 1, nolga teng bo’lsa 0 qiymat qaytarsin.

    val input = Scanner(System.`in`)
    val number = input.nextInt()

    println(ishora(number))

}

fun ishora(number: Int): Int {

    return if (number > 0) {
        1
    } else if (number < 0) {
        -1
    } else 0
}
