package javaassignment;

public class Multitreadingexample11 extends Thread
{
	 public void run()
	 {
		 System.out.println(Thread.interrupted());
		 
		 try {
			 for(int i=1;i<=5;i++)
			 {
				 System.out.println(i);
				 Thread.sleep(1000);
				 
			 }
			 
		 }
		 catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		 	 
		 
	 }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Multitreadingexample11 t =new Multitreadingexample11();
		 t.start();
		 t.interrupt();
		  
	}

}
