package javaassignment;

public class TestT 
{

	void show() 
	{
		System.out.println("111");
		
	}
	
}
class xyza extends TestT
{
	void show()
	{
		
		System.out.print("222");
	}
	
	public static  void main(String[] args)
	{
	    TestT t=new TestT();
	    t.show();
	    xyza x =new xyza();
	    x.show();
		
		
	}
	
	
}

