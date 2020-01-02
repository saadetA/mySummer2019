package palondrame_reverse;

import day26foreach.foreach;

public class ReverseWithString {
public static void main(String[] args) {
	reversename("ibrahim"); 	
System.out.println(reversename("ibrahim"));

System.out.println(reversewithcharArray("mustafa"));
}
	
	public static String reversename(String name) {
		String container ="";	
	for (int i = name.length()-1; i>=0 ; i--) {
		container+=""+name.charAt(i);
	}
	return container;
	
	}
	
	public static String reversewithcharArray(String isim) {
		String reverse="";
	char[]arr=isim.toCharArray();
		//System.out.println(arr);
		for (int i = isim.length()-1; i >=0 ; i--) {
		reverse+=arr[i];
	}
		
		
		
		
		return reverse;
	}








}
