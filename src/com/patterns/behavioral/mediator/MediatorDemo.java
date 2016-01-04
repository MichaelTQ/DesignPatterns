package com.patterns.behavioral.mediator;

public class MediatorDemo {
	public static void main(String[] args) {
		Mediator m = new Mediator();
		new Producer( m ).start();
		new Producer( m ).start();
		new Producer( m ).start();
		new Consumer( m ).start();
		new Consumer( m ).start();
		new Consumer( m ).start();
	}
}
