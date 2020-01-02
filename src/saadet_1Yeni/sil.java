package saadet_1Yeni;


import java.util.Scanner;

public class sil {
	public static void main(String[] args) {//
		/*Write a Java method to display the middle character of a string. Go to the editor
a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.


		Input:
		Input a string: elephant 
		Output:

		The middle character in the string: ph	 
*/
Scanner scan=new Scanner(System.in);
		System.out.println("enter word");
String word=scan.nextLine();
int lent=word.length();
int m=lent/2;
String middle="";
if(lent%2==0) {
middle=word.substring(m-1,m+1);
	System.out.println(middle);	
}	
else {	
System.out.println("no");	
}	
	int lent1=word.length();
	int mid1=lent1/2;
	String middle1=word.substring(mid1-1,mid1+1);
	
	if(lent1%2!=0&&lent1>=5) {
	System.out.println(middle1);
	}else {
	System.out.println("invalid");	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
