package javaassignment;

import java.awt.image.AreaAveragingScaleFilter;

public class ArrayProgram5 {
// calculate avrage
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,52,45,13,41,33,12};
		int sum=0;
		
		for (int i = 0; i < a.length; i++)
		{ 
			//double avg = 0;
			sum=sum+a[i];
			double avg=sum/a.length;
			System.out.print(avg);
			
		}
  
	
		
	}

}
