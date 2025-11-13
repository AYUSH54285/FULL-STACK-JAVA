//17/6/25
//Thread Grouping
//package com.pack1;
//public class ThreadGroupTest implements Runnable{
//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
//	}
//	public static void main(String[] args) {
//		ThreadGroupTest robj = new ThreadGroupTest(); //Class Object
//		
//		ThreadGroup tg = new ThreadGroup("Parent ThreadGroup");
//		
//		tg.setMaxPriority(10);
//		
//		Thread t1 = new Thread(tg,robj,"one");
//		t1.start();
//		
//		Thread t2 = new Thread(tg,robj,"one");
//		t2.start();
//		
//		Thread t3 = new Thread(tg,robj,"one");
//		t3.start();
//		
//		System.out.println("active threads : "+tg.activeCount());
//		System.out.println("THread Group Name : "+tg.getName());
//		
//	}
//}