package javaassignment;

class employee
{

	private int empid;
	public void setempid(int eid)
	{
	    empid=eid;
	    
	}
	public int getemid()
	{
		return empid;
		
	}
	
}
class Encapsulation 
{
	public static void main(String[] args )
	{
		employee e =new employee();
		e.setempid(1022);
		System.out.println(e. getemid());
		
	}
	
	
}
