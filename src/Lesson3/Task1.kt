package Lesson3

import kotlin.math.sqrt

fun main(args: Array<String>) {

    //todo 1-topshiriq
    // Doiraning yuzasi S berilgan. Uning diametri d va radiusi R aniqlansin. PI = 3.14 deb oling.

    val PI = 3.14
    val s = 20
    val d = sqrt(4 * s / PI)
    val r = d / 2

    println("Diameter: $d")
    println("Radius: $r")

}