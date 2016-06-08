package com.netmax;
interface HDFC_Account {

	public int getIrr();

	public String getAccountType();
}

class HDFC_SavingAccount implements HDFC_Account {

	public int getIrr() {
		return 5;
	}

	public String getAccountType() {
		return "Savings Account";
	}
}

class HDFC_CurrentAccount implements HDFC_Account {

	public int getIrr() {
		return 6;
	}

	public String getAccountType() {
		return "Current Account";
	}
}


public class Dell {

	public static void main(String[] args) {
		HDFC_SavingAccount myAccount = new HDFC_SavingAccount();
		System.out.println("Account Type :" + myAccount.getAccountType());
		System.out.println("IRR          :" + myAccount.getIrr());

	}

}
	
		