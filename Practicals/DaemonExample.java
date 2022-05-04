package threads;

public class DaemonExample extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("I am Daemon");
		}
		else {
			System.out.println("I am User");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonExample t = new DaemonExample();
		DaemonExample t1= new DaemonExample();
		DaemonExample t2 = new DaemonExample();
		
		t1.setDaemon(true); //now t1 is daemon
		t.start();
		t1.start();
		t2.start();
		

	}

}
