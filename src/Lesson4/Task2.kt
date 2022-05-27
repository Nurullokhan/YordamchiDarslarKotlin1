package Lesson4

import kotlin.math.hypot
import kotlin.math.sqrt

fun main(args: Array<String>) {

    //todo 2-topshiriq
    // To'g'ri burchakli uchburchakning katetlari berilgan.
    // Uning gipotenuzasini toping. Kotlinda maxsus funksiya orqali gipotenuzani toping.

    val a = 5.0
    val b = 7.0

    println("Hypot: ${hypot(a, b)}")

    //2 Usul

    val myHypot = sqrt((a * a + b * b))
    println("HYPOT: $myHypot")

}