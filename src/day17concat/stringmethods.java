package day17concat;
import java.util.Scanner;
public class stringmethods {
	//import java.util.*;   // imports all the classes from java.util
	
	    public static void main(String[] args) {
	        /*
	        Task01:
	         1. Declare Scanner class' object
	         2. ask user to enter first and last name. 
	         3. declear a string variable called full name
	         4. concat firts and lastname and assign it to fullname
	         5. Display in the console total numbers of characters in full name
	         */
//concat string icerir stringle birlesir ve yeni stringe doner	        
	       // String a= "Cybertek",b="school";
	    	//a=a.concat("school");
	    	//int num=a.length();sayarken length-1
	    	Scanner scan = new Scanner(System.in);
	        System.out.println("Enter your first and last names");
	        String firstName = scan.nextLine(); 
	        String lastName = scan.nextLine();
	        String fullName = firstName.concat(" "+lastName);
	        
	        String fullName2 = firstName+" "+lastName;
	        
	        String name ="Cybertek" + 12 + 'A' + 4.5;
	    //   String name2 ="Cybertek".concat(12);  
	         // in concat method you can only give String variable or String value
	        
	            int num = fullName.length();
	            
	        System.out.println(fullName2+" contains "+num+" characters");   
	        

/* 
concat(str): it takes String, and combines the two Strings
	and returns it as new String Value
	
*/	
	String a ="Cybertek";
		a.concat(" School"); //  "Cybertek School"
	System.out.println(a);
		a = a.concat(" School"); //  a= "Cybertek School"
//  a = "Cybertek School";		
	System.out.println(a);
	
	String A ="hello", B ="helloP";
	System.out.println(A==B); // false, different values
	
	String C ="Hello", D ="hello";
	System.out.println(C == D); // false , case sensitivity
	
	        
	        
	        
	        
	
	
	
	    }	
	
	    }	
	    	
	

