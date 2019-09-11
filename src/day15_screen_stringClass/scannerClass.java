package day15_screen_stringClass;
import java.util.Scanner;


public class scannerClass {
public static void main(String[] args) {

/*Topic: 
            1. Scanner class
            2. String class & String manipulations
Scanner class: used for reading user inputs
        
            Scanner class is presented in "java.util" package
            in order to use scanner, we MUST import it from its package:
                                    import java.util.Scanner;
                 // imports scanner class only from the java.util' package 
            the import statement MUSt be placed between class and pckage:
                            package A;
                                import java.util.Scanner;
                            publi class B{  }
            wild import: 
                            import java.util.*;
            // imports all the classes within "java.util" package
            Decleration of scanner class:
                        Scanner variableName = new Scanner(System.in)
                        variableName: can reference an object of scanner class
                        new Scanner(System.in): creates an object from the scanner class
            Scanner methods:
                        variableName.nextByte():
                                        returns the user input as byte value
                        variableName.nextShort():	

*/

	   Scanner input = new Scanner(System.in);
       System.out.println("Enter byte value");   
       byte num = input.nextByte();  // returns the user input as byte value
       
       System.out.println("Enter short value");
        short num2  = input.nextShort(); // returns the user input as short value
        
        System.out.println("Enter int vlaue");
           int num3 = input.nextInt();  // returns the user input as int value
        
        System.out.println("Enter long value");
           long num4 = input.nextLong(); // returns the user input as long value
        
        System.out.println("Enter boolean value");   
           boolean result  = input.nextBoolean();  // returns the user input as boolean value
           
        System.out.println("Enter float value"); 
           float num5  =   input.nextFloat(); // returns the user input as float value
           
        System.out.println("Enter double number");
           double num6 = input.nextDouble();   // returns the user input as double value
               
       











}	
	
	
	
	
	
	
	
}