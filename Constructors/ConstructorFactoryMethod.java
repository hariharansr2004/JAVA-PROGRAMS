package Constructors;
/*
 * Singleton Design Pattern
 * The same object is used throughout the class Eg:a project has more than 50 classes but it can be used with a single obj
 * It should be used by createfactorymethod
 */

public class ConstructorFactoryMethod {
	private int age;
	private String name,department;
	private ConstructorFactoryMethod(String name,int age,String department)
	{
		this.name=name;
		this.age=age;
		this.department=department;
	}
	
	public static ConstructorFactoryMethod CreateFactoryMethod(String name,int age,String department)
	{
		return new ConstructorFactoryMethod(name,age,department);
	}
	
	public static void main(String[] args)
	{   
		//creating obj using Factory method
		ConstructorFactoryMethod cf1=ConstructorFactoryMethod.CreateFactoryMethod("Ajay", 23, "BCA");
		ConstructorFactoryMethod cf2=ConstructorFactoryMethod.CreateFactoryMethod("Vjay", 23, "BCA");
		//to print 
		//When we have a super class with multiple sub class based on i/p we need to
		System.out.println("Name "+cf1.name+" "+"age "+cf1.age+" dept "+cf1.department);
		System.out.println("Name "+cf2.name+" "+"age "+cf2.age+" dept "+cf2.department);
	}
}