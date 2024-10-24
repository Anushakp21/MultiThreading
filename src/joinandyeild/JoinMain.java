package joinandyeild;


class myThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				System.out.println("Child Thread");
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
public class JoinMain {
	public static void main(String[] args) throws InterruptedException {
		myThread t=new myThread();
		t.start();
		t.join();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
		
	}

}
