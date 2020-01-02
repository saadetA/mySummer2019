package codingBat;

public class sorular {
/*
Given a string, if the string begins with "red" or "blue" 
return that color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"

*/
	
public static String seecolor(String a){
String color="";	
if(a.startsWith("red")) {
	color="red";

}else if(a.startsWith("Blue")) {
	color="blue";
}else {
	color="";
}
return color;	

}



public static boolean frontAgain(String str) {
	if(str.length()<2)return false;
	return (str.substring(0, 2).equals(str.length()-2));
/*	
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
*/
} 
/*
Given a string, return a new string made of 3 copies
 of the first 2 chars of the original string. 
 The string may be any length. If there are fewer than 2 chars,
  use whatever is there.


extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
*/

public static String extraFront(String str) {
	if(str.length() <= 2) return str + str + str;
	return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
}	

public static String without2(String str) {
/*
	Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.


without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
*/	
	String yeni="";
	if(str.length()<2) {
		yeni=str;
	}
	else if( str.substring(0,2).equals(str.substring(str.length()-2))){
	yeni=str.substring(2);
}else {
	yeni=str.substring(0);
}	  
return yeni;
}
//public static String deFront(String str) {    
/*	  
Given a string, return a version without the first 2 chars.
 Except keep the first char if it is 'a' and keep the second char 
 if it is 'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
*/







public static void main(String[] args) {
String newcolor=	seecolor("redxx");
System.out.println(newcolor);


System.out.println( frontAgain("ed")); {
		System.out.println(extraFront("Hello"));	  
System.out.println(without2("Hi"));
//System.out.println(deFront("away"));

}
}



}
