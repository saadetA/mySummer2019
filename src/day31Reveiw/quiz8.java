package day31Reveiw;

import java.util.Arrays;

public class quiz8 {
public static void main(String[] args) {
	
	int[]arr= {30,20,10,5,0	};//quz 8 soru 4
Arrays.sort(arr);//1
int count=0;
for (int i = 0; i < arr.length; i++) {
	if(arr[i]==30) {
	continue;       //count++ veya sout koyarsak error verir 
	                  //cont ve breaktanve return dan sonra birsey yazimaz
	}	
	System.out.println(arr[i]);//2
}
//ques 5

int[] numbers = {1,2,3,4};
int num =  findMax( numbers );

System.out.println();
// q6:
for(int i = 5 ; i >= 0 ; i--) {
    
    if( i ==3 ) {
        break;
    //  System.out.println("Done");
    }
    
    System.out.print(i+" ");
    
    
}

System.out.println();

int num2 = 5; //0

while( isAvailable(num2) ) {
        // num2 >  0
    
//   num2 -- ;   //43210
     
    System.out.print(--num2); 
    
    // num2 -- ;  //54321
    
}





}

//q5
public static int findMax(int[] a ) {

return 1;
}

//q7
public static int num (int a, int b) {
return a+b;
//  System.out.println("");
}


// q8:
public static boolean isAvailable( int  num ) {  
                                // 5
return  (num-- > 0) ? true : false ;
//          5  > 0  ?  true : false








}
}
