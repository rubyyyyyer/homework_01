package com.trainLoop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTicket = 0;
        int returnTicket = 0;
        int bookAgain = 0;

        while (bookAgain != -1) {
            System.out.println("請問您想要購買幾張車票?");
            totalTicket = scanner.nextInt();
            System.out.println("請問有幾張是來回票?");
            returnTicket = scanner.nextInt();

            Ticket t = new Ticket(totalTicket, returnTicket);
            t.singleTicket = totalTicket - returnTicket;

            System.out.println("總共多少錢?" + t.totalPrice());

            System.out.println("還需要繼續訂票嗎?（要，請輸入任意數字；不要，請輸入-1。）");
            bookAgain = scanner.nextInt();

            System.out.println((bookAgain == -1) ? "謝謝您的惠顧，歡迎下次蒞臨!" : "歡迎您繼續使用本系統。");

        }
    }
}