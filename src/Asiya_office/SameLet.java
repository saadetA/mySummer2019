package Asiya_office;

import java.util.Arrays;

public class SameLet {
	/*Write a return method that check if a string is 
	 * build out of the same letters as another string.

			Ex:  same("abc",  "cab"); -> true 

			same("abc",  "abb"); -> false:
*/
			 
//return methd
//two string
//compare them
           //String
public static boolean isSame(String first,String second) {
boolean same=true;	

//abc //bca
char []ch1=first.toCharArray();
char[]ch2=second.toCharArray();
Arrays.parallelSort(ch1);//abc
Arrays.parallelSort(ch2);//abc
String a="";
String b="";
for(char each:ch1) {
	a+=each;//abc
}
for(char each:ch2) {
	b+=each;
}
//same=a.equals(b)?true:false;



return same=a.equals(b)?true:false;
}


public static void main(String[] args) {
boolean same=isSame("abc","cba");

System.out.println(same);
}













}











