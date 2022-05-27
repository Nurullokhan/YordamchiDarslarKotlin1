package Lesson4

fun main(args: Array<String>) {

    //todo 8-topshiriq
    // Kiritilgan string qiymatning oxirgi va undan oldingi element o’rinlarini o’zgartirgan holatda chop qiling.
    // Masalan: coding-> codign.

    val text = "Kotlin"

    val s1 = text.substring(text.length - 2)

    val s2 = s1.substring(0, 1)
    val s3 = s1.substring(s1.length - 1)

    println("Kotlin change to -> ${text.substring(0, text.length - 2)}$s3$s2")

}