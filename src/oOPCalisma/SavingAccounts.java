package oOPCalisma;

public class SavingAccounts extends Account{
public static void main(String[] args) {
	Account person1=new Account();
Account person2=new Account("saadet");
SavingAccounts person3=new SavingAccounts("Akgobek",40);
	
	person1.name="ayse";
person1.setLastName("Demirtas");
//System.out.println("our new person "+person1.name+""+
person1.getLastName();

}





public SavingAccounts() {
	super();
}


public SavingAccounts(String lastname,int Age) {
	super("saadet");
//this.setLastName("akgobek");
//this.Age=Age;
Age=40;
System.out.println("ikinci constr"+name+""+lastname+" "+Age);
}


}
