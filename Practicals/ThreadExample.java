package programjava;

public class ThreadExample extends Thread{
	public void run() {
		System.out.println("I am thread ..... Thread is Runnng");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample t = new ThreadExample();
		//t/start();
		//t.start(); //java.lang.IllegalThreadstateexecution

		
	}

}
