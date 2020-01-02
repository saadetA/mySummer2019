package REPL;

import java.util.ArrayList;



public class repl192 {
public static void main(String[] args) {
}
//google
/*private static List<Double> getTotalPrices(List<Integer> quantities, List<Double> prices){
    List<Double> totalPrices = new ArrayList<>();
    for (int i = 0; i < quantities.size(); i++) {
         totalPrices.add(quantities.get(i) * prices.get(i));
    }
    return totalPrices;
}

*/

public static void timesTwo(ArrayList<Integer>nums) {
	
	ArrayList<Integer>timesTwo=new ArrayList<>();
	for (int i = 0; i < nums.size(); i++) {
	nums.get(i);
	nums.set(i, nums.get(i)*2);
	}
System.out.println(nums);

}
/*
Create a method that:
is called timesTwo
returns nothing
takes in a single parameter - an ArrayList of Integers called nums

This method should take the ArrayList parameter and multiply every value by two.



*/


}
