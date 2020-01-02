package day36Reveiw;

import java.util.ArrayList;
import java.util.Arrays;

public class warmup1 {

	// WarmUp:
	// 1. write a return method that can remove the duplicated objects
	// from an Integer arraylist

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 2, 4, 5, 6, 7, 3, 2));
		list = RemoveDup(list);
		System.out.println(list);
	     list = RemoveDup(list);  //[1,2,3]
	        
	        System.out.println(list);
	}

	public static ArrayList<Integer> RemoveDup(ArrayList<Integer> list) {

		ArrayList<Integer> result = new ArrayList<>();
		for (Integer each : list) {
			if (!result.contains(each)) {
				result.add(each);
			}

		}
		return result;
	}
//ikinci yol
	/*
	 * public static ArrayList<Integer>RemoveDup(ArrayList<Integer>list){ for (int i
	 * = 0; i < list.size; i++) { if(result.contains(list.get(i))) {
	 * result.add(list.get(i)); } } return result; }
	 */

}
