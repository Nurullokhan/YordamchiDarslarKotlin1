package Lesson6

import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val random = Random()

    while (true) {

        val randomNumber1 = random.nextInt(100)
        val randomNumber2 = random.nextInt(100)

        val praxis = random.nextInt(4)

        var result: Int? = null

        when (praxis) {
            0 -> {
                result = randomNumber1 + randomNumber2
                print("$randomNumber1 + $randomNumber2 = ")
            }
            1 -> {
                result = randomNumber1 - randomNumber2
                print("$randomNumber1 - $randomNumber2 = ")
            }
            2 -> {
                result = randomNumber1 * randomNumber2
                print("$randomNumber1 * $randomNumber2 = ")
            }
            3 -> {
                result = randomNumber1 / randomNumber2
                print("$randomNumber1 / $randomNumber2 = ")
            }
        }

        val myResult = input.nextInt()

        if (result == myResult) {
            println("Javobingiz to'g'ri")
        } else println("Javobingiz xato")
    }
}