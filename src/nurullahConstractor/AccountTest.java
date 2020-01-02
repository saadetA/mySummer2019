package nurullahConstractor;

public class AccountTest {
public static void main(String[] args) {
	

Account Account1= new Account(12345,234,"saadet","saadetgmail","377777");
//int volue1,double volue2,String name,String email,String phone) {

System.out.println("first constractor "+Account1.getCustomerName()+Account1.getEmailAdress());

Account secondAccount=new Account(555555,7777,"ayse","ayse.gmail","8990000");
System.out.println("ikinci constractor "+secondAccount.getCustomerName()+secondAccount.getEmailAdress());

//bir constractorin
}
}
