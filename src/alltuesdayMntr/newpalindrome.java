package alltuesdayMntr;

public class newpalindrome {

public static void main(String[] args) {
	String str="ava";
boolean result=	isPalindrome(str);
System.out.println(str);

}
public static String reverse(String s) {
String reverse="";	
for (int i = s.length()-1; i >=0; i--) {
	reverse+=s.charAt(i)+"";
}





return reverse;
}

public static boolean isPalindrome(String s) {
	boolean result=false;
if(s.equalsIgnoreCase(reverse( s))) {
	

System.out.println("palindrome");
}else {
	System.out.println("not palindrome");
}

return result;
}






}
