package day22While;
import java.util.Scanner;
public class reverse {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);	     
	        String word = scan.nextLine();
	        scan.nextInt();
	        /*
Instructions from your teacher:
Write a program that will reverse a string\n
. Your program should reverse a string only 5 characters long. \n
If word is shorter, display message: "Too short!".\n
 If word is longer, display message: "Too long!".\n
  Otherwise, reverse this word and print out result into the console. 
*/

	   int a=word.length();
	    
		word = a<5?"Too short!":a<5?"Too long!":"reverse"; 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    }
}
