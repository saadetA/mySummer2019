package canvasInterview;

import java.util.Arrays;

public class SameLetter {
	/*Write a return method that check if a string is build out of the same letters as another string.

			Ex:  same("abc",  "cab"); -> true 

			same("abc",  "abc"); -> false:
*/
			 
public static boolean sameletter(String a,String b) {
boolean result=true;	
char[] ch=a.toCharArray();
char[]ch1=b.toCharArray();
Arrays.parallelSort(ch);
Arrays.parallelSort(ch1);
String a1="";
String b1="";

for(char each:ch) {
	a1+=each;
}

for(char each:ch1) {
	b1+=each;
}
result=a1.equals(b1)?true:false;


return result;
}


public static void main(String[] args) {
boolean result=	sameletter("bca","acb");

System.out.println(result);
}







}
