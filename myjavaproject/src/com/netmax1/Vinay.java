package com.netmax1;

class Share {
	public void getData(String threadName) {
		synchronized (this) {
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
}

class MyThread extends Thread {
	private Share share;

	public MyThread(Share shareobject, String pThreadName) {
		super(pThreadName);
		this.share = shareobject;
	}

	public void run() {
		share.getData(Thread.currentThread().getName());
	}
}

public class Vinay {

	public static void main(String[] args) {
		Share shareobject = new Share();
		MyThread obj1 = new MyThread(shareobject, "Thread-A");
		obj1.start();

		MyThread obj2 = new MyThread(shareobject, "Thread-B");
		obj2.start();
	}
}
