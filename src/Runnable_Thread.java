class NewThread1 implements Runnable{
    Thread t;
    NewThread1(){
        t=new Thread(this,"Runnable Thread");
        t.start();
    }
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
public class Runnable_Thread{
    public static void main(String[] args) {
        new NewThread1();
    }
}
