package Inheritance;
class course{
	public String name;
	public String instructor;
	public int credits;
	course(String name,String instructor,int credits){
		this.name=name;
		this.instructor=instructor;
		this.credits=credits;
	}
	public String disp() {
		return("The Course name is "+name+ " and the instructor is "+instructor+" and the credits for the course is "+credits);
		
	}
}
class  Onlinecourse extends course{
	public String platform;
	public int duration;
	Onlinecourse(String name,String instructor,int credits,String p,int d){
		super(name,instructor,credits);
		platform=p;
		duration=d;
	}
	
	public String disp() {
		String eligible;
		if (duration<=2) {
			
			eligible="This course is not eligible for the certificate";
		}
	
		else {
			eligible="This course is eligible for the certificate";
			
		}
		return(super.disp()+"\nThe platform is "+platform+ " the duration is "+duration+" months\n"+eligible);
			
	}
}


public class CourseInheritancetask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onlinecourse obj=new Onlinecourse("The complete Java Bootcamp","Google",5,"Coursera",10);
		Onlinecourse obj1=new Onlinecourse("The complete Java fullstack","IBM",3,"Coursera",2);
		System.out.println(obj.disp());
		System.out.println(obj1.disp());
		
		

	}

}
