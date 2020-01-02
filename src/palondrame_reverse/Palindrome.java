package palondrame_reverse;

public class Palindrome {
/*
Instructions from your teacher:
Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.

So method isPalindrome checks that and returns true if check is palindrome and false if it is not.

- make your conditions case insensitive.  ex: Civic and civic are both palindromes
- make your conditions space insensitive.  Race car is a palindrome even though there is space in between.

Examples:

isPalindrome("Noon") ==> true

isPalindrome("I am not palindrome") ==> false

isPalindrome("wooden") ==> false

isPalindrome("Nurses Run") ==> true

*/

public static void main(String[] args) {
	
	System.out.println(isPalindrome("wooden"));
	//ana == ana level =level  mom ==mom 
	
			String str = "level";
			
			String container =reverseString(str);
			
			if(str.equalsIgnoreCase(container)) {
				System.out.println("Palindrom");
			}else
				System.out.println(" NOT Palindrom");
			
			
	
	
}	
	
	
	public static boolean isPalindrome(String check) {
	     
	    
		  check = check.replace(" ","");
		    check = check.toLowerCase();

		    String reverse="";
		    for(int i =check.length()-1; i>=0; i--){
		        reverse += "" +check.charAt(i);
		   }
		    if(check.equals(reverse)){
		        return true;
		    }
		        return false;	
			 
	}

public static String reverseString(String str) {
		
		String container  ="";
		
		
		for(int i =str.length()-1 ; i>=0 ; i--) {
			
			container += str.charAt(i);
		}
		
		return container;
		
		
	}
/************SECONDWAY	
 *      int count =0;
		int head =0;
		int tail =str.length()-1;//5
		
		while(head<tail) {
			if(str.charAt(head) != str.charAt(tail)) {
				count++;
			}
			head++;
			tail--;
		}
		
		if(count>0) {
			System.out.println(false);
		}else
			System.out.println(true); */
		
















}
