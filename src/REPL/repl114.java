package REPL;

import java.util.Arrays;
import java.util.Scanner;

public class repl114 {

public static void main(String[] args) {
/*	
Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2
*/
Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
  int count=0;
 
	
	for(int each1: nums) {
		  
		count = 0;
		for(int each2: nums) {
			
			if(each1  == each2) {
				
				count++;
			}
			
		}
		if(count ==1) {
			System.out.println(each1);
		}
	}
 





}





}
