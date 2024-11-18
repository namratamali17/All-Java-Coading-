package javaassignment;

interface i1
{
	 void show();
	
	
}
class Test_interface implements i1

{
	public void show() 
	{
		
		System.out.println("  interface example....");
		
	}
	
	public static void main(String[] args)
	{
		Test_interface t =new Test_interface();
		t.show();
				
		
	}
	
}
