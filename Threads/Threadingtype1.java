package Threads;
/*
 * 
 * What is a Thread?
 * A Thread is a very light-weighted or smallest unit of a process that allows a program to operate more efficiently by running multiple tasks simultaneously.
 * It represents a single sequence of instructions that can run concurrently with other threads.
 * Each and every thread belongs to one single process.Example:In browser multiple tabs can be different thread.
 * 
 * Why we need thread?
 *  For time saving
 *  To utilize the CPU completely. eg:To utilize the 8 cores of cpu which can able to run 16 threads
 * ----------------------------------------------------------------------------------------------------------
 * Two ways of implementing thread:
 * 1.extends Thread (class) case-sensitive
 * 2.implements Runnable (interface) case-sensitive
 * ----------------------------------------------------------------------------------------------------------
 * Thread based on task(time-bound in ms):
 * 1.sleep(ms)
 * 2.wait()
 * 3.await()
 * ----------------------------------------------------------------------------------------------------------
 * Life Cycle of Thread:
 * 1.New -> constructing and intializing thread
 * 2.Runnable-> Prepared to execute code in interface
 * 3.Running-> Thread for execution with or without time slot
 * 4.Blocked->Inactive
 * 5.Dead/Terminated->Thread exit at the run() process
 * ----------------------------------------------------------------------------------------------------------
 * Thread Priorities (based on scenario):
 * 1->  Lowest (Thread.MIN_PRIORITY)  Eg:Login
 * 5->  Standard (Thread.NORM_PRIORITY) Eg:Product search
 * 10-> Highest (Thread.MAX_PRIORITY) Eg:Payment gateway
 * ----------------------------------------------------------------------------------------------------------
 * Diff b/w wait and await?
 */	

public class Threadingtype1 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadingtype1 obj=new Threadingtype1(); //initialize thread
		obj.start();//thread starts
		System.out.println("The code is outside the thread");
}
	// we should void run only for thread
	public void run() //Once thread is started it enters into run()
	{
		System.out.println("The code is running the thread");

	}

}
