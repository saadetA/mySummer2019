package day28methods;

public class warmup1 {
public static void main(String[] args) {
	// 2nKmToMiles();calismaz yetrli bilgi verilmedi paranteze
	KmToMiles(10);
GallonToLitter(85.5);
}	
	/*
write a program that convert km~miles
1km=0.62 miles
write a program that convert litter~gallon

*/
public static void KmToMiles(double KM) {//1
	double Miles=KM*0.612;
System.out.println(KM+"equals to"+Miles+"miles");
}
public static void GallonToLitter(double d) {
	double litter= d *0.612;
	System.out.println(d+"equals to"+litter+"miles");
}


}





