package javaassignment;
import java.util.Scanner;

import org.w3c.dom.css.ElementCSSInlineStyle;
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println(" Enter the no....");
     int no=s.nextInt();
     int temp=0;
     for(int i=2;i<=no-1;i++)
     {
    	 if(no%i==0)
    	 {
    		 temp=temp+1;
    		 
    		 
    	 }
    	 
    	 if(temp==0) {
    		 System.out.println("No is prime .....");
    	 }
    	 else 
    	 {
    		 System.out.println("no is not prime");
    	 }
    	 
     }
	}

}
