package javaassignment;

public class NumberPattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=8;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=5;j++)
				{
					count=count+1;
					System.out.print(count +" ");
				}
				
				
				}
			else {
				
				 int temp=count+1;
				 for(int j=count+5;j>=temp;j--)
				 {
					 
					 count=count+1;
					 System.out.print(j+" " );
					 
					 
					 
				 }
				
				
			}
			System.out.println();
			}
		}

	}

