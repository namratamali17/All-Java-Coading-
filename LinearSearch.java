package javaassignment;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr= {4,6,8,9,46,7,2,3,1,96,45,21,45,62};
		 
		 int item=77;
		 int temp=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==item)
			 {
				 System.out.println("item present at "+i+" position ");
				 temp=temp+1;
			 }
			 
			  
			 
		 }
		 if(temp==0)
		 {
			 System.out.println("item is not found........");
		 }
		
		
	}

}
