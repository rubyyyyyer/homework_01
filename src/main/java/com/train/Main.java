package com.train;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請問您想要購買幾張車票?");
        int totalTicket = scanner.nextInt();
        System.out.println("請問有幾張是來回票?");
        int returnTicket = scanner.nextInt();

        Ticket t = new Ticket(totalTicket, returnTicket);
        t.singleTicket = totalTicket - returnTicket;

        System.out.println("總共買了幾張車票?" + totalTicket + "\n" + "有幾張來回票?" + returnTicket);
        System.out.println("有幾張單程票?" + t.singleTicket);
        System.out.println("總共多少錢?" + t.totalPrice());
    }
}