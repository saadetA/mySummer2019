package Assignments;

import java.util.Scanner;

public class middleCharacter {
public static void main(String[] args) {
	/*Write a Java method to display the middle character of a string. Go to the editor
	a) If the length of the string is even there will be two middle characters.
	b) If the length of the string is odd there will be one middle character.


	Input:
	Input a string: elephant 
	Output:
The middle character in the string: ph	
*/
Scanner scan =new Scanner(System.in);
String a =""; 
System.out.println("enter your name");
a=scan.nextLine();
int b=a.length();
System.out.println(b);
char midof=a.charAt(b/2);
System.out.println(midof);
char midof2=a.charAt(b);

}
}
