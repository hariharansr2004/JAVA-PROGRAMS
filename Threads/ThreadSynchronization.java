package Threads;
/*What’s Synchronization?
 * Synchronization in Java ensures that only one thread can access a shared resource or critical section at a time, preventing data corruption and inconsistencies.
 * Example: Imagine a scenario where multiple people need to take turns using a printer in an office. Synchronization in Java is like a system that ensures only one person can use the printer at a time, preventing conflicts and ensuring that everyone’s print jobs are processed correctly and without interference.
 
   Why use of synchronization or Why Synchronization is Needed ?
   If multiple threads try to simultaneously access and modify the shared data, it can lead to data corruption. 
   Inconsistent or incorrect values can be read or written, causing unexpected behaviour and incorrect program output.
   
   Consider the following example without synchronization:
   In the above code, the `Counter` object is shared between two threads (`t1` and `t2`). Both threads increment the counter 1000 times. 
   Ideally, the final count should be 2000.However, due to the lack of synchronization, 
  the final count may be less than 2000 because the increment operation (`count++`) is not atomic and can be interrupted.
*/
class counter{
int count;
	public synchronized void increment() { //remove synchronized to see the result
		count++;
	}
}

public class ThreadSynchronization {
	public static void main(String[] args) throws InterruptedException { // remember: throws exception should be given in main not in class
		counter c=new counter();
		Thread t1=new Thread() {
			public void run() {
				for(int i=0;i<1000;i++) {
					c.increment();
				}
			}	
		};
		t1.start();
		Thread t2=new Thread() {
			public void run() {
				for(int i=0;i<1000;i++) {
					c.increment();
				}
			}	
		};
		t2.start();
		t1.join();
		t2.join(); 
		System.out.println(c.count);

	}	
}
