package Lesson7

import java.util.*

fun main(args: Array<String>) {

    //todo 6-topshiriq
    // Agar S satr polindrom bo’lsa (ya’ni o’ngdan ham, chapdan ham, bir xil o’qiladigan bo’lsa TRUE, aks holda False qiymatni qaytaruvchi  Polindrom(s) rekursiv funksiya tuzilsin.
    // Funksiya tanasida takrorlash operatoridan foydalanilmasin.

    val input = Scanner(System.`in`)
    val text = input.next()

    println(Polindrom(text))

}

fun Polindrom(text: String, s: String = "", n: Int = text.length - 1): Boolean {

    val a = if (n < 0) {
        return s == text
    } else {
        Polindrom(text, s + text[n], n - 1)
    }

    return a
}
