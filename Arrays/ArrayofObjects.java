package Arrays;
import java.util.*;
/*
 * Array of objects-> Creating array for a class
 * Array of objects is used to store multiple instance of class within single array.
 * This allows us to easy manage a collections of objects.
 */
class Student{
	public String name;
	public int id;
	Student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	public void display() {
		System.out.println("Student Id & name is "+id+" "+name);
	}
	 public String toString() {
	        return "id=" + id + ", name='" + name + "'";
	    }
	
}
public class ArrayofObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr= new Student[10];
		arr[0]=new Student(100,"hari");
		arr[1]=new Student(100,"dk");
		arr[2]=new Student(200,"kumar");
		arr[3]=new Student(300,"saran");
		arr[0].display();
		arr[1].display();
		System.out.println("Another Way of passing Array Elements: ");
		Student[] arr1= { new Student(16,"Hari"),new Student(11,"DK"),new Student(29,"Kumaravel")};
		System.out.println(Arrays.toString(arr1));
	}
}
	


