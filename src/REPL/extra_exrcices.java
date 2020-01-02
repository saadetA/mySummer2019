package REPL;

import java.util.*;

public class extra_exrcices {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();		
/*
Write a program that will find out shortest 
words in the given string str. If there are 
few words that are evenly short, print them 
all. Use split method in order to split str string 
variable and create an array of strings.  Print array
 with Arrays.toString() method. Sort array before printing. 
Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]	
*/	
String []arry=str.split( "");	
//for(int i=str.length()-1;i>=0;i--) {
	
	
	//}
//System.out.println(arry[i]);


Arrays.sort(arry);	
System.out.println(Arrays.toString(arry));	
//String[]yeni=new String[str.charAt(i)];	
	
	
	
	}	
	}
