package REPL;

public class repl186 {
public static void main(String[] args) {
	
} 
/*	
public static String getAllNumbersFromString(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }
        char c = input.charAt(input.length() - 1);
        String newinput = input.substring(0, input.length() - 1);

            if (c >= '0' && c<= '9') {
            return getAllNumbersFromString(newinput) + c;

        } else {
            return getAllNumbersFromString(newinput);
        }
    } 	


*/


public static String extractNum(String s) {
	if(s==null||s.length()==0) {
		return "";
	}
	char c=s.charAt(s.length()-1);
	String news=s.substring(0,s.length()-1);
	if(c>='0'&&c<='9') {
		return extractNum(news)+c;
	}
	else {
		return extractNum(news);
	}
	
	}	     
		    
		   




	 }


