package javaassignment;

import java.util.Arrays;

public class ArrayProgram6RemoveSepcific {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int[] a= {10,555,77,66,22,41,32,44,11};
          int remove=1;
          for(int i=remove;i<a.length-1;i++)
          {
        	  
        	  a[i]=a[i+1];
          }
		  System.out.println("remove element"+Arrays.toString(a));
		  
		  
		  
	}

}
