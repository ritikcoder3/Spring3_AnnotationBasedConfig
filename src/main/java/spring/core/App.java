package spring.core;
import org.springframework.context.ApplicationContext;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.entity.Student;
public class App {

	public static void main(String[] args) {
//		
		//Annotation with Xml
       ApplicationContext ioc=new ClassPathXmlApplicationContext("ApplicationContext.xml"); 
       Student std1 =(Student) ioc.getBean("student");
	     System.out.println("Annotation  with XmlBased");
       System.out.println(std1); 
       
       System.out.println("-------------------------------------------");

       //Annotation with Java 
       ApplicationContext ioc1= new AnnotationConfigApplicationContext(SpringConfigFile.class);
       Student std2= (Student) ioc1.getBean("student");
       System.out.println("Annotation  with JavaBased");
       System.out.println(std2); 
       
      
       
       // without toString
//       std.Display();
	}

}
