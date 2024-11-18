package javaassignment;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s=new StringBuffer();
		System.out.println(s.capacity());
		s.append("hello");
		System.out.println(s.capacity());
		s.append("namrata mali");
        System.out.println(s.capacity());
        System.out.println(s.length());
        
        
	}

}
