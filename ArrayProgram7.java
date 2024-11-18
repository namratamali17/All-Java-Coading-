package javaassignment;

public class ArrayProgram7 {
	
	
	
	// find index of element
		 public static int findIndex(int[]a,int t)
		 {
			 if(a==null)return-1;
			 int len=a.length;
			 int i=0;
			 while(i<len)
			 {
				  if (a[i]==t) {
					  return i;	  
					
				}
				 else {
					i=i+1;
					 
				}
			 }
			 return i;
			 
		 }
		 
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] a= {12,45,33,114,778,322};
			System.out.println("index position  "+findIndex(a, 322));
			
			
			

		}

	}



