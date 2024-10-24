package interrupt;


class myThread extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
			System.out.println("Iam LAZY thread");
			Thread.sleep(1000);
			}
		}
		catch (Exception e) {
			
			System.out.println("got interrupted");
			// TODO: handle exception
		}
		
	}
	
	
}
public class InterruptDemo {
public static void main(String[] args) {
	myThread t=new myThread();
	t.start();
	t.interrupt();
	
	System.out.println("End");
	
}
}
