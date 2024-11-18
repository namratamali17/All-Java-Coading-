package javaassignment;
import java.util.Scanner;

class yougerAgeException extends RuntimeException
{
  
	public yougerAgeException( String mgs) {
		// TODO Auto-generated constructor stub
		super(mgs);
	}
}


public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur age...");
		int age=sc.nextInt();
		
       if(age>18)
       {
    	  // System.out.println("eligible");
    	   throw new yougerAgeException("you eligible");
    	   
       }
       else 
       {
    	   
    	   System.out.println("not eligible");
       }
	}

}
