package javaassignment;

public class MultithreadigExample3 extends Thread
{
   public void run()
   {
	System.out.println("tread task111....");
   }
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 MultithreadigExample3 t= new MultithreadigExample3();
		 t.start();
		 MultithreadigExample3 t2 = new MultithreadigExample3();
		 t2.start();
		 
		 
	
	}

}
