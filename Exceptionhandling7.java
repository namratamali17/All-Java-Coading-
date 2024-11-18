package javaassignment;
class UnderAgeException extends Exception{
	
	public UnderAgeException() {
	
		// TODO Auto-generated constructor stub
		
		super("you are under age..");
		
	}
	UnderAgeException(String mgs){
		
		super(mgs);
		
	}
	
}
class Exceptoinhandling7
{
	public static void main(String[] args) {
		
		int age=17;
		try {
		if(age<18)
		{
			throw new UnderAgeException();
			
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}