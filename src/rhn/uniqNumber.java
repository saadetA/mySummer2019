package rhn;

import java.util.Arrays;

public class uniqNumber {
	
	public static void main(String[] args) {
		    
		   // int []  nums= {7,10,3,10,4,2,3,5,7,8};
		    short[]nums1= {3,9,8,2,2};//,
		    // write a method that prints distinct numbers in an array
		    
		    // output 
		    
		    // 4,2,5,8
		    
		   // printDistinctNumbers(nums);
		    
	String num=uniqnum(nums1);
		   System.out.println((num) ); 
		    }
		    //982282222
	 
	 public static String uniqnum(short[]nums1) {
		String uniq=""; //3 9 8 2 2//3 9 8
	 short count=0;
	 for (int i = 0; i < nums1.length-1; i++) {
		for (int j = i+1; j < nums1.length-1; j++) {
			if(nums1[i]!=nums1[j]) {
				count++;
			}
		if(count==1) {
			uniq=""+nums1[i];
		}
		}
	 }
	 
		
		
		
		
		return uniq;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 private static void printDistinctNumbers(int[] nums) {
		    
		    
		    
		    for (int i = 0; i < nums.length; i++) {
		        
		        
		        if ( count(nums[i],nums)==1) {
		            
		            System.out.print(nums[i]+" ");
		        }
		        
		    }
		    
		        
		        
		    }
		    private static int count(int n, int[] nums) {
		        
		        int count=0;
		        
		        
		        for (int j = 0; j < nums.length; j++) {
		            
		            
		            if (nums[j]==n)
		                count++;
		        }
		        
		        
		        
		        return count;
		    }
}
