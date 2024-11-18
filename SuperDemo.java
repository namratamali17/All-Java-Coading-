package javaassignment;

class A
{
	int a=10;
	
	
}
class SuperDemo extends A
{
  
	int a=20;
	void show(int a)
	{
		
		System.out.println(a);
		System.out.println(this.a);// 20 current class variable display 
		System.out.println(super.a);// 10 spuer class varibale display
	}
	
	public static void main(String[] args)
	{
		SuperDemo t =new SuperDemo();
		t.show(30);
		
	}

}
