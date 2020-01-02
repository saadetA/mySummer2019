package REPL;


import java.util.Arrays;
import java.util.Scanner;//107

public class ReplArrays {
public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    int count =1;
	  for (int each:nums) { 
		if(each%2==0) {
			count=each;
			System.out.print(count+"");
		}count++;
	}    
	  
	  
	  }
	    











}














