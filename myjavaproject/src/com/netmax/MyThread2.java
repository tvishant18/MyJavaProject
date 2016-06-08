package com.netmax;

class Yahhoo2 implements Runnable {

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

public class MyThread2 {

	public static void main(String[] args) {
		Thread myObject1 = new Thread(new Yahhoo2());
		myObject1.setName("Thread-A");
		myObject1.start();

		Thread myObject2 = new Thread(new Yahhoo2());
		myObject2.setName("Thread-B");
		myObject2.start();
	}
}
