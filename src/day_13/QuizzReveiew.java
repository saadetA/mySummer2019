package day_13;

public class QuizzReveiew {
public static void main(String[] args) {

boolean resultA=9>=9||10<=10,	
	resultB= 'A'>=128&&'B'<128;
	
//reultA=true||true=>true	
//resultB=false&&true=>false	
	
if(!resultA) {	

	
	System.out.println();

	
	 // Kahoot
    //  Q1:
            if( !true != !false) {
            //  false != true ==> true
                System.out.println("Cybertek");
            }
    
    // Q2:
           // boolean resultA = 9 >=9 || 10 <= 10 ,
                    resultB = 'A' >= 128 && 'B' < 128;
            //  resultA = true || true => true
                    // resultB = false && true => false
                    
            if( !resultA ) {
                // true
                    if( resultB ) {
                        // false
                        System.out.println(resultA);
                    }else {
                        System.out.println(resultB);
                    }
            }
                    
                    
            // Q3:
            if(true) {
        
            }else if(false) {
                
            }  
            // else block is not mandatory
            
            
        // Q4:
            int num = 9;
            if(++num < 10) {
            //  10 < 10 ==> false
                System.out.println(num+"Hello Wolrd");
            } else {
                System.out.println(num +"Hello Universe");
                //                  10
            }
            
            System.out.println(++num); //11
            
            int num2 =9;
            if( num2++ < 10) {
            //  9 < 10 ==> true
                    System.out.println(num+"Hello Wolrd");
                    //                  10
                } else {
                    System.out.println(num +"Hello Universe");
                }
    
            System.out.println( num2++ ); // 10
            System.out.println( num2 ); // 11
            
            
        // Q5:
            int x = 1, y=0;
            
            if(x++ > ++y) {  // x=2, y =1
    //          1  >  1  ==> false        
                System.out.print("Hello");
            } else {
                System.out.print("Welcome");
            }
            
            System.out.println(" Log "+x+":"+y);
            //                          2    1
            
            
            
            float A = 5.0F;
            
            
            // Q7:
            if(true) {
                System.out.println("one");
            }
            if(true) {
                System.out.println("two");
            }
            if(true) {
                System.out.println("true");
            }
            
            
            if(true) {
                System.out.println("1");
            }
            else if(true) {
                System.out.println("2");
            }
            else if(true) {
                System.out.println("3");
            }
        
            // break: 11: 15 am
    
            
            
            
    	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
}
	
	
	
//03multibranch iflerde else if istedigin kadar yazabilirsin ama sonda else zorunlu degil
//sadece single if de else zorunlu(mendotry)

//04//






	
	
	
}
