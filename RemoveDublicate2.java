package javaassignment;

public class RemoveDublicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,2,3,4,5,6,6,7,8,9,9};
		
		int j=0;
		for (int i = 0; i < a.length-1; i++)
		{
			if(a[i]!=a[i+1])
			{
				
				a[j]=a[i];
				j++;
			}
			
			
			
		}
		
		a[j]=a[a.length-1];
		for (int i = 0; i <j+1; i++) {
			System.out.print(" "+a[i] );
			
		}

		
		
		
		

	}

}
