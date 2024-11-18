package javaassignment;

public class Stringrev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="ajay";
		String rev="";
		for(int i=a.length()-1;i>=0;i--)
		{
			
			rev=rev+a.charAt(i);
			
		}
		System.out.println(rev);

	
	if(a.equals(rev))
	{
	
		System.out.println("palindrome");
	}
	else {
		
		System.out.println("not palindromes");
	}

}
}