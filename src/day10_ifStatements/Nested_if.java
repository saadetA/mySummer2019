package day10_ifStatements;

public class Nested_if {

	/*
    single if statement:
       if( condition ) 
               // single line of statement only
    
    */
public static void main(String[] args) {
	
 

   
   if(false) {
       System.out.println("Today is friday");
       System.out.println("Tomorrow is day off");
       System.out.println("there is no java class tomorrow");
   }
   
   
   if(false)
       System.out.println("Today is Friday");

   
   if(false) 
       System.out.println("Hello");
   
   
   
   /*
       if- else statement:
           
           if(condition)
                   // single line of statement
            else
               //  single line of statement
    */
       
   if(true) {
       System.out.println("Hello");
   }
    System.out.println("Good morning");
   //else {
   //  System.out.println("Hola");
//  }   // else statement MUST be declared right after the if statement
   
   
   if(false)
       System.out.println("this is if"); 
   
   else 
       System.out.println("this is else");
   
   
   /*
    multi-branch if statement:
           
           if( condition1 )
                   // single line of statement
           
           else if( condition2 )
                   // single line of statement
                    
           else 
                   // single line of statement
    
    */
   
   
   if(true)
       System.out.println("if block");
//  System.out.println("Hello");
   else if(true)
       System.out.println("else-if block");
//  System.out.println("hola");
   else
       System.out.println("else block");
   
   // else block is not mandatory
   
  
    {
   
       }
   
   
   




if(true) {
   System.out.println("Hello Cybertek");
   
   if(false) {
       System.out.println("Hello WOrld");
   }
   
}



if(true) {
   System.out.println("Hello batch 12"); // printed
   
   if(false) {
       System.out.println("Hello programmers");
   } 
   else {
       System.out.println("Hello Team SDET"); // printed
   }
   
}



/*
 60<= garde < 70 ==> D
 70 <= grade < 80 ==> C
 80 <= grade < 90 ==> B
 90 <= grade <= 100 ==>A
   grade < 60 ==> F
*/
int grade = 0;

if( grade >= 60 && grade <= 100) {
   System.out.println("you passed");
   
   if( grade >=90 && grade <= 100) {
       System.out.println("\twith a grade of A");
       
   } 
   else if(grade >=80 && grade < 90) {
       System.out.println("\twith a grade of B");
   }
   else if(grade >= 70 && grade < 80) {
       System.out.println("\twith a grade of C");
   }
   else {  // 60 <= grade < 70
       System.out.println("\t with a grade of D");
   }
   
}
else {  // either less than 60 or greater than 100
   
   if(grade < 60) {
       System.out.println("You failed with a grade of F");
   }
   else { // greater than 100
       System.out.println("Invalid score, error 404");
   }
   
}

}	
	
	
	
	
	
}	
	
	
	
	
	

