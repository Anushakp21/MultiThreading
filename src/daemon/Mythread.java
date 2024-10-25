
package daemon;

public class Mythread extends Thread
{
public void run()
{
	for(int i=0;i<10;i++)
	{
		System.out.println("Child Thread");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
}
