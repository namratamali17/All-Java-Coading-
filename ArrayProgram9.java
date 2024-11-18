package javaassignment;

import java.util.Arrays;

public class ArrayProgram9 {
// reverce Array 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a= {10,20,30,40,50,60,70,8,90,100};
       for (int i = 0; i < a.length/2; i++)
       {
		 
    	   int temp=a[i];
    	   a[i]=a[a.length-i-1];
    	   a[a.length-i-1]=temp;   
    	  
    	   
	   }
       System.out.println("Reverse array"+ Arrays.toString(a));
	}

}
