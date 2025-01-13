package EncapsulationandPolymorphism;
class Encapsulationtask{
	private String name;
	private int age;
	private int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getRollno(){
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
}

public class Encapsulate{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulationtask obj=new Encapsulationtask();
		obj.setName("Hariharan S");
		obj.setAge(18);
		obj.setRollno(21500169);
		System.out.println("Name:"+obj.getName());
		System.out.println("Age:"+obj.getAge());
		System.out.println("Rollno:"+obj.getRollno());
		
	}

}
