package javaassignment;

public class FirstDublicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,15,8,7,9,5,6,12,85,74,4};
		for(int i=0;i<a.length-1;i++)
		{
			int temp=0;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]&&i!=j)
				{
					System.out.print(" first Dublicate  element are..."+a[i]);
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
