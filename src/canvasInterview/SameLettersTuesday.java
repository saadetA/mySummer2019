package canvasInterview;

import java.util.Arrays;

public class SameLettersTuesday {
/*
Write a return method that check if a string 
is build out of the same letters as another string.

Ex:  same("abc",  "cab"); -> true 

same("abc",  "abb"); -> false:



*/
public static boolean isSame(String first,String second) {
boolean same=false;	//abc //bca
char []ch1=first.toCharArray();//abc
char[]ch2=second.toCharArray();//cab
Arrays.parallelSort(ch1);//abc
Arrays.parallelSort(ch2);//abc
String a="";
String b="";
for(char each:ch1) {
	a+=each;
}
for(char each:ch2) {
	b+=each;
}
same=a.equals(b)?true:false;



return same;
}

public static void main(String[] args) {
	
boolean same=isSame("abc","bba");
System.out.println(same);
}












}
