package Lesson7

import java.util.*

fun main(args: Array<String>) {

    //todo 8-topshiriq
    // Berilgan satrning har bir elementini ‘*’ belgisi bilan ajratuvchi rekursiv funksiya tuzilsin.
    // Masalan:
    // “Kotlin”- “K*o*t*l*i*n”

    val input = Scanner(System.`in`)
    val text = input.next()

    println(textStar(text))

}

fun textStar(text: String, s: Int = text.length, n: Int = 0): String {

    return if (s - 1 == n) {
        text
    } else textStar(text.substring(0, 2 * n + 1) + "*" + text.substring(2 * n + 1), s + 0, n + 1)

}
