package Threads;

public class Mythreadclass implements Runnable {
	
	public void run() {
		System.out.println("HOOOOOOOOOOO");
	}

	public static void main(String[] args) {
		 Mythreadclass a=new Mythreadclass();
		Thread b=new Thread(a);
		b.start();
		
	}

}
