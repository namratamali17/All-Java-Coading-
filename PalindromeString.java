package javaassignment;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s ="mam";
		 String rev="";
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 rev=rev+s.charAt(i);
			 
			 
		 }
		// System.out.println(rev);
		 if(s.equals(rev))
		 {
			 System.out.println("String is palindrome");
		 }
		 else 
			 {
				System.out.println("not palindrome" ); 
				 
				 
			 }
		}

	}

