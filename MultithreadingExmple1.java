 
package javaassignment;

public class MultithreadingExmple1  extends Thread
{

	 public void run() 
	 {
		
		 
		 System.out.println("thread task...");
		 
	}
	
	
	
	public static void main(String[] args)
	{
      MultithreadingExmple1 t =new MultithreadingExmple1();
      t.start(); 
      
	}

}
