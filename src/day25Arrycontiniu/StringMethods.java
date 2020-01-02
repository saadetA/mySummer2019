package day25Arrycontiniu;

import java.util.Arrays;

public class StringMethods {
/*
split(str)===>str arry e cevirir
toCharAt(stringi)===>chararry e cevirir
*/
public static void main(String[] args) {
	String sentence="bugun hava cok guzel gel gezelim";//kac word var
     String[]arr=  sentence.split("");
System.out.println(Arrays.toString(arr));
String email="firstname_lastname";
String[]arr2=email.split("_");
System.out.println(Arrays.toString(arr2));
//braket kaldirmak istersek
String str=Arrays.toString(arr2);
System.out.println(str.replace("[","").replace("]",""));
String cuma="bugun cuma ise cuma ya git";//kac cuma var
String[]arr4=cuma.split("cuma");
System.out.println(Arrays.toString(arr4));
System.out.println(arr4.length-1);//iki kez cuma var
String Paython=" Paython is good i love Paython, Paython is life ";//kac paython
//            [
//basina ve sonuna space koy split le hesapla koymazsak ilk harfi saymaz
    String []arry5=Paython.split("Paython");
System.out.println(arry5.length-1);
String mail="saadet demirtas 620 @ gmail.com";
String fullname=mail.substring(0,mail.indexOf("620"));
System.out.println(fullname);
//or
String[]arry=mail.split("620");
System.out.println(Arrays.toString(arry));//spliti bos koyarsaniz tum cumleyi arry yapar verir
String word="abcde";
String[]allcharacter=word.split("");
System.out.println(Arrays.toString(allcharacter));

//toCharArray();stringi char arrya cevirir

String str2="java";
char[]ch=str2.toCharArray();

System.out.println(Arrays.toString(ch));
//String methodslar codlarda






}
}
