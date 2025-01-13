package Threads;

public class ThreadPriority extends Thread {
	public void run() {
		System.out.println("Current Thread: "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority obj=new ThreadPriority();
		ThreadPriority obj1=new ThreadPriority();
		ThreadPriority obj2=new ThreadPriority();
		obj.setPriority(MAX_PRIORITY);
		obj1.setPriority(NORM_PRIORITY);
		obj2.setPriority(MIN_PRIORITY);
		obj.start();
		obj1.start();
		obj2.start();
	}

}

