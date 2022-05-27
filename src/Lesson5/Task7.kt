package Lesson5

import java.util.*

fun main(args: Array<String>) {

    //todo 7-topshiriq
    // 100 - 999 gacha oraliqdagi sonlarni so'zlarda ifodalovchi programma tuzilsin. Masalan: 123-"bir yuz yigirma uch"

    val input = Scanner(System.`in`)
    val text = input.next()

    when (text[0]) {
        '1' -> print("Bir yuz ")
        '2' -> print("Ikki yuz ")
        '3' -> print("Uch yuz ")
        '4' -> print("To'rt yuz ")
        '5' -> print("Besh yuz ")
        '6' -> print("Olti yuz ")
        '7' -> print("Yetti yuz ")
        '8' -> print("Sakkiz yuz ")
        '9' -> print("To'qqiz yuz ")
    }

    when (text[1]) {
        '1' -> print("o'n ")
        '2' -> print("yigirma ")
        '3' -> print("o'ttiz ")
        '4' -> print("qiriq ")
        '5' -> print("elliq ")
        '6' -> print("oltimish ")
        '7' -> print("yettimish ")
        '8' -> print("sakson ")
        '9' -> print("to'qson ")
    }

    when (text[2]) {
        '1' -> print("bir")
        '2' -> print("ikki")
        '3' -> print("uch")
        '4' -> print("to'rt")
        '5' -> print("besh")
        '6' -> print("olti")
        '7' -> print("yetti")
        '8' -> print("sakkiz")
        '9' -> print("to'qqiz")
    }

}