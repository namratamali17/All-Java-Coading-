package javaassignment;

public class SingleInheritance
{
	
   void show() 
   {
	   System.out.print(" A parent class methad ...");
	   
   }
   
}
   
   class B extends SingleInheritance
   {
	   void show1()
	   {
		   
		   System.out.println("  Child class methad...");
		   
		   
	   }
	   
	  
 
   
   
	public static void main(String[] args) 
	{
	   
		B a=new B();
		a.show();
		a.show1();
		
	}

}
