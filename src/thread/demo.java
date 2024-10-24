package thread;

class Hi extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1000); // Sleep for 100 ms
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
        	 System.out.println("hello");
            try {
                Thread.sleep(1000); // Sleep for 1000 ms (1 second)
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
           
        }
    }
}

public class demo {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
         try{Thread.sleep(10);}
         catch(Exception e)
         {
         }
        obj2.start();  // Start the "hello" thread
    }
}
