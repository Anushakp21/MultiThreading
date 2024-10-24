package synchronization;

public class Display
{
	public  synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Morning");
			try
			{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(":"+name);
			
			
		}
	}

}
