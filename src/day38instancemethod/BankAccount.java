package day38instancemethod;

public class BankAccount {

//public static void main(String[] args) {mainyok
	/*WarmUp:
	    create a custom class for BankAccount
	    attributes/data that can have are: 
	                    1. AccountHolder, 2. AccountNumber, 3. Balance
	        Actions: deposit, withdraw, showBalance
	        requiremnts: 
	            1. user should be able to deposit money into their account
	            2. user should be able to withdraw money from their account
	                    2.1 if the withdrawing account is greater than available balance, 35$ charge will be added
	                    2.2 if the balance is less than 0, user should not be able to withdraw money
	            3. user should be able to see their balance	
*/
	
	
	
	//1-instance veriables verdik :declare in class but outof the methods
	String AccountHolder;
    long AccountNumber;
    double Balance;
//
   // 2-instance methoddoes not have static(specifer);they belong to object theyare object methods
public BankAccount() {
	
}
   
    
    //instance veriablri methoddta kullanamadigimiz icin this.le cagirip local veriabla cevirebiilriz
    public BankAccount(String AccountHolder,long AccountNumber) {
	this.AccountHolder=AccountHolder;
    this.AccountHolder=AccountHolder;
   } 
    
    
    public void showBalance(){
String acct=""+AccountNumber;
String AccountNumber=("************"+acct.substring(12));//16	
	
	System.out.println("AccountHolder"+AccountHolder);	
System.out.println("Account Number:"+AccountNumber);
System.out.println("Avaliable Balance:$"+Balance);
System.out.println("..............................................");

}






public void Deposit(double amount) {
System.out.println("-----------------------------------------------");	
String acct = ""+AccountNumber;
String AccountNumber = "************"+acct.substring(12);
System.out.println("Depositing $"+amount +" to the account "+AccountNumber);
Balance += amount; 
System.out.println("----------------------------------------");
	
}
//public static String hesap()//return type
public void WithDraw(double amount) {
	if(Balance<0) {
	System.out.println("there is no avaliable balance");	
	return;//burdaki return sistemden cik devam etme demek normalde void return etmez bi exist icin
	}
	String acct = ""+AccountNumber;
	String AccountNumber = "************"+acct.substring(12);	
	System.out.println("Withdrawing $"+amount +" to the account "+AccountNumber);
Balance-=amount;
if(Balance<0) {
Balance-=35;	
}
System.out.println("NEw Balance:$"+Balance);
System.out.println("-----------------------------------------------");
}

public void accountSetup(String name,long acctNum) {
AccountHolder=name;	
AccountNumber=acctNum;
}
























}
