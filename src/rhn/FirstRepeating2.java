package rhn;

public class FirstRepeating2 {

	public static void main(String[] args) {
	    
	    int []  nums= {7,10,3,3,10,4,2,3,5,7,8};
	    
	    // write a method that returns the first repeating number
	    
	    // output
	    //3
	    System.out.println(firstRepeatingDigit(nums));
	    
	    }
	    private static int firstRepeatingDigit(int[] nums) {
	        
	        
	        int digit=0;
	        for (int i = 0; i < nums.length; i++) {
	            
	            
	            for (int j = i+1; j < nums.length; j++) {
	                
	                if (nums[i]==nums[j]) {
	                    
	                    digit=nums[i];
	                    //System.out.println(digit);
	                    //System.exit(0);
	                
	                }
	                
	            }
	            
	            break;
	            
	        }
	        
	        
	        
	        return digit;













}

