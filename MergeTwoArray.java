package javaassignment;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4};
		int[] b= {5,6,9,7,2};
		int a_leng=a.length;
		int b_leng=b.length;
		int c_leng=a_leng+b_leng;
		int[] c=new int[c_leng];
		for (int i = 0; i < a_leng; i++)
		{
			c[i]=a[i];
			
		}
		for (int i = 0; i < b_leng; i++)
		{
		
			c[a.length+i]=b[i];
			
		}
		for (int i = 0; i < c_leng; i++)
		{
			System.out.print(" "+c[i] );
		}
		
		

	}

}
