package day44AccessModifers;

public class BankOfAmerica {
	public static void main(String[] args) {
		BankAccount saadet = new BankAccount();
		saadet.setAccountHolder("saadet demirtas");
		saadet.setAccountNumber(1233455666);
		saadet.setdeposit(122356788);
		saadet.setdeposit(30000);

		System.out.println("Name: " + saadet.getAccountHolder());
		System.out.println("AccountNumber: " + saadet.AccountNumber());
		saadet.withdraw(2000);
		saadet.ShowBalance();

		BankAccount ibrahim = new BankAccount();

	}

}
