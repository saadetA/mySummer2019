package TryToDo;
import java.util.*;
public class Summary {
public static void main(String[] args) {
	
Scanner scan=new Scanner(System.in);
//1 reverse
String input, reverse="";
System.out.println("kelime goiriniz");
input=scan.nextLine();
for (int i = input.length()-1; i>=0; i--) {
	reverse+=input.charAt(i);
	System.out.print(input.charAt(i)+" ");	
}
System.out.println();
if(input.equals(reverse)) {
	System.out.println("palindrome");
	}else {
	System.out.println("not palindrome");
	}
System.out.println("==========================");

//0~1000 aras sayi toplamlari

int i=0;
int total=0;
for ( i = 500; i <=1000; i++) {
	total+=i;
}
System.out.print(total);
System.out.println("=======================");
//yildiz ucgen
System.out.println("yildiz kacli olsun");
int sira=scan.nextInt();

for (int t = 1; t <=sira; t++) {
	for (int j = 0; j <t; j++) {
		System.out.print("*");	
		
	}
	System.out.println("");
}
	
//ucgen yildiz iki
int yildizsira=0;
 yildizsira=scan.nextInt();

for (int j = yildizsira; j >=1; j--) {
	for (int j2 = yildizsira; j2>=j; j2--) {
		System.out.print("*");
	}
System.out.println("");


}
System.out.println();

int sira1=scan.nextInt();
for (int y = sira1; y >=1; y--) {         //
	for (int z = y; z >=1; z--) {
		System.out.print(z+" ");	
	}
for (int k= 2; k <=y ; k++) {		
		
	
		System.out.print(k+" ");		
		}
	System.out.println("");
}

int t=scan. nextInt();
System.out.println(     "*");
System.out.println(    "***");
System.out.println(   "****");
System.out.println(  "******");
System.out.println( "*********");

//
int max=0;
int[]b=new int[100];
for (int j = 0; j <b.length; j++) {
	if(b.length>j) {
	
	}	


}

}





}







