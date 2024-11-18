package javaassignment;

class Mytread1 extends Thread
{
 public void run()	
 {
	 System.out.println("tread task11.."); 
	 
 }
}
class Mytread2 extends Thread
{
public void run()
{
	
	System.out.println("tread task22...");
	
}	 
}

public class Multitreading4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mytread1 t =new Mytread1();
		t.start();
		Mytread2 t1= new Mytread2();
		t1.start();

	}

}
