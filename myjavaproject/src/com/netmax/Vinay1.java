package com.netmax;

class Employee {
	int age;

	public Employee(int age) {
		this.age = age;
	}

	public boolean isEligibleToWork() throws Exception {
		if (age > 18) {
			return true;
		} else {
			throw new Exception("Age is Small to Work");
		}

	}
}

public class Vinay1 {

	public static void main(String[] args) {
		Employee emp = new Employee(21);
		try {
			if (emp.isEligibleToWork()) {
				System.out.println("Candidate is Eligible to Work");
			}
		} catch (Exception ex) {
			System.out.println(ex);
		
	}

}
}
