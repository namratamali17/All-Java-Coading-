package javaassignment;

public class MultitreadingExample2 implements Runnable
{

	public void run() 
	{
		System.out.println("tread task 2....");
	}
	
	
	public static void main(String[] args)
	
	{
		MultitreadingExample2 t =new MultitreadingExample2();
		Thread th = new Thread(t);
		th.start();
		
	}

}
