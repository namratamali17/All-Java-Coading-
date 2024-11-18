package javaassignment;
import java.util.ArrayList;

public class EvenOdd_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {4,5,1,6,8,9,44,12,36,41,45,13,14,16,9,};
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		for (int i = 0; i < a.length; i++) 
		{
			   if (a[i]%2==0)
			   {
				  a1.add(a[i]);
				  
				  
		    	}
			   else 
			   {
				a2.add(a[i]);
			}
		
			
		}
		System.out.println("Even no are...");
		for(int no:a1)
		{
          System.out.print(no+" ");
		 
		}
		
	   System.out.println(" \n");
	   
		System.out.println(" Odd no are ...");
		for(int no:a2)
		{
			System.out.print(no+" ");
			
		}
	}
}
