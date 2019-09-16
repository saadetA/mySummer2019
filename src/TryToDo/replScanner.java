package TryToDo;
import java.util.Scanner;
public class replScanner {
public static void main(String[] args) {
	
	Scanner scan=new Scanner (System.in);


/*Ask user to enter two words. If the first word has even number of characters, print the first half of the first word, print the second word and print the second half of the first word.

Input:

banana

apple

Output:

banappleana
*/	  
String b="banana";
String a="apple";
int num =b.length() ;         
System.out.println(num);
int num1=a.length();
System.out.println(num1);
String s=b.substring(0,3);
System.out.println(s);
System.out.println("apple");
String c=b.substring(3,6);
System.out.println(c);


}













}

