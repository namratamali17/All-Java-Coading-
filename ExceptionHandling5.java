package javaassignment;

public class ExceptionHandling5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionHandling5 t =new ExceptionHandling5();
		t.divide();
		System.out.println("heloo...");
		
	}
	void divide() {
		
		try {
		int a=100,b=0,c;
		c=a/b;
		System.out.println(c);
		
	}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	
}
