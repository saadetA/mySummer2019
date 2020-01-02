package REPL;

import java.util.Arrays;
import java.util.Scanner;

public class repl106 {

public static void main(String[] args) {
/*	
Given a String variable sentence, write 
code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun
*/

	  Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	  
	    
	   // version1
	    String[]arry=sentence.split(" ");  
for(String each:arry) {
System.out.println(each);
}
//version2
for (int i = 0; i < arry.length; i++) {
	System.out.println(arry[i]);
}




}






}
