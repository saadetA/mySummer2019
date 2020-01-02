package volkanistekmethod;

import java.util.Scanner;

public class sehirleriSirala {
public static void main(String[] args) {
	
Scanner scan=new Scanner(System.in);

System.out.println("birsehir giriniz");
String str1=scan.next();
System.out.println(" ikinci birsehir giriniz");
String str2=scan.next();
if(str1.compareTo(str2)<0) {
	System.out.println("buyuksehir"+str1+" dir");
}else {
	System.out.println("buyuksehir"+str2+"dir");
}

String okul="norton elementry";
String okul2=okul.substring(7);//substring stringin altkumesidir
System.out.println(okul2);
System.out.println(okul.substring(6,10));
String deneme="javapaython paythonjava";
String deneme2=deneme.replaceAll("paython", "selenium");
System.out.println(deneme2);
System.out.println(deneme.replace("java", "selenium"));
}








}
