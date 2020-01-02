package REPL;

import java.util.Arrays;

import day_30_Wrapper_ArraysList.ArrayslistClass;

public class repl195 {
	/*Method addElements accepts 2 int arrays and adds
	each element value of two arrays and returns a 
	new array. You can assume that each array has 5 
	elements
*/
//bitmedi
	 public static boolean isAnagram(String word1, String word2) {
		char[]newword1=word1.replaceAll(" ","").toCharArray();   
	  char[]newword2=word2.replaceAll(" ", "").toCharArray();
   Arrays.sort(newword1);
	Arrays.sort(newword2);	 
		 return  Arrays.equals(newword1,newword2);	
	 }


public static void main(String[] args) {
System.out.println(isAnagram("listen", "Silent"));		
}





}