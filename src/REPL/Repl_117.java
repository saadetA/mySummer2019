package REPL;
import java.util.*;

import day26foreach.foreach;
public class Repl_117 {
public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};
	 // String yeni=Arrays.toString(str);
	   // System.out.println(yeni);
   String kisa=str[0];

   for(String enkisa:str) {
	if(enkisa.length()<kisa.length()) {
kisa=enkisa;
	}
   System.out.println(kisa);
   }
   
	    
	    
	    
	    
	    
	    
	    
	    /*String myShort = str[0]; //assign it to the first word for now.


   for(String Shortest : str)
   {
   if(Shortest.length() < myShort.length())
   myShort = Shortest;
   }
   System.out.println(myShort);
   */
   
   
   
   
   
   

}
    
      














}     




