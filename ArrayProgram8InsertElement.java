package javaassignment;

import java.util.Arrays;

public class ArrayProgram8InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a= {10,20,30,40,60,70,80,90,100};
		int indexPosition=2;
		int newvalue=50;
		for (int i = a.length-1; i<indexPosition ; i++) 
		{
			a[i]=a[i-1];
		}
		
		a[indexPosition]=newvalue;
		
		System.out.println("new array"+Arrays.toString(a));
		
	}

}
