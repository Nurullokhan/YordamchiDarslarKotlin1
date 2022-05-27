package Lesson5

import java.util.*

fun main(args: Array<String>) {

    //todo 6-topshiriq
    // Oy raqami berilgan. Shu oyda necha kun borligini aniqlovchi programma tuzilsin.

    val input = Scanner(System.`in`)
    val integer = input.nextInt()

    when (integer) {
        1 -> println("Yanvar 31 kun")
        2 -> println("Fevral 28 yoki 29 kun")
        3 -> println("Mart 31 kun")
        4 -> println("Aprel 30 kun")
        5 -> println("May 31 kun")
        6 -> println("Iyun 30 kun")
        7 -> println("Iyul 31 kun")
        8 -> println("Avgust 31 kun")
        9 -> println("Sentabr 30 kun")
        10 -> println("Oktabr 31 kun")
        11 -> println("Noyabr 30 kun")
        12 -> println("Dekabr 31 kun")
    }

}