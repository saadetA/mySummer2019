package REPL;


import java.util.*;

public class repl_115 {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String[] words = new String[5];
	for(int i = 0; i < 5;  i++) {
	  
	  words[i] = input.nextLine();
	  
	} 
	String longest="";
	for(int i =0;i<words.length; i++) {
		if(longest.length()< words[i].length() ) {
		 longest = words[i];
		}
	}
	
	System.out.println(longest);
	



}


}
