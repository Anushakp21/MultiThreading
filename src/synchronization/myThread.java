package synchronization;

public class myThread extends Thread
{
	Display d;
	String name;
	public myThread(Display d,String name) {
		this.d=d;
		this.name=name;
	}
	@Override
	public void run()
	{
		d.wish(name);
	}


}
