package javaassignment;

public class FindSingleEle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,5,4,1,2,4,9,7,8,7,8};
		int res=a[0];
		for (int i = 1; i < a.length; i++) 
		{
			
			res=res ^ a[i];
			
			
		}
		System.out.print(res);

	}

}
