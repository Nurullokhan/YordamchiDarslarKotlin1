package Lesson6

import java.util.*

fun main(args: Array<String>) {

    //todo 7-topshiriq
    // n butun soni berilgan (n>1). n sonini Fibonachchi sonlari orasida mavjud yoki mavjud emasligini aniqlovchi programma tuzilsin.
    // Fibonachchi sonlari quyidagi qonuniyat asosida topiladi:
    // F1=1; F2=1; Fk=F(k-1)+F(k-2); … k=3, 4, ….

    val input = Scanner(System.`in`)
    var n1 = 0
    var n2 = 1
    var has = 0

    print("Unto 10000: ")
    val n = input.nextInt()

    while (n1 <= n) {
        val sum = n1 + n2
        n1 = n2
        n2 = sum
        if (sum == n) {
            has = 1
            break
        }
    }
    if (has == 1) {
        println("Fibonacci: $n")
    } else println("Fibonacci emas: $n")

}