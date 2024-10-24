package synchronization;

public class SynchronizedDemo {
	public static void main(String[] args) {
		Display d=new Display();
		
		myThread t=new myThread(d, "Dhoni");
		myThread t1=new myThread(d, "kohli");
		t.start();
		t1.start();
	}
}
