package REPL;

public class repl178mergeArrays {
/*
Instructions from your teacher:
mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.

*/
	 
		   
		    
	  //end mergR
	public static int[] mergR(int[] a,int[] b) {
	    
	int totalSize = a.length + b.length; // combined length of both arrays
    int [] merged = new int[totalSize];

    int z =0; //iterator for both arrays
    for(int each: a){
        merged[z] = each;
        z++;
    }
    for(int each:b){
        merged[z] = each;
        z++;
    }
    return merged;
​    
	
	 }
}
