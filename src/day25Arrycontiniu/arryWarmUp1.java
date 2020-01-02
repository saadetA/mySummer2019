package day25Arrycontiniu;



public class arryWarmUp1 {
public static void main(String[] args) {
	/*
	 1. Write a program that can print out the unique values from an int Array
		Ex: 
			if arr -> {1,1,2,3,3}
			output: 2
			if arr -> {1,2,2,3,4,4}
			output:  1  3
	 */
	int[]arr= {1,1,2,2,3};	
	for (int j = 0; j < arr.length; j++) {//nested loopstep4			
	      int count=0;//			
		for(int i=0;i<arr.length;i++) {//step 2bir rakm icin
			
			if(arr[i]==arr[j]) {//step3 it compairs each index of arry with volue if true count ++
				count++;                     
				//step2// for loop we need to check all arry

			}
}
if(count==1) {
System.out.println(arr[j]);	
}	
	}


}
}
