package Lesson7

import java.util.*

fun main(args: Array<String>) {

    //todo 5-topshiriq
    // Berilgan sonlarning xona raqamlari yig’indisini rekursiv funksiya orqali hisoblang.

    val input = Scanner(System.`in`)
    val number = input.nextInt()

    println(numberSum(number))

}

fun numberSum(number: Int): Int {

    return if (number == 0)
        number
    else number + numberSum(number - 1)
}
