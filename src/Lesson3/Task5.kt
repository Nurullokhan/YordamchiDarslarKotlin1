package Lesson3

fun main(args: Array<String>) {

    //todo 5-topshiriq
    // Kun boshidan boshlab N sekund vaqt o'tdi. Kun boshidan boshlab qancha soat, minut va sekund o'tganini aniqlovchi dastur tuzilsin.

    var seconds = 31234 //1 our 1 minute 4 seconds

    val hour = Integer.valueOf(seconds / 3600)
    seconds %= 3600

    val minute = Integer.valueOf(seconds / 60)

    seconds %= 60

    println(message = "$hour:$minute:$seconds")

}