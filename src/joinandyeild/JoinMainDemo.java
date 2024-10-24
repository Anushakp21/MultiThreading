package joinandyeild;

class myThread1 extends Thread
{
	 static Thread mt;
	@Override
	public void run()
	{
		try {
			mt.join();
			System.out.println("Child Thread");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

public class JoinMainDemo {
	public static void main(String[] args) throws InterruptedException {
	myThread1.mt=Thread.currentThread();
	myThread1 t=new myThread1();
	t.start();
	t.join();
	System.out.println("Main Thread");
	}

}
