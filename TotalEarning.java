package javaassignment;

import java.io.IOException;

public class TotalEarning extends Thread
{
	int total=0;

	public void run()
	{

		for(int i=0;i<=10;i++)
		{
			total=total+100;


		}   
		this.notify();
	}
}
class MovieApp1
{
	public static void main(String args[]) throws InterruptedException
	{
		TotalEarning t =new TotalEarning();
		t.start();
		synchronized (t) 
		{
			t.wait();
			System.out.println("Total earing .."+ t.total +"rs");

		}

	}


}