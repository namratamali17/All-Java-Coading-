package javaassignment;

import java.util.HashSet;
import java.util.Set;

public class FindDublicateUsingHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,5,4,6,2,4,2};
	Set<Integer> s =new HashSet<>();
	for(int no:a)
	{
		 boolean b=s.add(no);
		if(b==false)
		{
			System.out.print( "  "+no);
		}
		
	}
		

	}

}
