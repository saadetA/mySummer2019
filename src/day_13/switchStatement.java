package day_13;

public class switchStatement {
//switch data type yazilmak zorunda if else de boolean
public static void main(String[] args) {
//switch(datatyp)ise switch degeri de data typ olmali	
//switch(int)yazdiysak case(degeri int olmali)	
//switc de hicbirsey(case defalt break)mendotry degil	
//istendigi kadar case yazilabilir	
//sadece dfalt bile printedilebilir	
//ilk basta defaut varsa ve break yoksa switch caslerden baslar 
//break bulana kadar ilk defaultu print etmez	
//	
	
	// Q5:
    boolean result = true;
    
    if(result) {
        System.out.println("it's true");
    }
    else {
        System.out.println("it's false");
    }
    /*
    else if(result) {
        System.out.println("None of the above");
    }
    multi-branch if statement starts with if and ends wit else statement,
     cannot end with else-if statement
     
     undo : command +z
    */
    
// Q08:
    
    boolean A1 = true, B1 = !A1;
    //                   B1=false
    if(A1) {
    // true
        if(B1) {
    //      false
            System.out.println("Monday");
        }else {
            System.out.println("Tuesday");
        }
    }
    else {
        if(A1) {    
            System.out.println("Thursday");
        }else {
            System.out.println("Friday");
        }
    }
    
// Q09:
    int number =10;
    if(--number > 10) {
    //   9 > 10 ==> false
        System.out.println("Hello Cybertek "+number);
    }else if(number ==9) {
        System.out.println("Hello World "+number);
        //                                  9
    }
    
// Q10:
    boolean X = true;
    boolean Y = !X==false;   // Y = true
    //          false == false  ==> true
    
    boolean Z = Y;   // Z = true
    
    if( X ) {
        System.out.println("Hello Everyone");
    } 
    if( Y ) {
        System.out.println("Today is great day");
    } 
    if( Z ) {
        System.out.println("We have picnic on Saturday");
    }
    
    
    
System.out.println("====================");
    
if( X ) {
    System.out.println("Hello Everyone");
} 
else if( Y ) {
    System.out.println("Today is great day");
} 
else if( Z ) {
    System.out.println("We have picnic on Saturday");
}


//  nested if : precondition. 
//              if a condition can be evaluate to multiple scenarios


/*
vote age:
age >= 18  ==> eligible to vote

age >= 70  ==> can vote three times
70 > age >=50 ==> can vote twice
50 > age >=18 ==> can vote one time

*/
int age = 300;

if( age >= 0 && age <= 150 ) {

if(age >= 18) {
    if( age >= 70 ) { // age >= 70
        System.out.println("can vote three times");
        } 
    else if( age >= 50 ) {  // 70>age >=50
        System.out.println(" can vote two times");
        } 
    else {  // age < 50
        System.out.println(" can vote one time");
        }   
}else {
    System.out.println("not Eligible to Vote");
}

} else {
System.out.println("Invalid Entry");
}

/*

switch(Expression){
       case caseValue:
                   statements;
                   break;
       
       default:
               statements;
               break;

}

*/
	

    
    int num = 5;
    
    switch( num ) {     
        case 7 :
            System.out.println("Sunday");
            break;  // case closed/dismissied
//it's used for exiting switch statement after the case is executed
    
        default:
            System.out.println("Invalid Entry");
            System.out.println("Invalid");
            break; // exits the switch statement
    //  System.out.println("Wednesday");  
//break statement means the closing statement, cannot give any more statements after the break
            
        case 5:
            System.out.println("Friday");
            break;      
    }
    
    
    String days ="Monday";
    
    switch ( days ) {
        default:
            System.out.println("Invalid");
            
        case "Monday": 
            System.out.println("Monday is fun day");  
            
        case "Tuesday":
            System.out.println("Tuesday is great day");   
            break;
    //      break;
            
        case "Wednesday":
            System.out.println("Wednesday is day off");                               
    
    
    
    
    
    
    
    
    
    
    
    
    }	
	
}	
	
}	
	

