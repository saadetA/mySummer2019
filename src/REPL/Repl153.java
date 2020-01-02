package REPL;
import java.util.*;
public class Repl153 {

/*
Complete a void method printUniqueWords() 
that will print only unique words from an array of 
strings. Every single unique word should be printed 
from the new line. 

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python		  
		  
		  
		  
		  
		  
*/		  
		  
		  
		  
		  
		  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    String[] words = new String[size];
		    for(int i=0; i < size; i++){
		      words[i] = scan.next();
		    }
String[]uniq[]=UniqueWords(Arrays.toString(words));
		  }
		  
		 
		    //WRITE YOUR CODE HERE
			  public static void UniqueWords(String[] words){
					for(int i=0;i<words.length;i++){	
						int count=0;
						 for(int j=0;j<words.length;j++){
						   if(words[i]==words[j]){
						     count++;
						   }if(count==1){
						   System.out.println((Arrays.toString(words))); 
						   }
						 }

				}

		 
		 
		  
		  
		  
		  
		  
		  
		  
		  }



//ikinci yol
/*
  public static void printUniqueWords(String [] words){
        for(String each1: words){
            int count =0;
            for(String each2: words){
                if(each1.equals(each2)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each1);
            }
        }




*/

}
