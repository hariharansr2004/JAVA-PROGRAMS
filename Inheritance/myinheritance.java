package Inheritance;
//constructor-super-ovveride
class Credentials{
	public int regno;
	public String psw;
	Credentials(int regno,String psw){
		this.regno=regno;
		this.psw=psw;
		}
	public String display(int regno,String psw){
		return("The credentials are "+regno+" "+psw);
		}	
}

class Profile extends Credentials{
	public String name;
	public String dept;
	Profile(int regno,String psw,String n,String dt)
	{
		super(regno,psw);
		name=n;
		dept=dt;
	}
//over-ride
	public String display(){
		return(super.display(regno, psw)+" and the profile is "+name+" from "+dept);
		}	
		
}

public class myinheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profile obj=new Profile(21500169,"8C1l1","Hariharan","IT");
		System.out.println(obj.display());
	

	}

}
