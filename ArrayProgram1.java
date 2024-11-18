package javaassignment;

import java.util.Arrays;
// sorting Arrays 
public class ArrayProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1755,4445,6663,4854,96344,77,888,3331,465,4896};
		
		Arrays.sort(a);
		System.out.println(" sorting arrays ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
