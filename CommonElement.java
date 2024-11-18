package javaassignment;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {1,5,8,4,6,2,74,12,13};
        int[] b= {12,51,55,41,8,4,66,13,7};
        
        for (int i = 0; i < a.length; i++)
        {
        	for (int j = 0; j < b.length; j++)
        	{
			     if(a[i]==b[j])
			     {
			        System.out.print(" "+a[i]);
			     
			     }
				
			}
			
		}
		
		
		
		
	}

}
