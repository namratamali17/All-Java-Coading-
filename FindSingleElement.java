package javaassignment;

public class FindSingleElement {

	public static void main(String[] args) {
		int []a= {1,2,1,2,3,4,5,4,3,7};
	
		for (int i = 0; i < a.length; i++) 
		{
			int cnt=0;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]!=a[j])
				{
	             cnt++;
				}
			}
			if(cnt==0)
			{
				System.out.println(a[i]);
			}
		}

	}
}
