package programjava;

public class ThreadJoinExample extends Thread{
	
	public void run() {
		for(int i; i<=5;i++) {
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ThreadJoinExample t = new ThreadJoinExample();
        ThreadJoinExample t1 = new ThreadJoinExample();
        ThreadJoinExample t2 = new ThreadJoinExample();
        
        t2.start();
        t1.start();
        try {
        	t1.join();
        }
        catch(InterruptedException e) {
        	//TODO Auto-generatedException e
        	System.out.println(e);
        }
        t1.start();
        t2.start();
        
        }
	}

}
