package day_57_Exeptions;

import java.util.ArrayList;
import java.util.Arrays;

public class ExeptionsHandling {

	
	public static void main(String[] args) {
	int[] number= {100,200,300};
try {
	System.out.println(number[5]);
System.out.println(" try block-check exeption");

}catch(ArrayIndexOutOfBoundsException e) {//e herhangi bir veriable name olabilir
System.out.println("catch blok-unchecked exeption");
}

System.out.println("work done");
try {
Thread.sleep(2000);//syntax hatasi degilse handle etmem lazim
System.out.println("check exeptions ise burdaki code calisir");
}
catch(InterruptedException e) {
System.out.println("uncehecked exeptions ise burdaki testlerim calisir");	
}
System.out.println("=======================================");	
	
ArrayList<Integer> list =new ArrayList<Integer>();
list.addAll(Arrays.asList(1,2,3));

	try {
	System.out.println(list.get(10));
	}catch(Exception e) {
	System.out.println("uncheck exception is occured in Arraylist");	
	}
	
	
	int[] nums= {1,2,3};
	int a;
	try {
	a=100;	
	System.out.println(nums[10]);
	}catch(RuntimeException e) {
		System.out.println("unchecked exeption");
	}
	
	
	
	
	
	
	
	}






}
