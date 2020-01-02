package rhn;

public class NumbersInArray {
	 public static void main(String[] args) {
		    
	        //int a=5;
	        
	        char [] arr= {'a','1','c','l','3','7','2','f'};
	        char [] list1= {'a','1','9','4','y','l','m','f'};
	        // write a method that returns the numbers of letters in an array.
	        
	        // output 3
	        
	       System.out.println(numberofLetters(arr));//numbr of letter
	        System.out.println(numberoflet(list1));//number of digit
	    }
	    
	 public static short numberoflet(char[]list1) {
		//short numlet=0; 
	 short count=0;
	 for (char each:list1) {
	if(Character.isDigit(each)) {
		count++;
	}
	
	 
	 }
	
		
		
		return count;
	 }	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static int numberofLetters(char[] list) {
	        
	        int count=0;
	        for (int i = 0; i < list.length; i++) {
	            
	            if (Character.isLetter(list[i])) {
	                
	                count++;
	            }
	            
	            
	        }
	        
	        
	        return count ;
	    }
}
