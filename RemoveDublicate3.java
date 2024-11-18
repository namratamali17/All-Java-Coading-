package javaassignment;

import java.util.HashSet;

public class RemoveDublicate3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,2,3,4,5,6,6,7,8,9,9};
		HashSet<Integer> hs =new HashSet<>();
		for (int i = 0; i < a.length; i++)
		{
			hs.add(a[i]);
			
			
		}
		for(int no:hs) {
			System.out.print(" "+no );
		}
		
		

	}

}
