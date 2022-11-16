package com.train;


public class Ticket {
        int totalTicket;
        int returnTicket;
        int singleTicket = totalTicket - returnTicket;
        int singleTicketPrice = 1000;
        int returnTicketPrice = (int)(singleTicketPrice*2*0.9);

        public Ticket(int totalTicket, int returnTicket){
            this.totalTicket = totalTicket;
            this.returnTicket = returnTicket;
        }

        public int totalPrice(){
            int totalPrice = (singleTicket*singleTicketPrice) + (returnTicket*returnTicketPrice);
            return totalPrice;
        }
}
