package thread;
class MyThread  extends Thread{
	public void run() {
		
		System.out.println("Thread is running");
	}
	
}

public class threaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		t1.start();

	}

}
