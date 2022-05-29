package Lesson8

fun main(args: Array<String>) {

    //todo 4-topshiriq
    // n ta butun sonlardan iborat massiv berilgan. Massivdagi har bir toq sonni oxirgi toq songa orttiruvchi programma tuzilsin.
    // Agar toq sonlar bo'lmasa, massiv o'zgarishsiz qoldirilsin.

    val numbers = arrayOf(4, 2, 4, 4, 4, 6, 4, 8, 4)

    var odd = 0
    var isHave = false

    for (i in numbers.size - 1 downTo 0) {
        if (numbers[i] % 2 != 0) {
            odd = numbers[i]
            isHave = true
            break
        }
    }

    if (isHave) {

        for (i in numbers.indices) {
            numbers[i] = numbers[i] * odd
        }
    }

    println(numbers.contentToString())

}