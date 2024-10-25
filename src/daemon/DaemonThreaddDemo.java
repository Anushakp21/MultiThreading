package daemon;

public class DaemonThreaddDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		Mythread t=new Mythread();
		t.setDaemon(true);
		t.start();
		System.out.println("End");
	}
}
