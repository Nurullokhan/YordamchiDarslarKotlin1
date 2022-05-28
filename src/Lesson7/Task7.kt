package Lesson7

import java.util.*

fun main(args: Array<String>) {

    //todo 7-topshiriq
    // Berilgan satrdagi barcha ‘x’ elementlarini satr so’ngiga o’tkazuvchi rekursiv funksiya tuzilsin.
    // Masalan:
    // ("xxre") → "rexx"
    // ("xxhixx") → "hixxxx"

    val input = Scanner(System.`in`)
    val text = input.next()

    println(checkCase(text))

}

fun checkCase(text: String, s: Int = text.length, n: Int = 0): String {

    return if (n == s) {
        text
    } else {
        if (text[0] == 'x') {
            checkCase(text.substring(1) + "x", s + 0, n + 1)
        } else text[0] + checkCase(text.substring(1), s + 0, n + 1)
    }
}
