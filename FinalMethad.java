package javaassignment;

class demo
{
 
	 final void show()
	{
		System.out.println("i am in demo ");
		
	}
	
	
}

public class FinalMethad extends demo {

	void show1()
	{
		System.out.println(" i am in  secand class ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalMethad a =new FinalMethad();
		a.show();

	}

}
