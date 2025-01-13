package Threads;
/*Thread Interview Question*/
public class Threadstarttwice extends Thread {
	public void run() {
		System.out.println("Start can be done only once but run can be used many times");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadstarttwice a=new Threadstarttwice();
		a.start();//invoke method run
		//a.start();//throws IllegalThreadState Exception if we again call start so start can be done only once.
		a.run();//it runs fine but it does not start as a separate stack
		

	}

}
