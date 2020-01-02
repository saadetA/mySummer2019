package volkanistekmethod;

public class StringCompareMethods {
public static void main(String[] args) {
/*	
T
Method
Description
equals(s1)
Returns true if this string is equal to string s1.
equalsIgnoreCase(s1)
Returns true if this string is equal to string s1; it is case insensitive.
compareTo(s1)
Returns an integer greater than 0, equal to 0, or less than 0 to indicate whether this string is greater than, equal to, or less than s1.
compareToIgnoreCase(s1)
Same as compareTo except that the comparison is case insensitive.
startsWith(prefix)
Returns true if this string starts with the specified prefix.
endsWith(suffix)
Returns true if this string ends with the specified suffix.
contains(s1)
Returns true if s1 is a substring in this string.


*/



String str="bugun hava cok guzel";
String str2="bugun hava cok guzel \n\t";


boolean karsilastir=str.equals(str2.trim());//trim koymasak bosluktan dolayi esit olmayacakti

if(karsilastir) {//if(str.equals(str2.trim());boylede yazabiliriz
	System.out.println("iki string esit");
}else {
	System.out.println("esit degiller");
}
System.out.println("===============================================");
String a="Java"; //iki stringi harf degil ascci degeri olarak hesaplayip int verir uc ihtml var 1 0 
String b="java";
int kiyaslamadegeri=a.compareTo(b);//kucukharf asccide buyuk oldugu icin kucuk java buyuk cikiyor
if(kiyaslamadegeri==0) {
	System.out.println("esitler");
}else if(kiyaslamadegeri>0){
	System.out.println(a+"buyuktur");
}else {
	System.out.println(b+"buyuktur");
}
//veya
//startWith()//true false
//endsWit
}


}





















