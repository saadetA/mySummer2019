package REPL;

import java.util.Arrays;

public class replarrayscopycertainvolues {
public static void main(String[] args) {
	System.out.println("-----EXAMPLE RUN ---------");
    String[] numbers = {"zero", "one", "two","three","four"};
    System.out.println(Arrays.toString(getWithE(numbers)));
    

}
 public static String[] getWithE(String[] arr) {
    
    //TODO : YOUR CODE GOES HERE ----------------------
    String []fewVolues=new String[5];
    for ( String each:arr) {
		if(each.contentEquals('e')) {
		fewVolues+=each;	
		}
	}
    
    
    //YOUR CODE ENDS HERE -----------------------
    
    return fewValues;
  }



}
