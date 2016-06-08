package com.netmax;

class Message {
	public static void getMessage() {
		System.out.println("Jagte Raho !!");
	}
}

public class Vinay3 {

	public static void main(String[] args) {
		Message obj = new Message();
		obj.getMessage();
		
		Message.getMessage();
	}
}
