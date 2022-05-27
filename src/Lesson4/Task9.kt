package Lesson4

fun main(args: Array<String>) {

    //todo 9-topshiriq
    // Kiritilgan stringning berilgan indexdan boshlab qolgan qismini chop qiluvchi dastur yozing.
    // Masalan:
    // String: android, index=2
    // Natija: “droid”;

    val text = "Kotlin"
    val index = 2

    println(text.substring(index, text.length))

}