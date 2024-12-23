package spring.core.entity;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;
@Component
public class Student 
{
   @Value("Ritik")
   private String name;
   @Value("101")
   private int rollno;
	@Value("90.25")
   private float marks;
   
   public Student() {
	super();
	// TODO Auto-generated constructor stub
}
   
   
public Student(String name, int rollno, float marks) {
	super();
	this.name = name;
	this.rollno = rollno;
	this.marks = marks;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}


@Override
public String toString() {
	return "Student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
}
  
//
//public void Display() {
//	System.out.println("Name = " +name);
//	System.out.println("Roll No = " +rollno);
//	System.out.println("Marks = " +marks);
//}

   
   
   
}
