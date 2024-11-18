package javaassignment;

public class ThisDemo1 {

	void display() 
	{
		System.out.println(" helloooo....");
		
	}
	void show() 
	{
		this.display();
	}
	
	public static void main() 
	{
		
		ThisDemo1 s= new ThisDemo1();
		s.show();
		
	}
	
	
}
