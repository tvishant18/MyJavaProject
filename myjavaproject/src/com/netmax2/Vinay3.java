package com.netmax2;

class Z {
	public void getData1() {
		System.out.println("Class Z >> getData1");
	}
}

final class Y extends Z {
	public void getData2() {
		System.out.println("Class Y >> getData2");
	}
}

class X {
	public void getData3() {
		System.out.println("Class X >> getData3");
	}
}

public class Vinay3 {

	public static void main(String[] args) {
		Y obj = new Y();
		obj.getData1();
		obj.getData2();
		X obj1 = new X();
		obj1.getData3();

	}

}
