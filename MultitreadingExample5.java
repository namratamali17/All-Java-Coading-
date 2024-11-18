package javaassignment;

public class MultitreadingExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Namrata Mali");
        System.out.println(Thread.currentThread().getName());
	}

}
