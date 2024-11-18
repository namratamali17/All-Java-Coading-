package javaassignment;

import javax.sound.midi.VoiceStatus;

public class Student {
  
	int  id;
	String name;
	int age;
	
	public Student( int i,String n) {
		// TODO Auto-generated constructor stub
		
		id=i;
		name=n;
		
		
	}
	public Student( int i,String n,int a) {
		// TODO Auto-generated constructor stub
		 id=i;
		 name=n;
		 age=a;
	
		
	}
     void display()
	{
		System.out.println("id is="+id);
		
		System.out.println("name is="+name);
		System.out.println("age is="+age);
		
		
	}
	public static void main(String args []) {
		 
		
		Student s=new Student(101, "namrata");
		Student b= new Student(455, "ajay",25);
		b.display();
		s.display();
		
	}
	
	
	
}
