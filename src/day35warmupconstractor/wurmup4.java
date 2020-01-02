package day35warmupconstractor;

import java.util.ArrayList;
import java.util.Arrays;

public class wurmup4 {

public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));	
	int min=MinNum(list);
	System.out.println(min);
	
}



// task04:4. write a return method that accepts an Integer array and returns the minimum number
//DO NOT USE SORT METHOD
public static int MinNum (ArrayList<Integer> list) {
    int min  =  Integer.MAX_VALUE;
    
    for( int each : list ) {  // unboxing
        if( each < min ) {
            min = each;
        }
    }

return min;
    
}






}
