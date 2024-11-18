package javaassignment;

public class MultitreadingExample6  extends Thread
{
	
	public void run() 
	{
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("thread task...");
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		MultitreadingExample6 t =new MultitreadingExample6();
		t.start();
		System.out.println(Thread.currentThread().getName());

	}

}
