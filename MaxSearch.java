package javaassignment;

public class MaxSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,50,8,6,7,4,1,88,66,74,182,645,84};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		
		System.out.println("Maximum Element is the.."+max);

	
	
	
	
	
	
	
	}
}
