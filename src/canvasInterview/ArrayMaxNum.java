package canvasInterview;

import java.util.Arrays;

public class ArrayMaxNum {
//Write a method that can find the maximum 
	//number from an int Array

	 

public static void max(int[]arr) {
/*
public static int maxValue( int[]  n ) {

int max = Integer.MIN_VALUE;

for(int each: n)

if(each > max)

max = each;

 

return max;

}birinci yontem	
	
	
*/	
	
	
	//2.yontem
	int max=0;	
Arrays.sort(arr);
max=arr[arr.length-1];
System.out.println(max);


}


public static void main(String[] args) {
	int[]arr= {1,2,3,5,8};
	max(arr);

}

}
