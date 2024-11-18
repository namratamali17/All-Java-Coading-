package javaassignment;

public class MultitraedingExample8 extends Thread
{
   public void run()
   {
	   try {
		   
		   for (int i = 1; i <=10; i++) 
		   {
			System.out.println(i+ ":" +Thread.currentThread().getName());
			Thread.sleep(1000);
		   }
		   
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
		   
	   }
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultitraedingExample8 t=new MultitraedingExample8();
		t.start();

	}

}
