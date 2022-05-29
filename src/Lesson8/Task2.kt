package Lesson8

fun main(args: Array<String>) {

    //todo 2-topshiriq
    // N ta elementdan tashkil topgan massiv berilgan. Bu massiv tarkibidagi toqlarini o’chiruvchi dastur tuzing. Hosil bo’lgan massivning elementlari va sonini chiqaruvchi dastur tuzing.

    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    var couple = ""

    for (i in numbers.indices) {
        if (numbers[i] % 2 == 0) {
            couple += "${numbers[i]}, "
        }
    }

    println(couple)

}