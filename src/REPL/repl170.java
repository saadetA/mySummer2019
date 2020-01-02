package REPL;
//import java.util.*;
public class repl170 {
	
public static void main(String[] args) {
String result=(clean("hello","www"));
	System.out.println(result); 
 	

}
public static String clean (String text ,String badWord) {
	 
String result = "";

for(int i = 0; i<text.length(); i++) {
  if(text.contains(badWord)) {
    result = text.replace(badWord.substring(0, badWord.length()), "");
  }
}
return result;


}
}






