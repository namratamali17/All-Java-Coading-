package javaassignment;
import java.util.HashSet;

public class FirstDublicateUsingHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] a= {12,4,7,5,9,77,65,7};
		 int temp=-1;
		 HashSet<Integer> hs =new HashSet<>();
		 for(int i=a.length-1;i>=0;i--)
		 {
			 if(hs.contains(a[i]))
			 {
				 temp=i;
				 
			 }
			 
			 else {
				 
				 hs.add(a[i]);
				 
			 }
			 
		 }
		 if(temp!=-1)
		 {
			 System.out.print("first dublicate element are ..."+a[temp]);
		 }
		 else {
			 
			 System.out.println("Dublicate element not found.....");
			 
		 }
		
		
		
		
		

	}

}
