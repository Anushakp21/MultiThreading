package deadlock;

import javax.sql.rowset.spi.SyncFactory;

public class A 
{
   public synchronized void d1(B b)
   {
	   System.out.println("Thread1 starts execution of d1 method");
	   try
	   {
		   Thread.sleep(2000);
	   }
	   catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }
	 
	   System.out.println("Thread1 trying to call B's last() method");
	   b.last();
   }
   public synchronized void last()
   {
	   System.out.println("Inside A last method");
   }
   
}
