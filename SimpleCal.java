
package javaassignment;
import java.util.Scanner;


public class SimpleCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String yn;
		
		do {
			 
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the first no");
		 int no1=s.nextInt();
		 System.out.println(" enter the Second no");
		 int no2=s.nextInt();
		 
		System.out.println(" enter ur choice  (+,-,*,/)");
		String sy = s.next();
		
		int res;
		switch (sy) {
		case "+" : res=no1+no2;
			System.out.println("Addition is ="+res);
			
			break;
		case "-" : res=no1-no2;
		System.out.println("Substraction is ="+res);
		
		break;
		case "*" : res=no1*no2;
		System.out.println("Multiplication is ="+res);
		
		break;
		case "/" : res=no1/no2;
		System.out.println("Dividation is ="+res);
		
		break;

		default:
			System.out.println("Invalid Choice ............enter ur valid choice");
			break;
		}
	
		System.out.println("Do you want to be continue press y");
		yn=s.next();
		
		
		}while(yn.equals("y")||yn.equals("Y")) ;
			
		
		
		
		
		
	}
}
