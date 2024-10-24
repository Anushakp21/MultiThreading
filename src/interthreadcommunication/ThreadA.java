package interthreadcommunication;

class ThreadB extends Thread
{
	int total=0;
	@Override
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			total =total+i;
		}
		this.notify();//IllegalMonitorStateException
	}
}
public class ThreadA 
{
public static void main(String[] args) throws InterruptedException {
	ThreadB b=new ThreadB();
	b.start();
	b.wait();
	System.out.println(b.total);
}
}
