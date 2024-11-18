package javaassignment;

public class MultitreadingExample9 extends Thread
{
   public void run()

   {
	   
	   for(int i=1;i<=5;i++)
	   {
		   System.out.println(Thread.currentThread().getName()+i);
	   }
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultitraedingExample8 t =new MultitraedingExample8();
		t.start();
		Thread.yield();
		for(int i=1;i<=5;i++)
		{
			System.out.println("main thread "+i);
			
		}

	}

}
