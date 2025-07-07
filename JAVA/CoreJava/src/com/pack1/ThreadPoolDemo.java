package com.pack1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo extends Thread{
	private String msg;
	public ThreadPoolDemo(String msg) {
		this.msg=msg;
	}
	@Override
	synchronized public void run() {
		System.out.println(Thread.currentThread().getName() + " (Begining) message = "+msg);
		processMessage();
		System.out.println(Thread.currentThread().getName() + " (Ending)");
		processMessage();
	}
	private void processMessage() {
		try {
			Thread.sleep(30000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3); // 3 thread
		
		for(int i=1 ; i<=5 ; i++) { // 5 iterations => 5 task
			ThreadPoolDemo tpdobj = new ThreadPoolDemo(""+i);
			Thread t = new Thread(tpdobj);
			executor.execute(t);
		}
		executor.shutdown();
		while(!executor.isTerminated()); //!(true) ====> false
		{
			
		}
		System.out.println("Finished all thread");
	}
}
