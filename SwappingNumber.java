package javaassignment;
import java.util.Scanner;

public class SwappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int a=sc.nextInt();
        int b=sc.nextInt();
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("after swapping "+ a +" "+ b);
        
		
		
		
	}

}
