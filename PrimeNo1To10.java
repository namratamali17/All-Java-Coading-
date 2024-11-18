package javaassignment;

import java.util.Scanner;

public class PrimeNo1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("enter two no for rnge");
		Scanner sc =new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
         for(int i=n1;i<=n2;i++)
         {
        	 for(int j=2;j<=i;j++)
        	 
        		 
        		 if(i%j==0)
        			 break;
        	 	 
       
			int j = 0;
			if(i==j)
        		 System.out.println(j);
         
         }
		
	}
		
	}


