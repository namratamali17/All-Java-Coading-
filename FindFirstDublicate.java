package javaassignment;

public class FindFirstDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4,5,6,3,5};
		for (int i = 0; i < a.length-1; i++)
	    {
		  int temp=0;
		  for (int j = i+1; j < a.length; j++)
		  {
			  if(a[i]==a[j]&&(i!=j))
			  {
				  System.out.println(" first dublicate "+a[i]);
				  temp=temp+1;
				  break;
				  
			  }
			  
			  
	    	}
			
			if(temp>0)
			{
				break;
				
			}
			
			
		}
		
		
		
		
		
		
		
		
	}

}
