package daemon;

import deadlock.myThread;

public class Test
{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		Thread.currentThread().setDaemon(true);//Exception
		myThread t=new myThread();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());	
		
	}
}
