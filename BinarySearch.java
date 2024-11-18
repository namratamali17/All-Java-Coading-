package javaassignment;

import javax.swing.text.Position;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a= {5,4,9,6,8,7,12,65,48,12,34};
      
		
		int srch=12;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while(li<=hi)
		{
		
			if(a[mi]==srch)
			{
				System.out.print(" Index Position "+mi);
			}
			
			else if(a[mi]==srch)
			{
				li=mi+1;
				
			}
			else 	
			{
				hi=mi-1;
				
			}
			mi=(li+hi)/2;
			
		}
		if(li>hi)
		{
			System.out.println("element is not found..");
		
		}
	}
		
	}

