package Lesson8

import java.util.*

fun main(args: Array<String>) {

    //todo Massivlar yordamida kichik lug'at dasturini yaratish.
    // Massivlar yordamida lug'at dasturini yarating. So'zlarni qo'shish 2 turda olib boriladi.
    // Masalan, so'z qo'shish ENG->UZB yoki UZB->ENG.
    // So'z va tarjimasini qo'shish, o'chirish, o'zgartirish, barcha so'zlar ro'yxati(bunda 2 turda so'zlarni chiqarish imkoniyati bo'lsin), so'z qidirish.
    // Men tizimga 2 ta turda so'zlarni qo'sha olishim ularni boshqara olishim kerak.

    val input = Scanner(System.`in`)

    val uzbArray = arrayOfNulls<String>(100)
    val engArray = arrayOfNulls<String>(100)

    var count = 0

    println("\nAssalomu alaykum. Bizning Lug'at dasturimizga xush kelibsiz.\n")

    while (true) {

        println(
            """
            |Menyumiz ni ishlatish uchun raqamlardan foydalaning!
            
            | 1 -> O'zbekcha so'z qo'shish
            | 2 -> Inglizcha so'z qo'shish
            | 3 -> So'zlar ro'yxati
            | 4 -> So'zlarni o'zgartirish
            | 5 -> So'zlarni o'chirish
            | 6 -> So'zlarni qidirish
        """.trimMargin()
        )

        when (input.next()) {
            "1" -> {
                print("O'zbekcha so'zni kiriting: ")
                val uzbWord = input.next()
                print("So'zni inglizchasini qo'shing: ")
                val engWord = input.next()
                uzbArray[count] = uzbWord
                engArray[count] = engWord

                count++

                println("So'zlar saqlab olindi.")
            }

            "2" -> {
                print("Inglizcha so'zni kiriting: ")
                val engWord = input.next()
                print("So'zni o'zbekchasini qo'shing: ")
                val uzbWord = input.next()
                uzbArray[count] = uzbWord
                engArray[count] = engWord

                count++

                println("So'zlar saqlab olindi.")
            }

            "3" -> {
                println("O'zbekcha   ==   Inglizcha")
                for (i in 0 until count) {
                    println("${uzbArray[i]} == ${engArray[i]}")
                }
            }

            "4" -> {

                var isHave = false
                var index = -1

                println("Qaysi so'zni o'zgartirmoqchisiz?")

                print("O'zgartirmoqchi bo'lgan so'zinigizni kiriting: ")
                val editWord = input.next()

                for (i in 0 until count) {
                    if (editWord.equals(uzbArray[i]) || editWord.equals(engArray[i])) {

                        println("Siz o'zgartirmoqchi bo'lgan so'z topildi.")
                        isHave = true
                        index = i
                        break
                    }
                }

                if (isHave) {
                    print("So'zni o'zgartirish uchun yangi so'zni kiriting: ")
                    val newWord = input.next()

                    if (uzbArray[index] == editWord) {
                        uzbArray[index] = newWord
                    } else engArray[index] = newWord

                } else println("Bunday so'z topilmadi.")
            }

            "5" -> {

                var isHave = false
                var index = -1

                println("Qaysi so'zni o'chirmoqchisiz?")
                print("O'chirmoqchi bo'lgan so'zingizni kiriting: ")
                val deleteWord = input.next()

                for (i in 0 until count) {
                    if (uzbArray[i].equals(deleteWord) || engArray[i].equals(deleteWord)) {

                        isHave = true
                        index = i
                        break
                    }
                }

                if (isHave) {

                    uzbArray[index] = null
                    engArray[index] = null

                    uzbArray[index] = uzbArray[index + 1]
                    engArray[index] = engArray[index + 1]
                    count--

                    println("So'z o'chirildi.")
                } else println("Bunday so'z mavjud emas.")
            }

            "6" -> {

                print("Qaysi so'zni qidiryapsiz: ")
                val searchWord = input.next()

                for (i in 0 until count) {
                    if (uzbArray[i].equals(searchWord) || engArray[i].equals(searchWord)) {
                        println("O'zbekcha: ${uzbArray[i]} == Inglizcha: ${engArray[i]}\n")
                        break
                    }
                }
            }

            else -> println("Noto'g'ri ma'lumot kiritdingiz.")
        }
    }
}