package com.netmax;
abstract class Account {
	private int irr = 4;

	public int getIrr() {
		return irr;
	}

	public abstract String getAccountType();
}

class SavingAccount extends Account {
	public String getAccountType() {
		return "Savings Account";
	}
}

class CurrentAccount extends Account {
	public String getAccountType() {
		return "Current Account";
	}
	public int getIrr() {
		return 5;
	}
}

public class Lenovo {

	public static void main(String[] args) {
		Account myAccount = new SavingAccount();
		System.out.println("Account Type :" + myAccount.getAccountType());
		System.out.println("IRR          :" + myAccount.getIrr());
		
		myAccount = new CurrentAccount();
		System.out.println("Account Type :" + myAccount.getAccountType());
		System.out.println("IRR          :" + myAccount.getIrr());
	}

}
