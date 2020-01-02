package REPL;

import java.util.Arrays;

public class repl103 {
public static void main(String[] args) {
	
	/*Given a String variable sentence, 
	 * write code to get each word and assign to
	 *  String reversed in reverse order. 

	Example:
	sentence -> "Java is fun"
	reversed -> "fun is Java"
*/
String reversed="";
	String sentence="java is fun";
	String[]arry=sentence.split(" ");
for (int i = arry.length-1; i>=0; i--) {
	reversed+=arry[i]+" ";
}
	reversed=reversed.trim();
System.out.println(reversed);

}




}

