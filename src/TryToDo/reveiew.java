package TryToDo;
import java.util.Scanner;
public class reveiew {                     //onemli ozet
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);	
String name="saadet";
int a=name.length();//name.length
System.out.println(a );

String ad="saadet";
//5
char ch=ad.charAt(3);//charAt
System.out.println(ch);

String kardes="mustafa";
char sy=kardes.charAt(2);
System.out.println(sy);
                             //toUppercase


String sevim="kardes";
String yeni=sevim.toUpperCase();
System.out.println(sevim);
int num=yeni.length();
System.out.println(num);
char s=yeni.charAt(2);
System.out.println(s);
String x=yeni.toLowerCase();
System.out.println(x);


String mesaj="seni cok ozledim                ";//trim removed unused place 
mesaj=mesaj.trim();
System.out.println(mesaj);                         //iki word arasini silmez
/*
String Str ="Cybertek School";
//           0123456789

  Str = Str.substring(9); //School              //substring(begin index);
System.out.println( Str );//hangi index numrsindan itibaren print etmek istiyorsak bu metdu kullcz
                           
String Address = "Mclean VA 22000";
//                0123456789... 
String zipcode = Address.substring(11);
System.out.println(zipcode);


*/
String uyku="ders calismam lazim";//substring=cikar,begining dersek bastan sayar 
       uyku=uyku.substring(5);//cikarir geri kalani print eder//5 ten itibaren print et
System.out.println(uyku);

String java="java dersi gayret istiyor";//begin an anding dersek iki rakam arasini print eder
java=java.substring(11, 25);            //11-25 arasini print et
System.out.println(java);
    //replace(old char,new char)
String isim="saadet";
      
isim=isim.replace('a','e');                 //replace
System.out.println(isim);
String celil="okulda calisti";
celil=celil.replace("okulda","evde");
System.out.println(celil);


String celil1="hem okulda calisti hem evde calisti";
celil1=celil1.replace First("hem");
System.out.println(celil1);






}



}
