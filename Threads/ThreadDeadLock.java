package Threads;

public class ThreadDeadLock {
	private final String name;// final->name cant be changed
	public ThreadDeadLock(String name) {
		this.name=name;//current name
	}
	public String getName() {
		return name;// returns that current name
	}
	//Synchronized is a keyword thats is used to mark a block of code or method as synchronized which means that only one thread can execute it at a time.
	//Eg:if we remove Synchronized keyword from method another thread may modify the values of variables in-between operation which could change the total amount b/w the variables
	public synchronized void call(ThreadDeadLock caller){//creating obj caller by accesing class name
		System.out.println(this.getName()+"has asked to call me"+caller.getName());
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		caller.callMe(this);
	}
	//Deadlock for 2 generated Methods but lock on objects
	//caller 1 & caller 2 forcing to wait for each other
	//To unlock such locks.this would trigger
	//prevent call() function from being called
	public synchronized void callMe(ThreadDeadLock caller)
	{
		System.out.println(this.getName()+"has called me"+caller.getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDeadLock caller1=new ThreadDeadLock("Caller-1");
		ThreadDeadLock caller2=new ThreadDeadLock("Caller-2");
		
		new Thread (new Runnable() 
		{
			public void run() {
				caller1.call(caller2);
		}
		}).start();
	}
		
}


