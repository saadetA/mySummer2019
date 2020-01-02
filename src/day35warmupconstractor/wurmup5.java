package day35warmupconstractor;
import java.util.ArrayList;
import java.util.Arrays;
public class wurmup5 {

//5. write a return method that accepts an Integer arrayList and returns the second minimum number
  //  DO NOT USE SORT METHOD

public static void main(String[] args) {
int[]numbers2= {100,9,8,700,18,9,0};	
//ArrayList<Integer>list6=ArrayToArraylist(numbers2);
//int secondminimum=SecondMin(list6);

}	
	
	
	
	
	
	public static int SecondMin(ArrayList<Integer>list) {
	Integer firstMin=MinNum(list);
list.removeAll(Arrays.asList(firstMin));
return MinNum(list);
}





	private static int MinNum(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		return 0;
	}









}
