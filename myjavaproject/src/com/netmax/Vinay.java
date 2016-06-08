package com.netmax;

public class Vinay {

	public static void main(String[] args) {
int number=100;
		try {
		 number =100/2;
		} catch (Exception exc) {
			System.out.println("Exception :: " + exc);
		}
		finally{
			System.out.println("Hurraahh !! ");
		}
	
		System.out.println("Result :: " + number);


	}

}
