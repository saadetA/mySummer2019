package canvasInterview;

import java.util.Arrays;

public class homewrk2 {
	/*Write a return method that check if a string is build out of the same letters as another string.

	Ex:  same("abc",  "cab"); -> true 

	same("abc",  "abc"); -> false:
*/
public static void main(String[] args) {
boolean same=isSame("abc","cba");
System.out.println("Is our two Strings are same? "+same);

}

public static boolean isSame(String first,String second) {
boolean same=false;	//abc //bca
char[]ch1=first.toCharArray();//abc step1 convrt to charArray
char[]ch2=second.toCharArray();//cba
//step2 //sortArray
Arrays.parallelSort(ch1);//abc
Arrays.parallelSort(ch2);//abc
//step3
String a="";//abc
String b="";
//step4 
for(char each:ch1) {
	a+=each;
}
for(char each:ch2)
b+=each;
//step5
//same=a.equals(b)?true:false;


return same=a.equals(b)?true:false;
}












}
