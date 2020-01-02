package volkanistekmethod;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
int []number=new int[3];
	System.out.println("lutfen"+number.length +"sayi giriniz");
for (int i = 0; i < number.length; i++) {
	number[i]=input.nextInt();
}

number=new int[10];

char []city= {'D','A','L','L','A','S'};//YERINE
String str="Dallas";//stringde aslinda bir arraydir
//arrayin icindeki elemanlari toplama

int []num2= {6,7,98};
int sum=0;
for (int i = 0; i < num2.length; i++) {
	sum+=num2[i];//sum=num2[i]+sum
}
System.out.println(sum);
//veya for each
sumforeach();





//arrayin en buyuk elemanini bulma
//hangi indexte oldugunu da bul
int []num3= {20,45,60};

int max=0;
int index=-1;
for (int i = 0; i < num3.length; i++) {
	if(num3[i]>i) {
		max=num3[i];
	index=i;
	}
}
System.out.println(max);

//arrayin elemanlarini sola kaydirma
int []num4=new int[5];
int ilkelemani=num4[0];
for (int i = 0; i < num4.length-1; i++) {
	num4[i]=num4[i+1];//arrayin ilk elemanini ikinci elemanina esitledik
}



}

private static void sumforeach() {
	int []num2= {6,7,98};
	int sum=0;
	for(int each:num2) {
		System.out.println(each+=sum);
	}
}
}
