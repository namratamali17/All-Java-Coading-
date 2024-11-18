package javaassignment;

public class LinearSearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 String[] arr= {"Namrata","Shubham","Depali","ravina","ajay"};
		 
		 String  item="ajay";
		 int temp=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i].equals(item))
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
