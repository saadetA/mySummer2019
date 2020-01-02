package factorial;

import java.util.Scanner;

import day26foreach.foreach;

public class faktorialprime {
public static void main(String[] args) {
	

int num1=10;
int faktorialsum=1;
for(int i=1;i<=num1;i++) {
faktorialsum*=num1;	
}
System.out.println(faktorialsum);


	// 5!   1*2*3*4*5 ! =120
	//4! =4*3*2*1 =24
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	
	int num = scan.nextInt();
	double factorialSum =1;
	
	for(int i =1 ; i<=num; i++ ) {
		
		factorialSum = factorialSum*i;
		
	}
	
	System.out.println("Factorial of your number is " + factorialSum);
	
	System.out.println("===============================");
//prime
	// even =cift sayi odd =tek sayi prime = kendisine ve bir disinda boleni olmayan

			//System.out.println(isPrime(96));
			
	for(int i = 2; i<num ; i++) { //Math.sqrt(num) da olabilir
		if(num %i == 0) {
			






}
}