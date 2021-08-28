package BankdemoTest;
import Bankdemo.BankAccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("Marcus");
		BankAccount b2 = new BankAccount("Blake");
		BankAccount b3 = new BankAccount("Joe");
		
		System.out.println(b1.accountOwner);
		System.out.println(BankAccount.numAccounts);
		
		
		b1.depositCheckingAccount(5000);
		b1.displayAccountInfo();
		
	}

}
