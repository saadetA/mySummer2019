package REPL;

public class repl173 {

/*
the method gets two strings and return 
the longest one

biggerS("apple","orange") ==> "orange"
*/
public static void main(String[] args) {
	String longest=longword("saadet","safa");
System.out.println(longest);
}
	
	public static String longword(String one,String two) {
String longest=one.length()>two.length()?one:two;



return longest;
}
}
