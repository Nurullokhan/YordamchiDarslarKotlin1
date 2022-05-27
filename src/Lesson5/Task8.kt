package Lesson5

import java.util.*

fun main(args: Array<String>) {

    //todo 8-topshiriq
    // Ikkita burj vaqtlarini aniqlovchi butun son berilgan.
    // D(kun), M(oy).
    // Berilgan sana qaysi burjga kiritishni aniqlovchi programma tuzilsin.
    // "Qovg'a"(20.1-18.2), "Baliq" (19.2-20.03), "Qo'y" (21.3-19.4),
    // "Buzoq" (20.4-20.5), "Egizaklar" (21.5-21.6), "Qisqichbaqa" (22.6-22.7),
    // "Arslon" (23.7-22.8), "Parizod" (23.8-22.9), "Tarozi" (23.9-22.10),
    // "Chayon" (23.10-22.11), "O'qotar" (23.11-21.12), "Echki" (22.12-19.1).

    val input = Scanner(System.`in`)
    val month = input.nextInt()
    val day = input.nextInt()

    when (month) {
        1 -> if (day >= 20) println("Qovg'a") else println("Echki")
        2 -> if (day <= 18) println("Qovg'a") else println("Baliq")
        3 -> if (day <= 20) println("Baliq") else println("Qo'y")
        4 -> if (day <= 19) println("Qo'y") else println("Buzoq")
        5 -> if (day <= 20) println("Buzoq") else println("Egizaklar")
        6 -> if (day <= 21) println("Egizaklar") else println("Qisqichbaqa")
        7 -> if (day <= 22) println("Qisqichbaqa") else println("Arslon")
        8 -> if (day <= 22) println("Arslon") else println("Parizod")
        9 -> if (day <= 22) println("Parizod") else println("Arslon")
        10 -> if (day <= 22) println("Arslon") else println("Tarozi")
        11 -> if (day <= 22) println("Tarozi") else println("Chayon")
        12 -> if (day <= 22) println("Chayon") else println("O'qotar")
    }

}