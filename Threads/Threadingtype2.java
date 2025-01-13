package Threads;
/*Thread can be accessed by class only
* Thread object can be directly executed
* Runnable object fetches thread object and executes*/
public class Threadingtype2 implements Runnable {
	public void run() {
		System.out.println("Thread is running successfully");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new Threadingtype2(); //interface object thread
		Thread t1=new Thread(r1,"Mythread");//passing interface object to thread object
		t1.start();
		//getName() to get the name of thread
		String a=t1.getName();
		System.out.println(a);
		

	}

}
