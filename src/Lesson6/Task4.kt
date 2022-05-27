package Lesson6

import java.util.*

fun main(args: Array<String>) {

    //todo 4-topshiriq
    // Berilgan matnda "code" so'zi necha marotaba ishlatilganini sonda chiqaring va bunga qo'shimcha o'laroq "d" harfini o'rniga kelgan har qanday hafrni dastur qabul qilsin.
    // Misol uchun bu so'zlar ham hisobga o'tadi "cope", "cooe".
    // Input:  → aaacodebbb | Output: → 1
    // Input:  → codexxcode | Output: → 2
    // Input:  → cozexxcope | Output: → 2

    val input = Scanner(System.`in`)
    var satr = input.nextLine()
    satr += "f"
    var haa = 0

    val satrOlcham = satr.length

    var i = 0

    while (i < satrOlcham) {
        if (satr[i] == 'x') {
            var j = i
            while (j < satrOlcham - 1) {
                if (satr[j + 1] == 'y') {
                    haa = 1
                    break
                }
                j++
            }
        }
        i++
    }
    if (haa == 1) println(true)
    else println(false)

}