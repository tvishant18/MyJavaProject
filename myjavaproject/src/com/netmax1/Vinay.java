package com.netmax1;

class Share {
	public synchronized void getData(String threadName) {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadName + " :: " + i);
		}
	}
}

class MyThread extends Thread {
	private Share share;

	public MyThread(Share shareObj, String pThreadName) {
		super(pThreadName);
		this.share = shareObj;
	}

	public void run() {
		share.getData(Thread.currentThread().getName());
	}
}

public class Vinay {

	public static void main(String[] args) {
		Share shareObject = new Share();
		MyThread obj1 = new MyThread(shareObject, "Thread-A");
		obj1.start();

		MyThread obj2 = new MyThread(shareObject, "Thread-B");
		obj2.start();
	}
}
