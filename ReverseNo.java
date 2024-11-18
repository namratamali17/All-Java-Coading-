package javaassignment;
import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter ur no for reverse");
		int no=s.nextInt();
		int rev=0,rem;
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem; 
			no=no/10;
			
		}

		System.out.println("reverse no is: "+rev);
	}

}
