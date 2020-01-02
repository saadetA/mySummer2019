package rhn;

public class PalindromeString2 {

    public static void main(String[] args) {
        String str="Adanada";
        
        
        isPalindrome(str);
        
    }
    private static void isPalindrome(String str) {
    
        //  Kabak 
        
        int i=0;
        int j=str.length()-1; // 4
        
        
        boolean test=true;
        
        while(i<j) {
            
            if(str.toLowerCase().charAt(i)!=str.toLowerCase().charAt(j)) {
                
                test=false;
        }
        
            i++;
            j--;
        
        }
        
        if(test) {
            
            System.out.println("Palindrome");
        }
        
        else {
            
            System.out.println("Not PAlindrome");
        }
        
    }
}
