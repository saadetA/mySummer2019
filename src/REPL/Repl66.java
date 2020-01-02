package REPL;
import java.util.*;
public class Repl66 {
	 public static String mergeStrings(String one, String two) {
		    
		    String result ="";
		    
		    if(one.length()>two.length()){
		       
		       for (int i=0; i<two.length(); i++){
		      
		     result += one.charAt(i) + "" + two.charAt(i);
		    
		     }
		       
		      result = result + one.substring(two.length(), one.length());
		     }
		    
		    else if(one.length()<two.length()){
		       
		       for (int i=0; i<one.length(); i++){
		      
		     result += one.charAt(i) + "" + two.charAt(i);
		    
		     }
		       
		      result = result + two.substring(one.length(), two.length());
		     }          
		    
		    
		    else{
		      
		      for (int i=0; i<one.length(); i++){
		      
		     result += one.charAt(i) + "" + two.charAt(i);
		    }
		    
		     }
		     
		    return result;
		    
		  }







}
