package day12_ifWithoutCurlyBrace;

public class reveiev {


	
	 /*
    Warm up:
    declare 3 numbers
  if n1 and n2 are equal  => n1&n2 are equal
  
   if n2 and n3 are equal ==> n2&n3 are equal
   if n3 and n1 are qual ==>n3&n1 are equal
   if all equal ==> all equal
   if none of them are euqal ==> none of them are equal
       Do Not use single if statement
   
    */
   
   public static void main(String[] args) {
       
           int n1= 4, n2 = 1, n3 = 5;
           
           if(n1 == n2 && n1!=n3) {  // true
               System.out.println("n1 and n2 equal");
           }
           else if (n2 == n3 && n2 != n1) {
               System.out.println("n2 and n3 equal");
           } 
           else if (n3 == n1 && n1 != n2 ) {  
               System.out.println("n3 and n1 equal");
           }
           else if (n1 == n2 && n2 == n3 && n1 == n3 ) {
               System.out.println("all equal");
           }
           else {
               System.out.println("non equal");
           }
       System.out.println("\n\n");
   
   // second:
   int num1 =1 , num2 =2  , num3 = 9;
   
           
       if(num1==num2  &&  num2==num3 ) {
           System.out.println("all equal");
       }
       else if(num1 == num2){
           System.out.println("num1 and num2 are equal");
       } 
       else if(num2 == num3) {
           System.out.println("num2 and num3 are equal");
       }
       else if(num1 == num3 ) {
           System.out.println("num1 and num3 are equal");
       }
       else  {
           System.out.println("none of them are equal"); 
       } 
       
   
   // third: nested if
       int A =10, B=20, C=30;
   
   
       if(A==B && B == C) {  // if all are equal
           System.out.println("All are equal");  
           
       }
       else { // if not all of them are equal
           
           if(A == B) { // if A and B are qual
               System.out.println("A and B are equal");
           }
           else if(A ==C) { //if A and C are euqal
               System.out.println("A and C are equal");
           }
           else if(B == C) { // if B and C are equal
               System.out.println("B and C are equal");
           }
           else {// if none of them are equal
               System.out.println("None of them are equal");
           }   
       }
       
   
//nested exmp for pre condition(tum ifleri icine alan cully brace aciyoruz)   
//else de icine alir
//tamami olmazsa ayrica else eklenir invalid grade deriz	 
      
   
       /*
       
       60~70 => D
       70 ~ 80 => C
       80 ~90 => B
       90 ~ 100 => A  done
       0~59 =>F
        
        grade must be: 0~100
        */
       int grade =99;
   if(grade >=0 && grade <= 100) {
       if(grade >= 60) {
           if(grade >= 90) {
               System.out.println("A");
           }
           else if(grade >= 80) {
               System.out.println("B");
           }
           else if (grade >=70 ) {
               System.out.println("C");
           } else {
               System.out.println("D");
           }   
       }else {
           System.out.println("Failed");
       }
   } else {
       System.out.println("Invalid Entry");
   } 
	
// if curly brae kullanmamizin nedeni	icine istedigimiz kadar sys print yazabiliriz(if else0
	
	//without curly brace 
	//sadece if single da kullanabiliriz
	//bir if bir else kullanabiliriz
	//if(true)olarak kullanabiliriz
	//nested bilin ama hata yapma ihtimaliniz cok buyuzden curly brace kullanin
   //curl brace kodu daha iyi okumamizi saglar
   
   
       
       if(true) {
           System.out.println("Hello");
           System.out.println("Hello");
       }else {
           System.out.println("Wolrd");
       }
       
       
       // without curly brace: a single line of statement
       if(true) 
           System.out.println("Hello");
   //      System.out.println("Hello");   
//without culy brace if block cannot hold more than one statement
       else 
           System.out.println("World");
           
       
       if(true) {
           if(true) {
               System.out.println("Hello World");
           }
           else {
               System.out.println("Hello cybertek");
           }
       }
       else {
           System.out.println("Invalid");
       }
       
       System.out.println("=====================");
       // nested if: 
   
       if(true)
           
           if(true) System.out.println("Hello World");
       
           else  System.out.println("Hello cybertek");
       
       else System.out.println("Invalid");
   
   
       
       // multi-branch if:
       int grade1 =80;
       if( grade <= 100 && grade >= 0) {
           if(grade >= 90) {
               System.out.println("A");
           }
           else if(grade >= 80) {
               System.out.println("B");
           } 
           else if(grade >=70) {
               System.out.println("C");
           }
       }
       else {
           System.out.println("Invalid Entry");
       }
       
       
       
   if(grade <= 100 && grade >= 0)    
       if(grade >= 90) 
           System.out.println("A");      
       else if (grade >= 80)
           System.out.println("B");
       else if (grade >=70) 
           System.out.println("C");
       else // this else statement belongs to the "else-if statements
           System.out.println(); 
   else  // this else statement belongs to the pre condition
       System.out.println("Invalid");
       
       
//ilk else if elselere bagli ikincisi pre cond ife bagli ikitne koymak zorundayiz       
       
       
       
          
   
   
   
   
   
   
      
   
   
   
   
	
}
   }
      
      
      
      
      
      
      
      
      
      
      
	
	
	
	
	
	
	
	
	
	
	

