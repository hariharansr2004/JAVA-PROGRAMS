package Threads;
/* Daemon Thread is a low priority background thread that supports user threads and provide assist with background process.
 *  Diff b/w Normal Thread and daemon thread?
 * Thread are high-priority threads which runs in foreground
 * Daemon Thread is a low priority thread and runs in background
 */
public class DaemonThread extends Thread{
	//constructor
	public DaemonThread(String name) {
		super(name);		//if we use this it will go out of the thread
	}
	//method
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+" is daemon thread");
		}
		else {
			System.out.println(getName()+" is User thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread t1=new DaemonThread("HS");
		DaemonThread t2=new DaemonThread("DK");
		DaemonThread t3=new DaemonThread("KV");
		//To start a Daemon thread we should use setDaemon as True
		//Set user thread t1 to daemon
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.setDaemon(true);
		t3.start();
	}
}

// My Example
/*public class des extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName()+" is a daemon thread");
		}
		else {
			System.out.println(Thread.currentThread().getName()+" is a user thread");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		des t=new des();
		des t1=new des();
		t.setDaemon(true);
		t.start();
		t1.start();
	}
}*/