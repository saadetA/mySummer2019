package REPL;

import java.util.*;

public class Repl108 {
public static void main(String[] args) {
	

/*
Given a String variable email, write code using split method to 
print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:  
Email id: info
Email domain: cybertekschool.com




*/
	Scanner input = new Scanner(System.in);
   
	String email = input.nextLine();
    
	//info@cybertekschool.com

	
	
//	String emailid=email.substring(0,email.indexOf("@"));
//System.out.println("Email id: "+emailid);
//String domain=email.substring(email.indexOf("@",email.indexOf(email.length()-1)));
//System.out.println("Email domain: "+domain);

String[]arr=email.split("@");
if(!email.contains("@")||arr.length>2) {
System.out.println("invalid email");
}else {

System.out.println("Email id: "+arr[0]);
System.out.println("Email domain: "+arr[1]);

}







}
}
