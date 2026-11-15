package com.BookMyShow;

class BookMyShow {
	int total_tickets = 10;
	
	synchronized void bookMyTickets(String name,int tickets) {
		
		if(tickets<=total_tickets) {
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			total_tickets=total_tickets-tickets;
			System.out.println("Your Ticekts has been booked successfully Mr/Ms: "+name);
		    System.out.println("Your Total Booked Tickets are: "+tickets);
		    System.out.println("Available Tickets from Book My Show is:" +total_tickets);
		}else {
			System.err.println("Tickets have been sold out");
			System.err.println("Available tickets are : "+total_tickets);
		}
		
	}
}

class Customer extends Thread {
	BookMyShow bms;
	String customerName;
	int tickets;

	public Customer(BookMyShow bms, String customerName, int tickets) {
		this.bms = bms;
		this.customerName = customerName;
		this.tickets = tickets;
	}

	@Override
	public void run() {
		bms.bookMyTickets(customerName, tickets);	
	}

}

public class TestBookMyShowDemo {

	public static void main(String[] args) {
		BookMyShow bms=new BookMyShow();
		Customer lakshmi=new Customer(bms,"lakshmi",6);
		lakshmi.start();
		Customer lucky=new Customer(bms,"lucky",4);
		lucky.start();
		Customer surya=new Customer(bms,"surya",8);
		surya.start();
		Customer sukshmi=new Customer(bms,"sukshmi",4);
		sukshmi.start();
	}

}
