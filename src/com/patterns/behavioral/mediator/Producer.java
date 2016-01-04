package com.patterns.behavioral.mediator;

public class Producer extends Thread {
	private Mediator med;
	private int id;
	private static int num = 1;
	public Producer(Mediator m) {
		this.med = m;
		id = num++;
	}
	public void run() {
		int num;
		while(true) {
			med.storeMesage( num = (int)(Math.random()*100));
			System.out.print( "p" + id + "-" + num + " ");
		}
	}
}
