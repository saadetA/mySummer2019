package day_09;

public class operatorsReview {

public static void main(String[] args) {

	
boolean a= !!!false;System.out.println(a);	
	
	boolean k= !!!true;
	
	
System.out.println(k);	
// Question 01:

    //          !!!!true
//              !!! false
//              !!true
//                  !false
//                  true
System.out.println(a); // true
System.out.println(!!true); // true


// question 02:
boolean result= !false != ( "Batch12" != "Best Batch Ever") ;
//          true   !=  true
//              false
System.out.println(result);

// Question 03:
int x = 100;
double y =  x += 100/20;   // x= 105,  y = 105   
//              x=x+(100/20) = 105
//      y=  100 += 5  ==> 105
System.out.println(x);

System.out.println(105.0 > 105 );  // false
System.out.println( 105.1 > 105);  // true

// question 05:

boolean A = 128 > '9'  || 128 == 127;
            // true    ||  false  ==> true
System.out.println(A);

// Question 06:
    boolean StupidOperators = 10 >= 20 && 'a' > 'b';
                //              false &&   false  ==> false
//  System.out.println(StupidOperators);
    
    
// question 07:
        int num1 =9999999;
        int num2 =10;
        
        System.out.println(num1 * num2 / 10 % num1 );
//                                  9999999 % 9999999 =0;

        
// question 09:
        int z= 100;
        // System.out.println(" z > 100 is :" + H); 
                    // H is not defined before this line
        boolean H = z>100; // false
        
// question 10:
        System.out.println( 5 + 7 + "8" );
        //                  12 +"8"    ==> "128"     
        
        System.out.println( "8"+5+7 );
        //                  "85"+7
        //                  "857"

        System.out.println( 5+7 +"8"+ 5 + 7);
        //                   12+"8"+5+7           
        //                  "128"+5+7
        //                  "1285"+7
        //                  "12857"
        
        System.out.println(  5+7 +"8"+ (5 + 7) );
        //                  "128"+12
        //                  "12812"
        
        
        System.out.println( "5+7" +"8"+ 5 + 7);
            //              5+7857                  
        
//  Question 11:
            
        System.out.println( 1+11+"3" == "123");
        //                  12+"3"  =="123" 
        //                  "123" == "123";  ==> true

        
        String str ="cybertek";
        str = str +"2019"+"true"+"A";
        System.out.println(str);
        
// QUestion 12:
        int numberA = 100;
            numberA += 300;  // 400
            
    System.out.println( numberA++ + "\n"+numberA); // 401
    //                   400             401
    
    
// Question 13:
        // local variables MUST be initialized
    
    
// Question 14:
    System.out.println( (10 * 2) / (5 * 4) * 1000 / 10 % 100 );
    //                   20 / 20 * 1000 / 10 % 100
    //                      1000 / 10 % 100
    //                       100%100
    //                       0
        	

/*Relational;
< :
>:
>:
<=:
==:
!=:



*/

    /*
    relational :
        >  : greater     X=10 Y=9 : only return true when x > y
        >= : greater than or equal     true:  eitehr greater or equal
        <  : less than    X=10 Y=9 : only return true when Y < x
        <= : less than equal       true: either less  or euqal
        == :  equal            X =10, Y=10 ,  true: X==Y;   
        != :  not equal        X =9, Y=10;  true: x != y
        
        
     logical operators:
            && :  true: if both conditions are true
            || :    true: as long as one condition is true
        
        
 
public static void main(String[] args) {

    
    System.out.println( 'Z' > 'A' );   // true
    
    System.out.println( 'Z' >= 'A' );  // true
    
    System.out.println('a' >= 'A' );  // true 
    
    
    System.out.println('a' < 'A' );  // false
    
    char ch1 = 123 ;
    System.out.println(ch1);
    
    System.out.println( 'A' <= 'A');  // !false
    System.out.println('A' <= 'a' );  //  true
    //                  65 <=  97
        
    System.out.println( false ==  false ); // true
    System.out.println( !(false != true) );  
    //                  !true ==> false
    
    
    
    System.out.println( true == true  &&  false !=true );
    //                  true       &&    true   ==> true
    
    System.out.println( true != true  ||  false == true );
    //                      false      ||   false  ==> false
    
    System.out.println( "Monday" == "Funday" || true == !false);
                //          false            ||    true  ==> true
    
  */  
    
   
    
    
    
   
        
    
    
}	
	
	
	
	
	
	
	
	
	
	
	
	

}
