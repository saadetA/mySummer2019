package volkanistekmethod;

public class StringSinifi {
public static void main(String[] args) {
	
String yeni="javayi seviyorum";
String yazi="phytonu sevmiyorum";
System.out.println(yeni.length());//1 length
System.out.println(yeni.charAt(0));//2 charAt
System.out.println(yeni.charAt(7));
System.out.println(yeni.charAt(10));

String yazi3=yeni.concat(yazi);//cok kullanilmaz
System.out.println(yazi3);
System.out.println(yeni+yazi);//ayni
System.out.println(yeni.toUpperCase());
System.out.println(yeni.toLowerCase());
String isim="   saadet    ";
System.out.println(isim);
System.out.println(isim.trim());//ikibastaki bosluklari siler
//ikibastan silmeye baslar charakter gorunce durur ozellile emaillerde
//trim kullanilir yanlis olmasin diye ama passwordde trim kullanilmaz

System.out.println("\t good night");
System.out.println("\t good night".trim());

}







}
