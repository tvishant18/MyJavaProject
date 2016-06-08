package com.netmax;

class Yahhoo extends Thread {

	public Yahhoo(String value) {
		super(value);
	}

	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Yahhoo :: Good Morning");
	}

}

public class MyThread {

	public static void main(String[] args) {
		System.out.println("MyThread :: Good Morning >> 1");
		
		Yahhoo myObject = new Yahhoo("MyThread");
		myObject.start();
		
		System.out.println("MyThread :: Good Morning >> 2");
	}
}
