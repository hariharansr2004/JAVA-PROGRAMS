package Threads;

public class Threadingtask2 extends Thread{
	public int[] marks;
	Threadingtask2(int[] marks){
		this.marks=marks;
	}
	
	public void run() {
		int sum=0,n=marks.length;
		for(int i:marks) {
			sum=sum+i;
		}
		int avg=sum/n;
		System.out.println("Average Mark "+avg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadingtask2 t = new Threadingtask2(new int[]{96,95,92,98,94});//to give an array as input directly
		t.start();
	}

}
