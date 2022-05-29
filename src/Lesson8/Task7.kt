package Lesson8

fun main(args: Array<String>) {

    //todo 7-topshiriq
    // Massiv elementlari berilgan. Massivning ikkinchi eng katta elementini aniqlang.

    val numbers = arrayOf(4, 3, 2, 5, 1, 6, 7, 2, 8)

    var bigNumber = numbers[0]

    for (i in numbers.indices) {
        if (bigNumber < numbers[i]) {
            bigNumber = numbers[i]
        }
    }

    var secondBigNumber = numbers[0]
    var result = numbers[0]

    for (i in numbers.indices) {
        if (secondBigNumber < numbers[i]) {
            secondBigNumber = numbers[i]
            if (secondBigNumber < bigNumber) {
                result = secondBigNumber
            }
        }
    }
    println("Second big number: $result")
}