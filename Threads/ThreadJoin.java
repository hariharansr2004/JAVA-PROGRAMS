package Threads;
//If we want to execute the print statement in main thread at last we can done by using join.
//This join() used for joining with the main thread after a thread finishes its execution.
//Thread 1
class ThreadJoin implements Runnable{
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		//check if currentThread is alive
		System.out.println("Is alive?"+t.isAlive());
	}
	public static void main(String[] args) throws Exception {
		//Directly Passing Runnable: A new instance of the class(obj) implementing Runnable (ThreadJoin) is passed directly to the Thread constructor.
		Thread t=new Thread(new ThreadJoin());// passing runnable interface directly
		t.start();
		t.join(2000);//Waits for 1000ms for the thread to die once the thread is finished after then only main will execute the remaining part
		//joins stops the main thread execution untill the another thread finishes 
		
		System.out.println("Joining after 1000 "+"Milliseconds\n");
		System.out.println("Current Thread:"+t.getName());
		//checks if thread is alive
		System.out.println("Is alive?"+t.isAlive());
	}
}


