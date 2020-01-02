package day43java_recap;

public class Login {
public static void main(String[] args) {
	

Credentials obj=new Credentials();
obj.UserName="saadet";
obj.password="1234";
System.out.println(obj.UserName);
System.out.println(obj.password);

System.out.println(obj.getkullanici());
System.out.println(obj.getsifre());

System.out.println(obj.getID());
System.out.println(obj.getssn());
//getter read
//setter modify


}


}
