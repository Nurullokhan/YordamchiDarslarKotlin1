package Lesson5

import java.util.*

fun main(args: Array<String>) {

    //todo 3-topshiriq
    // Yil berilgan (musbat butun son). Berilgan yilda nechta kun borligini aniqlovchi programma tuzilsin.
    // Kabisa yilida 366 kun bor, kabisa bo'lmagan yilda 365 kun bor.
    // Kabisa yil deb 4 ga karrali yillarga aytiladi.
    // Lekin 100 ga karrali yillar ichida faqat 400 ga karrali bo'lganlari kabisa yil hisoblanadi. Masalan, 300, 1300 va 1900 kabisa yili emas, 1200 va 2000 kabisa yili.

    val input = Scanner(System.`in`)
    val kabisa = input.nextInt()

    if (kabisa % 100 == 0) {
        if (kabisa % 4 == 0) {
            println("$kabisa Kabisa yili hisoblanadi 366 kun")
        } else println("$kabisa Kabisa yili hisoblanmaydi 365 kun")
    } else {
        if (kabisa % 4 == 0) {
            println("$kabisa Kabisa yili hisoblanadi 366 kun")
        } else println("$kabisa Kabisa yili hisoblanmaydi 365 kun")
    }

}