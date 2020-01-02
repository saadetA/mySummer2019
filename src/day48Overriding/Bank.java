package day48Overriding;

public class Bank {//sub


public void InterestRate() {
    System.out.println("9 percent");
}

public static void main(String[] args) {
    BankOfAmerica BOA = new BankOfAmerica();
                BOA.InterestRate();   //9
    
    Chase Chase = new Chase();
                Chase.InterestRate();  //9
                
    CapitalOne CO = new CapitalOne();
                CO.InterestRate();  //9
                
            
    
}

}
class BankOfAmerica extends Bank{
public void InterestRate() {
	System.out.println("5%");
}
}
class Chase extends Bank {
	public void InterestRate() {
		System.out.println("6%");
	}
}
class CapitalOne extends Bank {//suprclasstakini  sub a cagir degistir kisaca
	@Override//bu methodun override yapildigini onayliyor
	public void InterestRate() {
		System.out.println("4%");
	}
}










