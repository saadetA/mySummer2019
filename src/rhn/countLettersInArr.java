package rhn;

import java.util.Arrays;

public class countLettersInArr {
	 public static void main(String[] args) {
		    
	        int a=5;
	        
	        char [] arr= {'a','1','c','4','3','7','2','f'};
	        
	        //  write a method that Returns array of letters  ['a', 'c' , 'f' ] 
	        
	        
	        System.out.println(Arrays.toString(arrayOfLetters(arr)));
	        }
	        
	    public static char[]  arrayOfLetters(char[] list) {
	        
	        char[] result=new char[numberofLetters(list)];
	        
	        int j=0;
	        
	        
	        for (int i = 0; i < list.length; i++) {
	            
	            
	            if(Character.isLetter(list[i])) {
	            result[j]=list[i];
	            
	            j++;
	            
	            }
	        }
	        
	        
	        
	        return result;
	    }
	    
	    

	    
	    public static int numberofLetters(char[] list) {
	        
	        int count=0;
	        
	        for (int i = 0; i < list.length; i++) {
	            
	            if(Character.isLetter(list[i])) {
	                count++;
	            }
	        }
	        
	        return count;
	    }
}
