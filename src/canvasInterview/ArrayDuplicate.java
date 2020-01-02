package canvasInterview;

public class ArrayDuplicate {
	/*
	 
	 1. write a return method that accepts a String and removes duplicate 
	 	values from the String
	Ex:
		RemoveDuplicate("aaabbbccc") ==> "abc"
	2. write a return method that accepts String and returns the unique 
	values from the String
	Ex: 
			Unique("AABBCDEEE")  ==> "CD"
			
			
	 */
 
	
	
	
	
	public static String  removeduplicate(String str) {
	 
 String remove="";
 //aaabbbccc
 for (int i = 0; i < str.length(); i++) {
	if(!remove.contains (str.substring(i, i+1))){
		remove+=str.substring(i, i+1);
	}
	}
 
 
 return remove;
 }

public static void main(String[] args) {
String yeni=	removeduplicate("aaabbbccc");
System.out.println(yeni);

}


}
