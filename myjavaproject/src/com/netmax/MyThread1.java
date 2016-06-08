package com.netmax;

class Yahhoo1 extends Thread {

	public Yahhoo1(String value) {
		super(value);
	}

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread() + " :: " + i);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class MyThread1 {

	public static void main(String[] args) {
		Yahhoo1 myObject1 = new Yahhoo1("Thread-A");
		myObject1.start();

		Yahhoo1 myObject2 = new Yahhoo1("Thread-B");
		myObject2.start();
	}
}
