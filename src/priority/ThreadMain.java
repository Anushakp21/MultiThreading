package priority;

public class ThreadMain extends Thread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(4);
		System.out.println(Thread.currentThread().getPriority());
	}

}
