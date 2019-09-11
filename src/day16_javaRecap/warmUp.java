package day16_javaRecap;
import java .util.Scanner;
public class warmUp {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter your first name and last name");//upper case	
String firstname=scan.nextLine(),	
	lastname =scan.nextLine();
	
String fullname=firstname+" "+lastname;	
fullname=	   fullname.toUpperCase();
System.out.println("your fullname is :"+ fullname);	

}
}
