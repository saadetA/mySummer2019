package day15_screen_stringClass;
import java.util.Scanner;
public class StringInput {
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
       
   
   
   



}






}
