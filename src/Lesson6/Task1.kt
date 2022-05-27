package Lesson6

import java.util.*

fun main(args: Array<String>) {

    //todo 1-topshiriq
    // n butun son berilgan (n>0). Quyidagi yig'indini hisoblovchi programma tuzilsin.
    // S=1+1/2+1/3+1/4+....

    val input = Scanner(System.`in`)

    print("Enter number: ")
    val number = input.nextInt()

    var sum = 0.0

    for (i in 1..number) {
        sum += 1 / i.toDouble()
    }

    println("Sum: $sum")

}