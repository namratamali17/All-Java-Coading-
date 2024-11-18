package javaassignment;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionHandling4 t =new ExceptionHandling4();
		
		try {
		t.divide();
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	void divide() {
		
	int a=100,b=0,c;
		c=a/b;
		System.out.println(c);
		
	
		
	}

	
}
