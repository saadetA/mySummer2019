package REPL;

import java.util.Arrays;
import java.util.Scanner;

public class repl_102 {
public static void main(String[] args) {

	/*	
Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java


Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
  
*/
	Scanner input = new Scanner(System.in);
    String str = input.nextLine();
  //	String str = "java  is  fun";
String[] a=str.split(" ");
for (int i = a.length-1; i <0; i--) {
	
}
	



}
}
