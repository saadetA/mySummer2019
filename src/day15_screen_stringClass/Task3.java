package day15_screen_stringClass;
import java.util.Scanner;
public class Task3 {
public static void main(String[] args) {
	
	 
    /*
     next() vs nextLine();  ==> returns String value
                nextLine: takes the entire inputs
                next: takes the first word
     */
    
        
        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter your first name");
            String firstname = scan.next();
            
        System.out.println("Enter your last name");
        String lastname = scan.next();
        
        System.out.println("first name is: "+firstname);
        System.out.println("last name is: "+lastname);

        /*
        Write a program that asks user to enter first name 
        and then last name.  At the end system should display user’ 
        full name.
     */
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your first name: ");
        String firstName = input.next();
        
    System.out.println("Enter your LastName: ");
    String lastName = input.next();
    
    String fullname =lastName+" "+firstName;
    
 System.out.println("Your full name is: "+fullname);
    
    
    
    input.close(); // gets rid of warning of the scanner class
    



}
	
	
	
	
}
