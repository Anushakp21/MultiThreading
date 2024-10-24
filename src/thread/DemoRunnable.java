package thread;
class Hii implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(1000); // Sleep for 100 ms
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class Helloo implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(1000); // Sleep for 1000 ms (1 second)
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

		}
	}
}

public class DemoRunnable {
	public static void main(String[] args) {
		Runnable obj1 = new Hi();
		Runnable obj2 = new Hello();

		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		try{Thread.sleep(10);}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		t2.start();
	}
}
