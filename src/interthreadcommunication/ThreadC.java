package interthreadcommunication;

 class ThreadD extends Thread
{
	int total=0;
	@Override
	public void run()
	{
		synchronized (this) 
		{
			System.out.println("Child Thread starts execution");//2
			for(int i=1;i<100;i++)
			{
				total=total+i;
			}
			System.out.println("Child Giving notification call");//3
			this.notify();
		}
		
	}
}
public class ThreadC 
{
	public static void main(String[] args) throws InterruptedException {
	ThreadD d=new ThreadD();
	d.start();
	Thread.sleep(1);
	synchronized (d) 
	{
		System.out.println("Main thread calling wait method");//1
		d.wait(100);
		System.out.println("Main Thread got notification");//4
		System.out.println(d.total);//5
	}	
	}
	
}
