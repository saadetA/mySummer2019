package replArrylist_methods;

import java.util.ArrayList;
import java.util.Arrays;

public class AL_RemoveInstance {
public static void main(String[] args) {


    ArrayList<Integer>  arr = new ArrayList<>();
    Integer[] nums = new Integer[]{1,1,2,3};
    arr.addAll(Arrays.asList(nums));
    
    System.out.print(removeInst(arr,1));
   


}	
	
	
	public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n){
		   // remove(Index) --> removes an object from the list indicated by index
		   //   // remove(Object) -- > removes the indicated object
		   // 1,1,2,3,4
		   //remove(2) -->1,2,3,4
		   // removeAll(Collection) --> removes all the occurrence of given value
		   r.removeAll(Arrays.asList(n));

		   return r;
		  }
}

/*
This method gets an arraylist of Integers and a number(Integer).it returns an arraylist.

It removes any instance of the number it gets from the arraylist.

for example:

romoveInst([1,1,2,3,1,4],1)
returns: [2,3,4]

romoveInst([3,4,3,3],4)
returns: [3,3,3]



*/
