package Threads;
class threadodd extends Thread{
	public int n=20; // we should void run only for thread
	public void run() {
	int i=0;
	while(i<=n) {
		if(i%2==1) {
			System.out.println(i+" is Odd");
		}
		i++;
	}
  }	
}
class threadeven extends Thread{
	public int n=20;
	// we should void run only for thread
	public void run() {
	int i=0;
	while(i<=n) {
		if(i%2==0) {
			System.out.println(i+" is even");
		}
		i++;
	}
  }	
}
public class Threadtask {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		threadodd t1=new threadodd();
		threadeven t2=new threadeven();
		//getting priority of thread
		System.out.println(t1.getPriority());
		//setting priority of thread
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}
}
