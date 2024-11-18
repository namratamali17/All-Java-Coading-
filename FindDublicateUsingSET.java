package javaassignment;
import java.util.Set;
import java.util.HashSet;

public class FindDublicateUsingSET {
	
	public static void main(String []args)
	{
		int[] a= {4,1,2,3,6,5,8,7,9,6,7,2};
		
		Set<Integer> s=new HashSet<>();
		
		
		for(int no:a)
		{
			if (s.add(no)==false) {
				System.out.print(no+" ");
				
			}
		}
		
		
		
	}

}
