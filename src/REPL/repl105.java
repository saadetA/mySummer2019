package REPL;

import java.util.Arrays;
import java.util.Scanner;

public class repl105 {

public static void main(String[] args) {
	
	/*
	Given a String array words, iterate 
	through each word and print first and last 
	letter of each element in the format below.

	Example:

	words → ["hello", "why", "by", "apple" , "note"]
	print → [ho, wy, by, ae, ne] 
*/
	Scanner input = new Scanner(System.in);
    String yeni="";
	String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
   for(String each:words) {

	    yeni+=each.substring(0,1)+each.substring(each.length()-1)+" ";
   }
String[]arry=yeni.split(" ");
System.out.println(Arrays.toString(arry));
	




}
}
