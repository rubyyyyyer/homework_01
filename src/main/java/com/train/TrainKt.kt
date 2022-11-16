package com.train

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("請問您想要購買幾張車票?")
    val totalTicket = scanner.nextInt();
    println("請問有幾張是來回票?")
    val returnTicket = scanner.nextInt();

    val t = TrainKt(totalTicket,returnTicket)
    t.setting()
    t.totalPrice()

}


class TrainKt(var totalTicket:Int, var returnTicket:Int,var singleTicket:Int=0, var singleTicketPrice:Int=0, var returnTicketPrice:Int=0, var totalPrice:Int=0) {

    fun setting(){
        singleTicket = totalTicket - returnTicket
        singleTicketPrice = 1000
        returnTicketPrice = ((singleTicketPrice*2)*0.9).toInt()
    }

    fun totalPrice(){
        totalPrice = (singleTicket*singleTicketPrice) + (returnTicket*returnTicketPrice)
        println(totalPrice)
    }

}