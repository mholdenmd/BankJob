package Bankdemo;



public class BankAccount {
//	● The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.
	public String accountNum;
	public double checkingBalance = 0;
	public double savingsBalance = 0;
	public String accountOwner;
	public static Integer numAccounts = 0;
	public static double amountOfMoney = 0;
	
	
	
	public BankAccount(String nameOfOwner) {
		this.accountOwner= nameOfOwner;
		numAccounts++;
		this.accountNum = String.valueOf(generateAccountNum());
	}
	private int generateAccountNum() {
		int x = 1 + (int) (Math.random() * 1000000);
		return x;
	}
	public void displayAccountInfo() {
		System.out.println(String.format("Account Owner: %s. Checking Balance: %s. Account Number: %s.", this.accountOwner, this.checkingBalance, this.accountNum));
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public double depositCheckingAccount(int amount) {
		
		checkingBalance += amount;
		amountOfMoney += amount;
		return checkingBalance;
	}
	public double getSavingsBalance(int amount) {
		if (savingsBalance <= 0) {
			System.out.println("No money Chump, Get out of here");
		}
		else {
			savingsBalance -= amount;
			amountOfMoney -= amount;
		}
		return savingsBalance;
		
	}
	
	
	
	
	
//	● Create a class member (static) that has the number of accounts created thus far.
//
//	● Create a class member (static) that tracks the total amount of money stored in every account created.
//
//	● Create a private method that returns a random ten digit account number.
//
//	● In the constructor, call the private method from above so that each user has a random ten digit account.
//
//	● In the constructor, be sure to increment the account count.
//
//	● Create a getter method for the user's checking account balance.
}
