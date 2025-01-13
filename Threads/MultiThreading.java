package Threads;
/* Multi-tasking:Mutliple process or operations running simulatanoeusly. eg:running multiple apps
 * Multi-threading: One process eg:chatting with ur friend. sub-process: sending msg,auto suggestions,spellcheck for errors
 * The process of running multiple threads(sub-processes) simulataneously to complete a complex process.
 * Types of Multitasking:
 * Process Based Multitasking->Multiple process running simultaneously
 * Thread Based Multitasking->Concurreny in single process
 */

//Thread 1
class Multithread1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread 1 is executing a different task");
			try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();} // (1 sec->1000ms) 
			//Since our method is executing faster so i am creating a delay for better understanding of execution of threads.
			//Giving try-catch block in single line to better view
		} 
	}
}
//Thread 2
class Multithread2 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread 2 is running a different task:"+i);
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}	
	}
}
//Main Thread->it will execute line by line
public class MultiThreading {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Multithread1 t1=new Multithread1();
		Multithread2 t2=new Multithread2();
		t1.start();//starting thread 1
		t2.start();// starting thread 2
		//Thread Join Concept:
		//If we want to execute the print statement in main thread at last we can done by using join.
		//This join() used for joining with the main thread after a thread finishes its execution.
		t1.join();//thread 1 will complete and join with main thread
		t2.join();//thread 2 will complete and join with main thread
		System.out.println("Threads executions are Completed");//this will execute if all threads are completed
	
	}
}

	
	

	



