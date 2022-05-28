package Lesson7

import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {

    //todo 3-topshiriq
    // IsSquare(K) mantiqiy funksiyasini hosil qiling.
    // (K>0). Agar K biror butun sonning kvadrati bo’lsa- true, aks holda false qiymati qaytarilsin.

    val input = Scanner(System.`in`)
    val number = input.nextInt()

    println(IsSquare(number))

}

fun IsSquare(number: Int): Boolean {

    val d = sqrt(number.toDouble())

    return (d * d) == number.toDouble()
}
