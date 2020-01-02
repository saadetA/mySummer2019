package Asiya_office;

import java.util.Arrays;

public class SameLetters {
	public static void main(String[] args) {
		boolean same=   isSame("abc","bca");    
		System.out.println("Our two Strings are same? "+same);
		}
		//abc //bca
		public static boolean isSame(String first,String second) {
		boolean same=false; 
		char[] ch1=first.toCharArray();//step1//abc
		char[]ch2=second.toCharArray();//step2//bca
		//step2
		Arrays.parallelSort(ch1);//abc
		Arrays.parallelSort(ch2);//abc
		//step3
		String a="";
		String b="";
		//step4
		for(char each:ch1) {//Strings=setof chars
		    a+=each;
		}
		for(char each:ch2) {
		    b+=each;
		}
		//same=a.equals(b)?true:false;
		//step5
		return same=a.equals(b)?true:false;
		}
}
