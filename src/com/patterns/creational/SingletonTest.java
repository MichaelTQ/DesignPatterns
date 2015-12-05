package com.patterns.creational;

public class SingletonTest implements Runnable{
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new SingletonTest());
		Thread t2 = new Thread(new SingletonTest());
		Thread t3 = new Thread(new SingletonTest());
		
		t1.start();
		t2.start();
		t3.start();
		
		t2.join();
		t3.join();
		t1.join();
	}
	
	public void run() {
		System.out.println("Classname: " + this.getClass());
		System.out.println("in run() method!");
		Singleton.getInstance();
	}
}
