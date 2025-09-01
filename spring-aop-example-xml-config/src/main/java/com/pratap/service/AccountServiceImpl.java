package com.pratap.service;

public class AccountServiceImpl implements AccountService {

	public double deposit(int accid, double balance) {
		//----loging logic
		System.out.println("deposit() of AccountServiceImpl");
		// logging logic
		return 1000.0;
	}

	public double withdraw(int accid, double balance) {
		//----loging logic
		System.out.println("withdraw() of AccountServiceImpl");
		return 5000.0;
	}

	public void transfer(int srcaccid, int destaccid, double balance) {
		//----loging logic
		System.out.println("transfer() of AccountServiceImpl");
		// throw new RuntimeException();
	}
}
