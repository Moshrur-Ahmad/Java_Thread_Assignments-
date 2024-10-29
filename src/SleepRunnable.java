class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Sleep Thread");
        t.start();
    }
    @Override
    public void run() {
        System.out.println("Hello");
        for (int n = 10; n > 0; n--) {
            System.out.println("Child Thread: "+n);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main Thread Interrupted");

            }
        }
        System.out.println("Exiting Child Thread");
    }
}
public class SleepRunnable {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        NewThread obj=new NewThread();
        try {
            obj.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main tread exited");
    }
}
