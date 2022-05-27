package Lesson6

import java.util.*

fun main(args: Array<String>) {

    //todo 3-topshiriq
    // n butun soni va a haqiqiy soni berilgan (n>0). Bir sikldan foydalanib quyidagi a ning 1 dan n gacha bo'lgan barcha darajalarini chiqaruvchi programma tuzilsin.

    val input = Scanner(System.`in`)
    print("Enter number: ")
    val number = input.nextInt()

    for (i in 1..number) {
        println(i * i)
    }

}