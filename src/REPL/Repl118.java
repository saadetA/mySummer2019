package REPL;

import java.util.*;

public class Repl118 {

public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	
	int lastIndex = nums.length-1;
	int middle = nums.length/2;
	
	for(int i =0; i <middle;i++) {
		int temp =nums[i];
		nums[i] = nums[lastIndex -i];
		nums[lastIndex-i] = temp;
	
	
	System.out.println(Arrays.toString(nums));	







	}

}







}
