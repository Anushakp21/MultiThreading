package deadlock;

public class myThread extends Thread
{
  A a=new A();
  B b=new B();
  
  public void m1()
  {
	  this.start();
	  a.d1(b);//Main Thread
	  
  }
  @Override
  public void run()
  {
	 b.d2(a);//Child Thread 
  }
  public static void main(String[] args) {
	myThread t=new myThread();
	t.m1();
}
}
