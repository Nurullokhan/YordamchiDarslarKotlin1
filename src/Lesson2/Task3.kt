package Lesson2

fun main(args: Array<String>) {

    //todo 3-topshiriq
    // Ikkita o’zgaruvchi qiymatlari o’rnini almashtiruvchi dasturni tuzing

    var a = 5
    var b = 7
    val c = a
    a = b
    b = c

    println("Default A: 5")
    println("Default B: 7")

    println("A: $a")
    println("B: $b")

}