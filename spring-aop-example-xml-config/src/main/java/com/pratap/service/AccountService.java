package com.pratap.service;

public interface AccountService {
	public double deposit(int accid, double balance);

	public double withdraw(int accid, double balance);

	public void transfer(int srcaccid, int destaccid, double balance);
}
