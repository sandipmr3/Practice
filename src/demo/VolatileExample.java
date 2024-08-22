package demo;


public class VolatileExample extends Thread {
    private static volatile boolean running = true;

    public void run() {
        while (running) {
            // Thread keeps running until running is set to false
        	System.out.println("Runnint");
        }
        System.out.println("Thread stopped.");
    }

    public void stopRunning() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample thread = new VolatileExample();
        thread.start();

        Thread.sleep(1000); // Let the thread run for a while

        System.out.println("Stopping thread...");
        thread.stopRunning(); // Set running to false, thread should stop
    }
}
