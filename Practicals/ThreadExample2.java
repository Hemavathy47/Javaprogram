package programjava;

public class ThreadExample2 extends Thread{
	
	public void run() {
		for(int i=0;i<4;i++) {
			try {
				Thread.sleep(800);
			}
		    catch(InterruptedException e) {
		    	System.out.println(e);
		    }
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample2 t = new ThreadExample2();
		ThreadExample2 t1= new ThreadExample2();
		ThreadExample2 t2= new ThreadExample2();
		
		t.start();
		t1.start();
		t2.start();
		
		//t.run();
		//t1.run();
		//t2.run();
		
		t1.setName("Thread Mamta");
		t.setName("Thread Kim");
	}
		

	}


