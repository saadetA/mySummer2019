package Practices;
import java.util.Arrays;
import java.util.ArrayList;
public class optional_assingment {
	
	public static void main(String[] args) {
		
	
	ArrayList<String>list=new ArrayList(Arrays.asList("ahmet","elhan","safa","ahmet"));

	list.removeAll(Arrays.asList("ahmet"));

System.out.println(list);

//Swap two variable' values without using a third variable
 int b=20;int a=10;
 a = a +b;

  b = a - b;

a = a - b;
 
	System.out.println(b);
	
	//Write a method which prints out the numbers 
	//from 1 to 30 but for numbers which are a multiple of 3,
	//print "FIN" instead of the number and for numbers which are a multiple
	//of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

	//Write a Java program to create a new array list, 
	//add some colors (string) and print out the collection. 
	
	ArrayList<String>colors=new ArrayList<String>(Arrays.asList("red","blue","black"));
	colors.add("mavi");
	colors.add(2,"kizil");
	colors.set(0,"white" );

	//System.out.println(colors);
	
	for (int i = 0; i < colors.size(); i++) {
		System.out.println(colors.get(i)+" ");
	}
	
	
	
	}










}
