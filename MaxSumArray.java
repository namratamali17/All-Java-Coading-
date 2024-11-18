package javaassignment;

public class MaxSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {11,25,45,66,17,66,441};
		
		int k=4;
		for(int i=0;i<a.length-1;i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				
					
					
				}
			}
			
			if(i==k)
			{
				System.out.println(k+ " largest element in the array is "+a[i]);
				break;
			}
			
		}
		
		System.out.println("..........");
		for(int i=0;i<a.length;i++)
		{
			
		 System.out.print(a[i]+" ");
		}
		

	}

}
