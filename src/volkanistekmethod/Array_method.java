package volkanistekmethod;

import java.util.Scanner;

public class Array_method {
public static void main(String[] args) {
	haftaningunleri();




}

public static void haftaningunleri() {
	Scanner input=new Scanner(System.in);
String[]gunler= {"ptesi","sali","carsam","Pers","cuma"};
	System.out.println("haftanin gunu icin sayi giriniz");
 int secim=input.nextInt(); 
System.out.println("sectiginiz gun:"+gunler[secim-1]);
}
}
