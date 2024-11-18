package javaassignment;

public class DeleteElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,20,30,40,50,60,70,80,9,100};
		int del=30;
		for (int i = 0; i < a.length; i++)
		{
			if(del==a[i])
			{
				for (int j = i; j < a.length-1; j++) {
					 a[j]=a[j+1];
					
				}
				break;
				
			}		
			
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print("  "+a[i]);
		}
		
		

	}

}
