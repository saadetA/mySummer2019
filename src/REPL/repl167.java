package REPL;
import java.util.*;
public class repl167 {
/*
uniqueChars is a method that you will code now, 
should be able to accept any string in the world and return 
unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"
*/
	 public static void main(String[] args) {
	        String str = "spoon";
	        System.out.println(uniqueChars(str));
	    
	 	 }
	    
	 
	 
	 
	 public static String uniqueChars(String str){
	        String unique="";
	        for(int i=0; i<str.length(); i++){
	            if(!unique.contains(""+ str.charAt(i))){
	                // char + string = String
	                //String + char = String
	                unique+= ""+ str.charAt(i);
	            }
	        }
	        return unique;
	
		  






	 }


	}

















