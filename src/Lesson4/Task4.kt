package Lesson4

fun main(args: Array<String>) {

    //todo 4-topshiriq
    // Kiritilayotgan string ma’lumotning oxirgi 2 elementini 3 marta chop qiling.
    // String ma’lumot kamida 2 ta elementdan iborat bo’lishi kerak.

    val text = "Kotlin"

    val index = text.substring(text.length - 2)

    println(index)
    println(index)
    println(index)

}