package Lesson5

import java.util.*

fun main(args: Array<String>) {

    //todo 4-topshiriq
    // 1-999 oraliqdagi sonlar berilgan. Berilgan sonni "ikki xonali juft son", "uch xonali toq son" va h.k ekranga yozadigan programma tuzilsin.

    val input = Scanner(System.`in`)
    val integer = input.nextInt()

    if (integer in 0..9) {
        if (integer % 2 == 0) {
            println("Birxonalik juft son")
        } else println("Birxonalik toq son")
    } else if (integer in 10..99) {
        if (integer % 2 == 0) {
            println("Ikkixonalik juft son")
        } else println("Ikkixonalik toq son")
    } else if (integer in 100..999) {
        if (integer % 2 == 0) {
            println("Uchxonalik juft son")
        } else println("Uchxonalik toq son")
    } else println("Uchxonalik sondan kattaroq son kiritildi")

}