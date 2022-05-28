package Lesson7

import java.util.*

fun main(args: Array<String>) {

    //todo 1-topshiriq
    // Butun musbat sonining raqamlarini teskari tartibda chiqaruvchi InvertDigit nomli funksiya hosil qiling.

    val input = Scanner(System.`in`)
    val number = input.nextInt()

    println(InvertDigit(number))

}

fun InvertDigit(numberInput: Int): Int {

    var number = numberInput
    var reverse = 0

    while (number != 0) {
        val digit = number % 10
        reverse = reverse * 10 + digit
        number /= 10
    }

    return reverse
}
