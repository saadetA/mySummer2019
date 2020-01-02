package rhn;

import java.util.Arrays;

public class CountLettersInArray {

	    public static void main(String[] args) {
	    
	    int []  nums= {7,10,3,10,4,2,3,5,7,8};
	    
	    // write a method that prints distinct(uniq) numbers in an array
	    
	    // output 
	    
	    // 4,2,5,8
	    
	    countDistinctNumbers(nums);
	    
	    
	    
	    }
	    public static void countDistinctNumbers(int[] nums) {
	    
	    Arrays.sort(nums); // 2,3,3,4,5,7,7,8,10,10
	        
	    
	    int count=1;
	    for (int i = 0; i < nums.length-1; i++) {
	        
	        if (nums[i]==nums[i+1])
	            count++;
	    
	    }
	System.out.println(count);
}
}