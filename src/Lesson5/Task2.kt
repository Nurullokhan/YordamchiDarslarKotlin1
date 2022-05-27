package Lesson5

import java.util.*

fun main(args: Array<String>) {

    //todo 2-topshiriq
    // OX va OY koordinata o'qlarida yotmaydigan nuqta berilgan. Nuqta joylashgan koordinata choragi aniqlansin.

    val input = Scanner(System.`in`)

    print("Enter X: ")
    val x = input.nextInt()
    print("Enter Y: ")
    val y = input.nextInt()

    if (x > 0 && y > 0) {
        println("1 - Chorak")
    } else if (x < 0 && y > 0) {
        println("2 - Chorak")
    } else if (x < 0 && y < 0) {
        println("3 - Chorak")
    } else if (x > 0 && y < 0) {
        println("4 - Chorak")
    } else println("Kiritilgan nuqta koordinata o'qida")

}