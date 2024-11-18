package javaassignment;

public class BookTheatherTicket {
	int total_seat=10;
	 synchronized void bookSeat(int seats)
	{
		
		if(total_seat>=seats)
		{
			System.out.println("seat books Sucefully");
		    total_seat= total_seat-seats;
		    System.out.println("seat left"+total_seat);
		
		}
		
		else 
		{ 
			 System.out.println("seat can not booked");
			 System.out.println("seat left"+total_seat);
			
		}	
		
     }
     
}
 class MovieBookApp extends Thread
 {
	 
	 static BookTheatherTicket b;
	 int seat;
	 public void run()
	 {
		 b.bookSeat(seat);
		 
	 }
	 public static void main(String[] args) {
		 
		 
		 b=new BookTheatherTicket();
		 MovieBookApp depak=new MovieBookApp();
		 depak.seat=7;
		 depak.start();
		 MovieBookApp namu=new MovieBookApp();
		 namu.seat=5;
		 namu.start();
		 
		
	}
	 
	 
 }
