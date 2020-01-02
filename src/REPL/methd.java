package REPL;

import java.util.Scanner;

public class methd {
	  public static void main(String[] args) {
	        
	        
	        
	        /*isError method checks if the line of string it gets has the word error at the start of it.
	        it gets a string and returns a boolean.
	        true if it found the word 'error' an the start of the line string*/
	        
	        Scanner input=new Scanner(System.in);
	        
	        String str=input.nextLine();
	        
	        
	        System.out.println(isError(str));
	        
	    
	        
	    }
	    public static boolean isError(String s) {
	        
	        
	        //1.yol return s.toLowerCase().startsWith("error");
	    
	    	  String str=s.substring(0,5);
	          
	          if (str.equalsIgnoreCase("error")) 
	              return true;
	          
	          
	              return false;
	      }
	    
	    
	    }

