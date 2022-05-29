package Lesson10

import java.util.*

fun main(args: Array<String>) {

    //todo Ro'yxatdan o'tish tizimini tashkil qilish
    // Juda ko'plab tizimlarda email yoki username orqali ro'yxatdan o'tish talab etiladi.
    // Null safety mavzusini bilgan holda siz shunday tizim yaratingki, xohlansangiz username xohlasangiz email orqali tizimga kirish imkoniyati yaratilsin.
    // Tizimda funksional imkoniyatlarini ko'rsatib bering.

    val input = Scanner(System.`in`)

    val userName = arrayOfNulls<String>(100)
    val email = arrayOfNulls<String>(100)
    var count = 0

    println("Assalomu alaykum.")

    while (true) {

        println(
            """
        |1 -> Tizimga kirish
        |2 -> Ro'yxatdan o'tish
    """.trimMargin()
        )

        when (input.next()) {
            "1" -> {

                var isHaveUserName = false
                var isHaveEmail = false

                var indexUserName = -1
                var indexEmail = -1

                print("Username yoki emailni kiriting: ")
                val usernameOrEmail = input.next()

                for (i in usernameOrEmail.indices) {
                    if (usernameOrEmail[i] == '@') {
                        for (j in 0 until count) {
                            if (email[j].equals(usernameOrEmail)) {
                                isHaveEmail = true
                                indexEmail = j
                                break
                            }
                        }
                    } else if (userName[i].equals(usernameOrEmail)) {
                        isHaveUserName = true
                        indexUserName = i
                        break
                    }
                }

                if (isHaveEmail) {
                    println("${email[indexEmail]} Tizimga xush kelibsiz.")
                } else if (isHaveUserName) {
                    println("${userName[indexUserName]} Tizimga xush kelibsiz.")
                } else println("Bunday foydalanuvchi mavjud emas.")

            }

            "2" -> {
                print("Ismingizni kiriting: ")
                var name = input.next()
                if (name.isNotEmpty()) {

                    var isHave = false

                    print("Familyangizni kiriting: ")
                    val lastName = input.next()
                    if (lastName.isNotEmpty()) {
                        print("O'zingizni uchun \"Username\" kiriting: ")
                        val username = input.next()
                        if (username.isNotEmpty()) {
                            userName[count] = username
                            print("Email ni kiriting: ")
                            var gmail = input.next()
                            if (gmail.isNotEmpty()) {

                                for (element in gmail) {
                                    if (element != '@') {
                                        isHave = true
                                        break
                                    }
                                }

                                if (isHave) {
                                    print("Iltimos Email ni kiriting: ")
                                    gmail = input.next()
                                    email[count] = gmail

                                    count++
                                    println("Ro'yxatga olindingiz!")
                                }
                            }
                        }
                    }
                } else {
                    print("Iltimos Ismingizni kiriting: ")
                    name = input.next()
                    print("Familyangizni kiriting: ")
                    var lastName = input.next()
                    if (lastName.isNotEmpty()) {

                        var isHave = false

                        print("O'zingizni uchun \"Username\" kiriting: ")
                        val username = input.next()
                        if (username.isNotEmpty()) {
                            userName[count] = username
                            print("Email ni kiriting: ")
                            var gmail = input.next()
                            if (gmail.isNotEmpty()) {

                                for (element in gmail) {
                                    if (element != '@') {
                                        isHave = true
                                        break
                                    }
                                }

                                if (isHave) {
                                    print("Iltimos Email ni kiriting: ")
                                    gmail = input.next()
                                    email[count] = gmail

                                    count++
                                    println("Ro'yxatga olindingiz!")
                                }
                            }
                        }
                    } else {
                        print("Iltimos Familyangizni kiriting: ")
                        lastName = input.next()
                        print("O'zingizni uchun \"Username\" kiriting: ")
                        var username = input.next()
                        if (username.isNotEmpty()) {

                            var isHave = false

                            userName[count] = username
                            print("Email ni kiriting: ")
                            var gmail = input.next()
                            if (gmail.isNotEmpty()) {
                                for (element in gmail) {
                                    if (element != '@') {
                                        isHave = true
                                        break
                                    }
                                }

                                if (isHave) {
                                    print("Iltimos Email ni kiriting: ")
                                    gmail = input.next()
                                    email[count] = gmail

                                    count++
                                    println("Ro'yxatga olindingiz!")
                                }
                            }
                        } else {

                            var isHave = false

                            print("Iltimos O'zingizni uchun \"Username\" kiriting: ")
                            username = input.next()
                            userName[count] = username
                            print("Email ni kiriting: ")
                            var gmail = input.next()
                            if (gmail.isNotEmpty()) {

                                for (element in gmail) {
                                    if (element != '@') {
                                        isHave = true
                                        break
                                    }
                                }

                                if (isHave) {
                                    print("Iltimos Email ni kiriting: ")
                                    gmail = input.next()
                                    email[count] = gmail

                                    count++
                                    println("Ro'yxatga olindingiz!")
                                }

                            } else {
                                print("Iltimos Email ni kiriting: ")
                                gmail = input.next()
                                email[count] = gmail

                                count++
                                println("Ro'yxatga olindingiz!")
                            }
                        }
                    }
                }
            }
        }
    }
}