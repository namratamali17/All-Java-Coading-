package javaassignment;
import java.util.Scanner;
public class VotingAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your age ...");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			
			System.out.println("you are eligible for age ...");
		}
		else {
			System.out.println("not eligible...");
		}
		
	}

}
