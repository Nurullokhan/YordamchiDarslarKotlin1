package Lesson3

import java.util.*
import kotlin.math.PI

fun main(args: Array<String>) {

    //todo 3-topshiriq
    // a(alfa) burchak gradusda berilgan (0 < a < 360). Berilgan burchakning qiymatini radianga o'tkazuvchi dastur tuzilsin.

    val input = Scanner(System.`in`)

    print("Enter your angel: ")
    val angel = input.nextInt()

    val angelRad = angel * (PI / 180)

    println("Your angle in radians: $angelRad")

}