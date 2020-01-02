package day38instancemethod;

public class BankAcountObject {

public static void main(String[] args) {
	BankAccount account1=new BankAccount();
account1.AccountHolder="saadet demirtas";
account1.AccountNumber=1223345566677234l;//long koymazsak int kabuleder
account1.showBalance();
account1.Deposit(2000);
account1.WithDraw(4000);

account1.WithDraw(3000);
account1.WithDraw(3001);
account1.WithDraw(2000);


BankAccount account2=new BankAccount();

account2.accountSetup("safa akgobek",5859786089000l);
account2.showBalance();
account2.Deposit(1000000);
account2.WithDraw(50000);


/*BankAccount account3 = new BankAccount("Nadire PILOTT", 4004606050503L);
account3.ShowBalance();

account3.Deposit(10);
account3.Withdraw(20);  //-45

account3.Withdraw(200);
account3.Deposit(3000);	
*/
}

}


