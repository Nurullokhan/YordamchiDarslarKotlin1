package Lesson3

import java.util.*

fun main(args: Array<String>) {

    //todo 2-topshiriq
    // Birinchi avtomobilning tezligi v1, ikkinchisiniki v2, ular orasidagi masofa S.
    // Ular bir-biridan uzoqlasha boshlasa t vaqtdan keyin ular orasidagi masofani aniqlaydigan dastur tuzilsin.

    val input = Scanner(System.`in`)

    print("Enter first car speed: ")
    val v1 = input.nextInt()
    print("Enter second car speed: ")
    val v2 = input.nextInt()
    print("Enter time: ")
    val time = input.nextInt()

    val s1 = v1 * time
    val s2 = v2 * time

    val sum = s1 + s2

    println("The distance between them: $sum")


}