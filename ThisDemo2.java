package javaassignment;

public class ThisDemo2 {
	
	public ThisDemo2() {
	 System.out.println(" hiii");
	}
	ThisDemo2(int x)
	{
		
		this();
	  System.out.println(" byee");
	  
		
	}
	public static void main(String[] args) {
		
		ThisDemo2 th =new ThisDemo2(4);
		
	}

}
