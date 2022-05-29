package Lesson9

import java.util.*

fun main(args: Array<String>) {

    //todo Trafik qolmaganda foydalanuvchi oldindan xabar beruvchi Exception yarating.
    // Masalan sizda 50 Mbt bor. Siz internetdan ixtiyoriy faylni ko'chirib olmoqchisiz.
    // Faylni ko'chirish uchun faylni hajmi oldindan ma'lum. Agar faylni ko'chirish uchun sizning trafigingiz yetsa, ko'chirib olsin, aks holda Exceptionda ma'lumot chiqarsin.
    // Kiruvchi ma'lumotlar sizdagi trafik va faylni umumiy hajmi.

    val scanner = Scanner(System.`in`)

    println("Mavjud trafikni kiriting: ")
    val traffic = scanner.nextInt()

    println("Fayl hajmini kiriting: ")
    val fileSize = scanner.nextInt()

    try {
        isHave(traffic, fileSize)
    } catch (e: java.lang.ArithmeticException) {
        println("MB yetarli emas")
    }
}

fun isHave(mb: Int, file: Int) {
    if (mb < file) {
        throw ArithmeticException()
    } else println("Fayl ko'chirib olindi")

}