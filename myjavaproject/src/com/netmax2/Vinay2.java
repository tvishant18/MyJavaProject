package com.netmax2;

class AA {
	private int a = 10;
	private final int b = 20;

	public void setData() {
		a = 20;
		//b = 40;
	}

	public void getData() {
		System.out.println("values :: " + a + " :: " + b);
	}
}

public class Vinay2 {

	public static void main(String[] args) {
		AA obj = new AA();
		obj.setData();
		obj.getData();
	}

}
