package nurullahConstractor;

public class Account {
//instance variables or fields
	private int number;
	private double balance;
	private String customerName;
	private String emailAdress;
	private String phoneNumber;


	public Account() {
		
	}
	
	
	
	
	public Account(int volue1,double volue2,String name,String email,String phone) {
System.out.println(("constractor"));	
	this.number=volue1;
this.balance=volue2;
this.customerName=name;
this.emailAdress=email;
this.phoneNumber=phone;
}	
	
	
//public Account(int volue1,double volue2,String name,String email,String phone) {
	
//}
	
	
	
	
	
	
	
	//iki action methd	
	public void depositMoney(double amount) {
		this.balance = this.balance + amount;
//or this.balance+=amount;
		System.out.println();
	}

	/*
	 * getter setter yazmadan public void initiliazedNumber(int number) {
	 * this.number=number; } java bunun yerine setter oneriyor
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/*
	 * public int whatisMyAccuntNumber(){ return this.number; }
	 * 
	 */
	public int getNumber() {
		return this.number;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

//private diyince ifle limit koyabiliyoruz
	public void setPhoneNumber(String phoneNumber) {
		/*
		 * 333 3333 555 if(phoneNumber.length()>10||phoneNumber.length()<10){
		 * syso("wrong number try again")}
		 * 
		 */
		this.phoneNumber = phoneNumber;
	}
//private ulasmak isteyn settera ulasmasi lazim ondaki
//if cond na uymasi gerekiyor

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

}
