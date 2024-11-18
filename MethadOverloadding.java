package javaassignment;

public class MethadOverloadding {

	void show()
	{
		System.out.println(".....First Mathad Called.....");
	}
	
	void show( int a)
	{
	 
		System.out.println(" ....... Second Mathad called....");
		
	}
	public static void main(String[] args)
	{
		MethadOverloadding a =new MethadOverloadding();
		a.show(10);
		a.show();
	}
	
	
}
