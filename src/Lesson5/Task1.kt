package Lesson5

import kotlin.math.abs

fun main(args: Array<String>) {

    //todo 1-topshiriq
    // Sonlar o'qida uchta A, B, C nuqtalar berilgan. A nuqtaga eng yaqin nuqta va ular orasidagi masofa topilsin.

    val a = 4
    val b = 7
    val c = -1

    if (abs(a - b) < abs(a - c)) {
        println("A nuqtaga eng yaqin nuqta B. Ular orasidagi masofa: ${abs(a - b)}")
    } else {
        println("A nuqtaga eng yaqin nuqta C. Ular orasidagi masoga: ${abs(a - c)}")
    }

}