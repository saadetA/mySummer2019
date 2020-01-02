package REPL;

import java.util.*;

public class Repl_195 {

public static void main(String[] args) {
	 
    ArrayList<String>  arr = new ArrayList<String>();
    arr.add("2");
    arr.add("6");
    arr.add("foo bar");
    arr.add("abc");
    
  
    String find_tst = search(arr,"foo");
    System.out.print(find_tst);//foo bar
   	
	
	
	
	isAnagram("listen","Silent"); 	
System.out.println(isAnagram("listen","Silent"));

}





public static boolean isAnagram(String word1,String word2) {
word1=word1.replaceAll(" ", "");	
word2=word2.replaceAll(" ","");
String[]Word1=word1.toLowerCase().split("");
String[]Word2=word2.toLowerCase().split("");
Arrays.sort(Word1);
Arrays.sort(Word2);
boolean result=true;
for (int i = 0; i < Word1.length; i++) {
	if(Word1[i].equals(Word2[i])) {
		result=true;
	}else {
	result =false;	
	}

}
return result;

}


public static String search(ArrayList<String> r, String find) 
{
 String find_test=""; 
 
 
 
 return find_tst;
}








}
