package day35warmupconstractor;
import java.util.ArrayList;
import java.util.Arrays;
public class wurmup2 {

public static void main(String[] args) {
ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));	
int max=maxnum(list);
System.out.println(max);

}
//2. write a return method that accepts an Integer array and returns the maximum number
  //      DO NOT USE SORT METHOD

public static int maxnum(ArrayList<Integer>list) {
	int max=Integer.MIN_VALUE;
for(int each:list) {//unboxung
	if(each>max) {
	max=each;	
	}
}
return max;
}








}
