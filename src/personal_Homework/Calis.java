package personal_Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Calis {
public static void main(String[] args) {
	
	// combine two arrays:
    String isim1[]= {"safa","celil"};
   String isim2[]= {"Saadet","ibrahim"};
String isim3[]=new String[isim1.length+isim2.length];
for (int i = 0; i < isim1.length; i++) {
	isim3[i]=isim1[i];
}
for (int i = 0; i < isim2.length; i++) {
	isim3[i+isim1.length]=isim2[i];
}
for (int i = 0; i < isim3.length; i++) {
	System.out.print(isim3[i]+" ");
}
System.out.println();
String hal = ("nasilsin iyimisin");
String []durum=hal.split("");
System.out.println(Arrays.toString(durum));
String email="seni cok cok seviyorum";
String[]fullname=email.split("cok");
System.out.println(Arrays.toString(fullname));
System.out.println(fullname.length-1);
String Paython=" Paython is good i love Paython, Paython is life ";
String[] say=Paython.split("Paython");
System.out.println(Arrays.toString(say));
System.out.println(say.length-1);
String mail="saadet demirtas 620 @ gmail.com";
String fn =mail.substring(0,mail.indexOf("620"));
System.out.println(fn);
String[] ad=mail.split("620 @ gmail.com");
System.out.println(Arrays.deepToString(ad));
String[]cocuklar= {"safa","celil"};

System.out.println(Arrays.toString(cocuklar));
System.out.println(cocuklar[0]+" "+cocuklar[1]);
int[]rakam= {1,2,3,4,5};
Arrays.sort(rakam);
System.out.println(Arrays.toString(rakam));
System.out.println("min:"+rakam[0]);
System.out.println("max:"+rakam[rakam.length-1]);
System.out.println("second max :"+rakam[rakam.length-2]);
int[]mynumbers= {99,10,100,4000,2000};
Arrays.sort(mynumbers);
for (int i = 0; i < mynumbers.length; i++) {
	System.out.print((mynumbers[i]+" "));
}
System.out.println();
for (int i =  mynumbers.length-1; i >0; i--) {
	System.out.print(mynumbers[i]+" ");
}
System.out.println();
int t =0;
for ( t= 1; t <=20; t++) {
	if(t%3==0) {
System.out.print(t+" ");	
	
	}
}
System.out.println();

Scanner scan = new Scanner(System.in);
String word = scan.next();
String separator = scan.next();
int count = scan.nextInt();
     //word x 3 wordxwordx
String arkadas="feride, saadet, maral, ulku";
	for (int l = 0; l < arkadas.length(); l++) {
		//String yeni=(arkadas.charAt(l)+" ");
	System.out.println(l);
	}





}










}





