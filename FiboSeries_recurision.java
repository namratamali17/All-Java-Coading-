package javaassignment;

public class FiboSeries_recurision {

	
	 static int a=0,b=1;
	 int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a+""+b);
		
		
		FiboSeries_recurision ob=new FiboSeries_recurision();
		ob.printfibo(10);

	}
	void  printfibo(int i)
	{
		if(i>=1)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			printfibo(i-1);
		}
	}

}
