package com.trainLoop

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var bookAgain = 0;

    while (bookAgain != -1) {
        println("請問您想要購買幾張車票?")
        val totalTicket = scanner.nextInt();
        println("請問有幾張是來回票?")
        val returnTicket = scanner.nextInt();

        val t = TrainKt(totalTicket, returnTicket)
        t.setting()
        t.totalPrice()

        println("還需要繼續訂票嗎?（要，請輸入任意數字；不要，請輸入-1。）")
        bookAgain = scanner.nextInt()

        if (bookAgain == -1) {
            println("謝謝您的惠顧，歡迎下次蒞臨!")
        } else {
            println("歡迎您繼續使用本系統。")
        }
    }
}


class TrainKt(var totalTicket: Int, var returnTicket: Int, var singleTicket: Int = 0, var singleTicketPrice: Int = 0, var returnTicketPrice: Int = 0, var totalPrice: Int = 0) {

    fun setting() {
        singleTicket = totalTicket - returnTicket
        singleTicketPrice = 1000
        returnTicketPrice = ((singleTicketPrice * 2) * 0.9).toInt()
    }

    fun totalPrice() {
        totalPrice = (singleTicket * singleTicketPrice) + (returnTicket * returnTicketPrice)
        println(totalPrice)
    }

}