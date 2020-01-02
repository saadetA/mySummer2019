package volkanistekmethod;

public class Stringmethod {
public static void main(String[] args) {
	String str="merhaba ayse";
str=str.substring(0, 7)+"sevim";
System.out.println(str);



String s="ibrahim Akgobek";
int k = s.indexOf(' ');
String firstName = s.substring(0, k); 
String lastName = s.substring(k + 1);
System.out.println(firstName);
System.out.println(lastName);
String adress="201 florence court Allen tx";
int bosluk=adress.indexOf(' ');
System.out.println(adress.substring(bosluk));

System.out.println("welcome to java".indexOf('w'));//0
System.out.println("welcome to java".indexOf('j', 6));//6 dan sonra j yi ara 11
System.out.println("welcome to java".indexOf("java"));//0 11

System.out.println("welcome to java".indexOf("come"));//0 3

System.out.println("saadetdemirtas@gmail.com".indexOf('@'));
System.out.println("saadetdemirtas@gmail.com".substring(14,15));
System.out.println("saadetdemirtas@gmail.com".substring(15));


System.out.println("===================================");







}








}
