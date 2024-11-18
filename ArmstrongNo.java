package javaassignment;
import java.util.Scanner;
public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      System.out.println("enter the no...");
      int no=s.nextInt();
      int t1=no;
      int l=0;
      while(t1!=0) {
    	  l=l+1;
    	  t1=t1/10;
    	  
      }
      
      int t2=no;
      int arm=0;
      int rem;
      while(t2!=0) {
    	  int mul=1;
    	  rem=t2%10;
    	  for(int i=1;i<=l;i++)
    	  {
    		  mul=mul*rem;
    		  
    	  }
    	  arm=arm+mul;
    	  t2=t2/10;
      }
      if(arm==no)
      {
    	  System.out.println("Armstrong no.."+no);
    	  
      }
      else {
    	  System.out.println("NOT Armstrong "+no);
      }
	}

}
