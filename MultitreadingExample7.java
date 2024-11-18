package javaassignment;

public class MultitreadingExample7 extends Thread 
{

	 public void run()
	 {
		  System.out.println("child tread.. ");
		 System.out.println(Thread.currentThread().getPriority());
		 	 
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultitreadingExample7 t =new MultitreadingExample7();
		t.start();
		t.setPriority(10);

	}

}
