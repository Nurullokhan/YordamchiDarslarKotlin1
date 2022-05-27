package Lesson4

import kotlin.math.ceil
import kotlin.math.pow

fun main(args: Array<String>) {

    //todo 1-topshiriq
    // Kotlinda qiymatning kub ildizini qanday olish mumkin? Sodda dastur yarating. Misol: 125 = 5

    val integer = 125.0
    val b = 1.0 / 3.0

    println(ceil(integer.pow(b)))

}