package javaassignment;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=1000,b=0,c;
			c=a/b;
			System.out.println(c);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("i am in finaly block....");
		}
		System.out.println("hello");

	}

}
