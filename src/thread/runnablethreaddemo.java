package thread;

class MyRunnable1 implements Runnable {

    public void run() {
        System.out.println("Runnable Thread is running");
    }
}
class MyRunnable2 implements Runnable {

    public void run() {
        System.out.println("Runnable Thread is running");
    }
}
class MyRunnable3 implements Runnable {

    public void run() {
        System.out.println("Runnable Thread is running");
    }
}

public class runnablethreaddemo {

    public static void main(String[] args) {

        MyRunnable1 r1 = new MyRunnable1();
        MyRunnable2 r2=new MyRunnable2();
        MyRunnable3 r3=new MyRunnable3();

        Thread t1 = new Thread(r1);

        Thread t2= new Thread(r2);
        Thread t3= new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
        
    }
}
