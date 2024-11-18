package javaassignment;

public class SlectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {38,64,8,16,3,45,96,74,32,25,4,8};
		int min,temp=0;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			
			for(int j=i+1;j<a.length;j++)
			{
				
				if (a[j]<a[min])
				{
					min=j;
					
				}
			}
			
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
	
			
			
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+"  ");
		}
		
		
	}

}
