package javaassignment;

public class ExceptionHandling1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try
 {
		int a=100 , b=0,c;
		c=a/b;
		 
		System.out.println(c);
		
		
	}
 catch (Exception e) {
	// TODO: handle exception
	 System.out.println(e);
	 System.out.println("you can not divide by zero......");
}

}
}