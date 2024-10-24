package joinandyeild;

class YieldThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread");
        Thread.yield(); 
    }
}
public class Main {
	 public static void main(String[] args) {
	        YieldThread1 y = new YieldThread1(); 
	        y.start(); 
	        System.out.println("Main Thread");
	    }

}
