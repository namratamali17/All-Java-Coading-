package javaassignment;

public class MissingNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,5,6,7,8,9,10,11};
		
		int expected_no_ele =a.length+1;
		int total_sum=expected_no_ele*(expected_no_ele+1)/2;
         int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
			
		}

		System.out.println("missing element is "+(total_sum-sum));
		
	}

}
