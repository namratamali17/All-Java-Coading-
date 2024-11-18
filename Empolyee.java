package javaassignment;

public class Empolyee {
	
	int empid;
	String name;
	static String company ="infosys it";
	
	 Empolyee(int empid,String name)
	
   {
		this.empid=empid;
		this.name=name;
			
	}
	void display()
	{
		System.out.println(empid+" "+name+ " "+company+" ");
		
	}

	 public static void main(String[] args)
	 {
		 employee e1=new employee();
		
		
	 }
	  
	
}
