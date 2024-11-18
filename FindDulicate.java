package javaassignment;

public class FindDulicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] a= {1,2,3,4,5,6,8,5,6};
		  for (int i = 0; i < a.length-1; i++)
		  {
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]==a[j]&&i!=j) 
				{
					
					System.out.print(a[j]+"  ");
					
					
				}
			}
			
		}
		
		
		
		

	}

}
