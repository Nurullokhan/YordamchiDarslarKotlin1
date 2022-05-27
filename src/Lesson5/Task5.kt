package Lesson5

import java.util.*

fun main(args: Array<String>) {

    //todo 5-topshiriq
    // 1-7 gacha bo'lgan butun sonlar berilgan. Kiritilgan songa mos ravishda  hafta kunlarini so'zda ifodalovchi programma tuzilsin. (1-Dushanba, 2-Seshanba,...)

    val input = Scanner(System.`in`)
    val integer = input.nextInt()

    when (integer) {
        1 -> println("Dushanba")
        2 -> println("Seshanba")
        3 -> println("Chorshanba")
        4 -> println("Payshanba")
        5 -> println("Juma")
        6 -> println("Shanba")
        7 -> println("Yakshanba")
    }

}