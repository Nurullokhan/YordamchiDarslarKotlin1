package Lesson4

fun main(args: Array<String>) {

    //todo 5-topshiriq
    // Berilgan string ma’lumotning oxirgi 2 ta elementini boshidan yozing. Masalan: Kotlin> inKotl

    val text = "Kotlin"

    val index = text.subSequence(0, text.length - 2)

    println("${text.subSequence(text.length - 2, text.length)}$index")

}