package day44AccessModifers;

public class BankAccount {

//atrr
	/*
	 * WarmUp: creata a custom class for bankaccount The attributes/data that the
	 * class can have are: AccountHolder, AccountName, AvailableBalance Actions the
	 * class can do are: deposit, withdraw, checking balance requiremnets: 1. apply
	 * encapsulations// 2. user should be able to deposit, withdraw and check the
	 * balance 2.1 if the withdrawing amount is greater than available balance, 35$
	 * penalty fee will be charger from the account 2.2 if the available balance is
	 * less or equal to 0, account holder won't be able to withdraw money
	 * 
	 * 
	 * 
	 * 
	 */
	private String AccountHolder;
	private long AccountNumber;
	private double AvaliableBAlance;
	private long deposit;
	private long withdraw;
	private long checkingBalance;

//setter (modifyer):instance void method(statice gerekyok)
//passes parameter acces parameter data type must mismatch
//accses modifr needs to be public
	public void setAccountHolder(String AccountHolder) {
		this.AccountHolder = AccountHolder;
	}

	public String getAccountHolder() {
		return AccountHolder;
	}

//public void setAvaliableBalance(double AvaliableBAlance) {
	// this.AvaliableBAlance=AvaliableBAlance;
//}action oldugu icin set metodu create etmemize gerekyok
	public void setAccountNumber(long AccountNumber) {
		this.AccountNumber = AccountNumber;
	}

	public long AccountNumber() {
		return AccountNumber;
	}

	public void setdeposit(long deposit) {
		this.deposit = deposit;
	}

	public long getdeposit() {
		return deposit;
	}
//actions
//deposit2. user should be able to deposit, withdraw and check the balance

	public void deposit(double amount) {
		AvaliableBAlance += amount;
	}

//withdraw
//2.1 if the withdrawing amount is greater than available balance, 35$ penalty fee will be charger from the account
	public void withdraw(double amount) {
//we needprecondition	
		if (AvaliableBAlance <= 0) {
			System.out.println("your account balance equal or less than 0");
			return;// cikis returnu eger para yoksa geri kalani calismayacak returnle metoddan
					// cikacak
		}

		if (amount > AvaliableBAlance) {
			AvaliableBAlance -= amount;
			AvaliableBAlance -= 35;
		}
	}
//checking the balance
//2.2 if the available balance is less or equal to 0, account holder won't 
//be able to withdraw money

	public void ShowBalance() {
		System.out.println("your AvaliableBalance is  :" + AvaliableBAlance);
	}

}
