package REPL;

public class primenumber {
public static void main(String[] args) {
	



// ilk 100 prime(asal sayilar) numberlari yazdiran bir method yazdiralim.

// 2 , 3,5,7,11,13,17,19,23,29,
// printPrime

int count=0;

int num=2;

for (num = 2;  count<=100; num++) {
    
    if(isPrime(num)) {
        
        System.out.print(num+" ");
        count++;
    }
}  
}


static boolean isPrime(int number) {

boolean test=true;

for (int i =2; i <number ; i++) {
    if(number%i==0) {
        test=false;
    }
}


return test;
}

}





