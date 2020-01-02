package REPL;

import java.util.Arrays;
import java.util.Scanner;

public class repl107 {

public static void main(String[] args) {
	

    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
   
		 
int evennumber=0;

for(int  i= 0; i <nums.length;i++) {
	if(nums[i]%2==0) {
		evennumber++;
	}
}
System.out.println(evennumber);
	









}






}
