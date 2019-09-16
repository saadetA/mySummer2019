package Assignments;

import java.util.Scanner;

public class CheckWords {
	/*Write a program CheckWords:

	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
*/
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
String day1="";String day2="";String day3="";
System.out.println("enter day1");
int a=day1.length();
day1=scan.nextLine();
System.out.println("enter day2");
int b=day2.length();
day2=scan.nextLine();
System.out.println("enter day3");
int c=day3.length();
day3=scan.nextLine();
if(a==b&&b==c) {
System.out.println("All words are same lengths");	

}
else{
System.out.println("All different length");

}
	
}	
	
}	
	
	
	
	
	