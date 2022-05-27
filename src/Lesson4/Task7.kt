package Lesson4

fun main(args: Array<String>) {

    //todo 7-topshiriq
    // Kiritilayotgan satrning o’rtasidagi 2 ta elementni chop qiladigan dastur yozing.

    val text = "Kotlin"

    val s1 = text.substring(0, text.length / 2)
    val s2 = s1.substring(s1.length - 1)

    val t1 = text.substring(text.length / 2)
    val t2 = t1.substring(0, 1)

    println(s2 + t2)

}