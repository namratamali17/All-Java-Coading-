package javaassignment;

public class Animal {
	String colur;
	int age;
	void initObj(String a,int b)
	{
		colur=a;
		age=b;
		
		
	}
	void display()
	{
		System.out.println(" colur is "+colur);
		System.out.println(" age is "+age);
		
	}
	public static void main(String[] arg)
	{
		Animal c =new Animal();
		c.initObj("blue", 45);
		c.display();
	}
	

}
