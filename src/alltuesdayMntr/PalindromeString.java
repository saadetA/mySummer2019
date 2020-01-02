package alltuesdayMntr;

public class PalindromeString {
	 public static void main(String[] args) {
	        String str="EYet";
	        
	    
	        
	        isPalindrome(str);
	        
	    }
	    
	    public static void isPalindrome(String s) {
	        
	     if ( s.equalsIgnoreCase(reverse(s)))     
	        System.out.println("Palindrome");
	     
	     else
	         System.out.println("Not Palindrome");
	        
	    }
	    public static String reverse(String s) {
	        
	        String result="";
	        
	        
	        for (int i = s.length()-1; i >= 0; i--) {
	            
	            result+=s.charAt(i);
	            
	        }
	        
	        return result;
	    }
}
