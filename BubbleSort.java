package javaassignment;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={36,25,48,65,4,17};
		for(int i=0;i<a.length;i++)
		{
			int temp;
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
			
		}
		
	}
	
}
