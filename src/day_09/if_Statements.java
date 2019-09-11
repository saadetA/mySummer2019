package day_09;

public class if_Statements {

	
	/*
    if statements:
        
            single if statement:
            
                if( boolean expression ){
                         some codes to run
                }
                    if block only gets executed if the condition is true
    
    
 
 */
public static void main(String[] args) {
    
    
    if( 9 < 10 ) {
        System.out.println("Hello");
        System.out.println("Happy Friday");
        System.out.println("Tomorrow is day off");
        System.out.println("class starts on Monday");
    }
    
    
    
    int a= 1000; // 1001
    
    if( true ) {
//      1000  == 1001   ==> false
         a = 2000;
         System.out.println("a is increased");
    }
    
    System.out.println(a+"\n\n\n");
    
    
    
    int X= 987654320;
    
    if( X%2 == 0 ) {
        // true
        System.out.println(X);
        System.out.println(" it's an even number");
    }
    
    if(  X%2 != 0 ) {
        //  false
        System.out.println(X);
        System.out.println("it's an odd number");
    }
    
    
    
    
    //   
    int Y = 23456780;
    if( Y % 5 ==0 ) {
        //
        System.out.println(Y+" can be devided by 5 \n\n");
    }
    
    if( Y % 5 != 0 ) {
        System.out.println(Y+" can't be devided by 5 \n\n");
    }
    
    
    
    String CEO ="Main Boss";
    String Kuzzat ="Main Boss";
    
    System.out.println(CEO == Kuzzat); // true
    
    if(Kuzzat == CEO ) {
    //  true
        System.out.println("Great Person in the world");
        System.out.println("First if block");
    }
    
    if(Kuzzat != CEO) {
    //  false
        System.out.println("Great Person in the world");
        System.out.println("Second if block");
    }
    
    
    
    
    int TotalNumber = 100;  
    boolean Cybertek =true;
    boolean BestSchool = true;
    
    if( Cybertek == BestSchool) {
        //      true
        TotalNumber += 500;  // TotalNumber = 600
    }
    
    
    if (Cybertek != BestSchool) {
        // false
        TotalNumber -= 50; // TotalNumber = 50;
    }
    
    
    System.out.println(TotalNumber);
    
    
    
    //
    
    
    
    
    
    
    
    
    
    
    
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
