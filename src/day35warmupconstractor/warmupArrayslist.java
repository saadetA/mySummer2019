package day35warmupconstractor;
import java.util.ArrayList;
public class warmupArrayslist {


public static void main(String[] args) {
	int[]arr= {1,2,3,4,5};//1.soru
	ArrayList<Integer>list	=ArraytoArrylist(arr);//1.soru
System.out.println(list);//1.soru
//////
System.out.println( ArraytoArrylist(arr) );


double[] arr2 = {1.5, 2.5, 3.5};
ArrayList<Double> list2 = ArraytoArrylist(arr2 );

System.out.println(list2);

}
/*Warm Up: 
    1. write a return method that accepts an int array and returns it as an ArrayList
    2. write a return method that accepts an Integer array and returns the maximum number
            DO NOT USE SORT METHOD
    3. write a return method that accepts an Integer arrayList and returns the second maximum number
            DO NOT USE SORT METHOD
    4. write a return method that accepts an Integer array and returns the minimum number
            DO NOT USE SORT METHOD
    5. write a return method that accepts an Integer arrayList and returns the second minimum number
            DO NOT USE SORT METHOD
*/


public static ArrayList<Integer>ArraytoArrylist(int[]arr){
ArrayList<Integer>list=new ArrayList<>();	
//for (int i = 0; i < arr.length; i++) {
	
//}
for(int each:arr) {//each arr deki herseyi liste ekleyecek
	list.add(each);//autoboxing
}

return list;
}
//bu methodu overload ile cogatmak istersek


public static ArrayList<Double>ArraytoArrylist(double[]arr){
ArrayList<Double>list=new ArrayList<>();	
//for (int i = 0; i < arr.length; i++) {
	
//}
for(Double each:arr) {//each arr deki herseyi liste ekleyecek
	list.add(each);//autoboxing
}

return list;
}














}
