package Inheritance;

class basic_membership{
	public String name;
	public String mem_type;
	public int duration;	
	basic_membership(String name,String mem_type,int duration){
		 this.name = name;
	     this.mem_type = mem_type;
	     this.duration = duration;
	}
	public int fees() {
		int basefee,a;
		basefee=50;
		a=basefee*duration;
		return a;
		
	}
	public String specialoffer(){
		if (mem_type.equals("Gold") || mem_type.equals("Platinum")) {
		    return "Eligible";
		}
		return "Not eligible";
	}
	public void display() {
		System.out.println("Member name: "+name);
		System.out.println("Membership type: "+mem_type);
		System.out.println("Duration: "+duration+" months");
		System.out.println("Membership fee: "+fees());
		System.out.println("Specialoffer: "+specialoffer());
		
	}
	
}

class premium_membership extends basic_membership {
	public boolean personalTrainer;
	public boolean spa_access;
	premium_membership(String name,String mem_type,int duration,boolean personalTrainer,boolean spa_access){
		super(name,mem_type,duration);
		this.personalTrainer = personalTrainer;
        this.spa_access = spa_access;
	}
	public int fees() {
		int amt = 0;
		if(personalTrainer) {
			int b=super.fees();
			amt=30*b*duration;
			}
		else if(spa_access) {
			int b=super.fees();
			amt=20*b*duration;
		}
	
		return amt;
	}
	
	public String pt() {
		String ans;
		if (personalTrainer){
			ans="Yes";
		}
		else {
			ans="No";
		}
		return ans;
	}
	public String sa() {
		String ans;
		if (spa_access){
			ans="Yes";
		}
		else {
			ans="No";
		}
		return ans;
	}
	 public void display() {
	        super.display();
	        System.out.println("Personal Trainer: " +pt() );
	        System.out.println("Spa Access: " + sa());
	    }
	
}


public class Gymmenershipinheritancetask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		premium_membership obj=new premium_membership("Hariharan S","Platinum",10,true,true);
		premium_membership obj1=new premium_membership("Pradeepa S","Platinum",10,false,true);
		premium_membership obj2=new premium_membership("Kumaravel R","Gold",5,true,false);
		basic_membership obj3=new basic_membership("Prasanna R","Silver",10);
		premium_membership obj4=new premium_membership("Prasanna R","Silver",10,false,false);
		
		obj.display();
		System.out.println("-----------------------");
		obj1.display();
		System.out.println("-----------------------");
		obj2.display();
		System.out.println("-----------------------");
		obj3.display();
		System.out.println("-----------------------");
		obj4.display();

	}

}
