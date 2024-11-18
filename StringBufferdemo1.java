package javaassignment;

public class StringBufferdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s =new StringBuffer("Namrta");
		System.out.println(s.insert(3, "bm"));
		System.out.println(s.reverse());
		System.out.println(s.substring(2, 5));
		s.setCharAt(2, 'c');
		System.out.println(s);
		
		
	}

}
