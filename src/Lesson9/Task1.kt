package Lesson9

import java.util.*

fun main(args: Array<String>) {

    //todo Haydovchilik guvohnomasini olish tizimini tashkil qiling. Bunda Exceptionlardan foydalaning.
    // Bu tizimda o'zingiz loyiha yaratib guvohnoma berish tartibini shakllantirasiz.

    val input = Scanner(System.`in`)

    try {

        print("Ismingizni kiriting: ")
        val name = input.next()

        print("$name iltimos yoshingizni kiriting: ")
        val age = input.nextInt()

        if (age < 18) {
            throw ArithmeticException("Yoshingiz yetarli emas")
        } else {

            print("$name umumiy yeg'gan balingizni kiriting: ")
            val ball = input.nextInt()

            if (ball < 70) {
                println("$name Balingiz 70 bal dan yuqori bo'lishi shart")
                throw Exception("Ball yetarli emas!")
            } else {
                println("$name sizni haydovchilik guvohnomasini olishingiz bilan tabriklaymiz.")
            }
        }

    } catch (e: Exception) {
        e.printStackTrace()
    }
}