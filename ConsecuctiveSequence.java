package javaassignment;

import java.util.HashSet;

public class ConsecuctiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {3,9,1,10,4,20,2,12};
		HashSet<Integer> hs =new HashSet<>();
		for (int i = 0; i < a.length; i++)
		{
			hs.add(a[i]);
			
		}
		int long_leng=0;
		
		for (int i = 0; i < a.length; i++)
		{
			if (!hs.contains(a[i]-1))
			{
			
				int no=a[i];
				
			while (hs.contains(no))
			{
				no++;
			}
			if (long_leng<no-a[i])
			{
				
				
				long_leng=no-a[i];			
			}
		  }		
		}	
		System.out.print("  longest sub Squence length is... "+long_leng);
		  
	}

}
