package javaassignment;

import java.awt.SecondaryLoop;

public class FindSecoandLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		  int[] a= {5,4,6,7,45,77,11,22,41};
		  int temp;
		  
		  
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=i+1;j<a.length;j++)
			  { 
				  if(a[i]<a[j])
				  {
					  temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
					  
					  
				  }
				  
			  }
			  
			  System.out.print(" "+a[i]);
		  }
		
		
		
	}

}
