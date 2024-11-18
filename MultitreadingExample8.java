package javaassignment;

public class MultitreadingExample8 extends Thread
  {
	public void run()
	{
		try
		 {
		for(int i=0;i<=5;i++)
		{
		System.out.println("this is child thread"+i);
		 Thread.sleep(1000);
			
		}
	  }
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    MultitraedingExample8 t=new MultitraedingExample8();
    t.start();
    t.join();
     try
	 {
	    for(int i=0;i<=5;i++)
	    {
	         System.out.println("this is main thread"+i);
	          Thread.sleep(1000);
		
	    }
    } 
	catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
		 
	}

}
