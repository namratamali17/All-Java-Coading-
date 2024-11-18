package javaassignment;

public class MultithreadingDemonThread  extends Thread
{
	
	public void run()
	{
		
		System.out.println("child thread..");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main thread..");
		MultithreadingDemonThread t =new MultithreadingDemonThread();
		t.setDaemon(true);
		t.start();
		

	}

}
