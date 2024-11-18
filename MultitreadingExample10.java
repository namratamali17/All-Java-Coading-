package javaassignment;

public class MultitreadingExample10  extends Thread
{
	 public void run() 
	 {   
		 try {
		 
		 for(int i=0;i<=5;i++)
		 {
			 System.out.println(i);
			 Thread.sleep(1000);
			 
		 }
		 
	    }
		 catch (Exception e)
		 {
			// TODO: handle exception
			 e.printStackTrace();
		}
	
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultitreadingExample10 t =new MultitreadingExample10();
		t.start();
		t.interrupt();

	}

}
