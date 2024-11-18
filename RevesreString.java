package javaassignment;

public class RevesreString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="namrata";		
		String rev="";
		 
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse String is:  " +rev);

	}

}
   