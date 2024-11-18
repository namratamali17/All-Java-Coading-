package javaassignment;
import java.util.Scanner;

public class Factorial_using_recurrsion {
  
	static int fact=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no");
        int no=s.nextInt();
        Factorial_using_recurrsion ob=new  Factorial_using_recurrsion();
        ob.calfact(no);
        System.out.println("factorial of "+no+"is"+fact);
	}
  void calfact(int no)
  {
	  if(no>=1)
	  {
		  fact=fact*no;
		  calfact(no-1);
	  }
  }
}
