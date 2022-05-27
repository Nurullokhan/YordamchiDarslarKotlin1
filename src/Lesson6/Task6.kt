package Lesson6

import java.util.*

fun main(args: Array<String>) {

    //todo 6-topshiriq
    // Bankka boshlang'ich S so'm qo'yiladi.
    // Har oyda bo'lgan summa p foizga  oshadi (0<p<25).
    // Necha oydan keyin boshlang'ich qiymat 2 martadan ko'p bo'lishini hisoblovchi programma tuzilsin.
    // Necha oy k- butun son. Bankda hosil bo'lgan summa haqiqiy son ekranga chiqarilsin.
    // (masalani while/do while opereratorlari orqali bajaring).

    val input = Scanner(System.`in`)
    val sum = input.nextFloat()
    val percent = input.nextFloat()

    var summa = sum
    var month = 0

    while (summa < 2 * sum) {
        summa += sum * (percent / 100)
        month++
    }

    println("Month: $month")
    println("Summa: $summa")

}