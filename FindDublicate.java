package javaassignment;

public class FindDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,7,5,4,9,1,6,4,10,45,87,3,4,5};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]&&i!=j)
				{
					System.out.print(a[j]+" ");
				}
			}
		}
		
		

	}

}
