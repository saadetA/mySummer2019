package canvasInterview;

import java.util.Arrays;

public class homework {
public static void main(String[] args) {
	/*Write a return method that check if a string is
	 *  build out of the same letters as another string.

	Ex:  same("abc",  "cab"); -> true 

	same("abc",  "abb"); -> false:

	
	String first="abc";
	String second="bca";

String same="";
char[] ch1=first.toCharArray();//abc just we can write char Array directly
System.out.println(ch1);//abc

char[]ch2=second.toCharArray();
System.out.println(ch2);//bca	

Arrays.parallelSort(ch1);//abc
System.out.println(ch1);	

Arrays.parallelSort(ch2);//abc
System.out.println(ch2);	

*/
boolean same=isSameLetters("abc","bca");
System.out.println("Is our two strings same? "+same);
}
public static boolean isSameLetters(String first,String second) {
	boolean same=false;
char[] ch1=first.toCharArray();//abc step1
System.out.println(ch1);

char[]ch2=second.toCharArray();//bca
	Arrays.parallelSort(ch1);//abc  //step2
	Arrays.parallelSort(ch2);//abc
	
//need to check is the letter same or not	//step3
	//char to string
String a="";	//step4
String b=""	;
	
for(char each:ch1) {//step5
	a+=each;
}
for(char each:ch2) {
	b+=each;
}
same=a.equals(b)?true:false;//step6

return same;

}








}
