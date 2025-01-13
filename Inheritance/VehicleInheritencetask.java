package Inheritance;

class Vehicle{
	public String make;
	public String model;
	public int year;
	Vehicle(String m,String mod,int yr){
		make=m;
		model=mod;
		year=yr;
	}
	public String display(){
		return("The vehicle is manufactured by "+make+ " and the model and year is "+model+" "+year);
	}	
}
class car extends Vehicle{
	public int trunksize;
	car(String m,String mod,int yr,int t){
		super(m,mod,yr);
		trunksize=t;
	}
	public String display() {
		return(super.display() +" and the trunk size is "+trunksize);
	}
		
}
class truck extends Vehicle{
	public int payload;
	truck(String m,String mod,int yr,int p){
		super(m,mod,yr);
		payload=p;
	}
	public String display() {
		return(super.display()+" and the payload capacity is "+payload);
		}
}

public class VehicleInheritencetask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle("Volvo","XC80",2004);
		car c=new car("Toyota","Fortuner",2023,1000);
		truck t=new truck("Scania","7500R",2025,100);
		System.out.println(v.display());
		System.out.println(c.display());
		System.out.println(t.display());
		
		

	}

}




