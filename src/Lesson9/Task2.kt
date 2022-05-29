package Lesson9

import java.util.*

fun main(args: Array<String>) {

    //todo Ixtiyoriy holatda 5 ta jarayonni tartibga solish uchun Exceptionlar yarating.
    // Hayotiy jarayonlardan misol qilib ko'rsatilsa ham bo'ladi.

    val scanner = Scanner(System.`in`)

    println(
        "Tibbiy ko'rikdan muvaffaqiyatli o'tdingizmi?\n" +
                "1 -> ha,   0 - > yo'q"
    )
    val tibKor = scanner.nextInt()

    println(
        "Diktantdan muvaffaqiyatli o'tdingizmi?\n" +
                "1 -> ha,   0 - > yo'q"
    )
    val diktant = scanner.nextInt()
    println(
        "Yugurishdan ko'rikdan muvaffaqiyatli o'tdingizmi?\n" +
                "1 -> ha,   0 - > yo'q"
    )
    val yugurish = scanner.nextInt()
    println(
        "Psixologik testdan ko'rikdan muvaffaqiyatli o'tdingizmi?\n" +
                "1 -> ha,   0 - > yo'q"
    )
    val psixologiya = scanner.nextInt()
    println(
        "Suxbatdan ko'rikdan muvaffaqiyatli o'tdingizmi?\n" +
                "1 -> ha,   0 - > yo'q"
    )
    val suxbat = scanner.nextInt()

    try {
        tibbiyKorik(tibKor)
        diktant(diktant)
        yugurish60(yugurish)
        psixologiya(psixologiya)
        suxbat(suxbat)
        println("Siz xarbiy xizmatga qabul qilindingiz")
        try {
            println("Telefon raqamingizni kiriting: Misol (99 123 45 67)")
            val number = scanner.next()
            val intNumber = number.toInt()
            println("Biz sizga albatta bog'lanamiz, Omad!")
        } catch (e: NumberFormatException) {
            println("Telefon raqamni noto'g'ri kiritdingiz...")
        }
    } catch (e: Exception) {
        println("Siz xarbiy xizmatga qabil qilinmadingiz")
    }
}

fun tibbiyKorik(has: Int) {
    if (has == 0) {
        throw Exception()
    }
}

fun diktant(has: Int) {
    if (has == 0) {
        throw Exception()
    }
}

fun yugurish60(has: Int) {
    if (has == 0) {
        throw ArithmeticException()
    }
}

fun psixologiya(has: Int) {
    if (has == 0) {
        throw NullPointerException()
    }
}

fun suxbat(has: Int) {
    if (has == 0) {
        throw Exception()
    }
}