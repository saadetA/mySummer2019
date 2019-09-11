package day10_ifStatements;

public class if_ElseStatement {

public static void main(String[] args) {
	
	/*
    single if:
           if ( boolean expression)  { 
                   // A
           }
    */
   
   if( 9 > 8 ) {
       // true
       System.out.println("9 is greater than 8");
           
   }   
   
   if( 9 < 8) {
   //  false   
       System.out.println("8 is greater than 9");
       
   }
       
   System.out.println("Test Completed"); // does not belong to any if block
   
   
   // Task01:
   int num1=500;
   int num2=100;
   
   int max = 0; // local variables needs to be initialized before use
   
   if( num1 > num2 ) {  // means that num1 is greater than num2
       // false
       // max = num1;
       max += num1;
   }
   
   if( num2 > num1 ) {  
       // true
       
       // max = num2;  // max=300;
        max += num2;
   }
   
   if( num1 == num2 ) {
   //  max = num2;
       max += num2;
       System.out.println("both numbers are equal");
   }
   
   
System.out.println("Maximum number between "+num1 +" and "+num2+" is "+max);
   

// task02:
   int hours = 14;  //   2 pm
   int minutes = 45;
   int seconds = 30;
   
   String amOrPm ="pm";
   
System.out.println( hours + ":" +minutes + ":"+seconds+" "+amOrPm );   
   // hours:minutes:seconds am


// task03:

   // solution 1:
int n1=1000, n2= 5000, n3 = 900;    

int maximum = 0;  // local variable must be initialized before use

/* 
in order to n1 be the maximum :  n1 > n2 && n1 > n3
in order to n2 be the maximum :  n2 > n1 && n2 > n3
in order to n3 be the maximum :  n3 > n1 && n3 > n2

*/

if ( n1 > n2 && n1 > n3 ) {
   maximum = n1;
}

if(n2 > n1 && n2 > n3) {
   maximum = n2;
}

if(n3 > n1 && n3 > n2 ) {
   maximum = n3;
}

System.out.println(maximum); 
// 5000


       // solution 2:
if(n1 > n2 && n1 > n3) {
   System.out.println("Maximum number is " +n1);
}

if (n2>n1 && n2 > n3) {
   System.out.println("Maximum number is "+n2);
}

if(n3 > n1 && n3 > n2) {
   System.out.println("Maximum number is "+n3);	
	
	
}	
			
		
	}		
		
	
} 
 
	
	
	
	
	
	
	
	
	
	

