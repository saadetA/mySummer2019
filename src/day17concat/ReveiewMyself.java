package day17concat;
import java.util.Scanner;
public class ReveiewMyself {
public static void main(String[] args) {
	 /*
    Task01:
     1. Declare Scanner class' object
     2. ask user to enter first and last name. 
     3. declear a string variable called full name
     4. concat firts and lastname and assign it to fullname
     5. Display in the console total numbers of characters in full name
     */
Scanner scan=new Scanner(System.in);                      
System.out.println("enter your first name and your last name ");

 
String firstname=scan.nextLine();
String lastname=scan.nextLine();



String fullName=firstname.concat(""+lastname);
System.out.println("enter full name ");
String fullName1=scan.nextLine();
System.out.println(fullName);


/*
Methods:
	1. concat, 2. Length, 3. charAt, 4. toUpperCase,
	5. toLowerCase		

*/
String a="caybertek";
a.concat("school");
System.out.println(a);
a=a.concat("  school");
System.out.println(a);
//String name=a.substring.(0,1),.toUpperCase(0)+.concat" "+b.substring(0,1),toUperCase;


}
}
