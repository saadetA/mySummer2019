package palondrame_reverse;

import java.util.Arrays;

public class palondrame3 {
public static void main(String[] args) {
String str="mom is mom";	
//char[]arr=str.toCharArray();
String[]arr=str.split(" ");//step1
//System.out.println((Arrays.toString(arr)))
//System.out.println(str.toCharArray());
int head=0;int tail=arr.length-1;int count=0;//step2
while(head>tail) {
	if(!arr[head].equalsIgnoreCase(reverseString(arr[tail]))) {
	count++;	
	}
head++;
tail--;
}
if(count>0) {
	 System.out.println("NOT PALINDROME");
}else
	 System.out.println(" PALINDROME");

}
public static String reverseString(String str) {
	
	String container  ="";
	
	
	for(int i =str.length()-1 ; i>=0 ; i--) {
		
		container += str.charAt(i);
	}
	
	return container;
	
	
}





}








