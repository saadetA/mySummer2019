package Practices;

public class methodsexamples {
//1.Write a method that calculates the sum of 3
	//numbers
	//2.Write a method that shows the grater number
	//from 2 numbers
//

public static void main(String[] args) {
	sumNumbers(300,10,8);
greaterNUmber(6,5,10);
calculateAge(1977,2019);	
convertKm(3.4);
int sonuc=calisAl(24);
System.out.println(sonuc);

int sonuc2= topla(79,62);
System.out.println(sonuc2);
}

public static void sumNumbers(int a,int b,int c) {
 int sum=a/b/c;
System.out.println(sum);
}

public static void greaterNUmber(int a,int b,int c) {
 int max=a>b&&a>c?a:b>a&&b>c?b:c;
System.out.println(max);
	


}
public static void calculateAge(int birthday,int year) { 
int age=(year-birthday);
System.out.println(age);
}

public static void convertKm(double lt) {
double km=1.612;
	
	 lt=km*lt;	
System.out.println("liters ="+lt);
}

public static int calisAl(int x) {
	if(x>2)
return x;
	else if(x>10)
return x+1;
	else
return x*50;

}
//overload
public static int topla(int z,int t) {
int result=z+t;
	return result;	
//System.out.println(result);neden err veriyor cikartmiyor

}
//public static topla(double z,double t) {//sor
//return z+t;	

//}























}
