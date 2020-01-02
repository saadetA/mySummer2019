package day26foreach;

import java.util.Arrays;

public class foreach {
public static void main(String[] args) {
	
int[]arr= {1,2,3,4,5};
for (int i = 0; i < arr.length; i++) {
	
	System.out.println(arr[i]);
}
System.out.println("================================");

for(int each:arr) {
	System.out.println(each);
}
String []yaslar= {"A","B","C"};//icinde kac element varsa cikarir,
                                 //++ koymamiz gerekmiyor
for(String say:yaslar) {
System.out.println(say);
}
String []gun= {"ptesi,sali,carsamba"};
for(String oku:gun) {
	System.out.println(oku);
}
String []ders= {"java, agile,selenyum"};
for(String calis:ders) {
	System.out.println(calis);//(calis[])index no koymaya gerek yokchar[
}
char[]ch= {'z','a','b','c'};
Arrays.sort(ch);
for(char sirala:ch) {
	System.out.println(sirala);
}
System.out.println();
int[]arr1= {1,2,3,4,5,56,7,8,9,10};//print even numbers
for(int say:arr1) {
	if(say%2==0) {

	
	System.out.print(say+" ");
	}
}
System.out.println();

int[]arr2= {1,2,3,4,5,56,7,8,9,10};//print odd numbers
for(int say:arr2) {
	if(say%2!=0) {

	
	System.out.print(say+" ");
	}
}






}
}
