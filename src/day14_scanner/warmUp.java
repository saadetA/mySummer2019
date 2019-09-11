package day14_scanner;

public class warmUp {
//double,float,long,boolean kullanamayiz
public static void main(String[] args) {
	

	
	
	String day = "thursday";
switch(day) {
case "tuesday":
System.out.println("java class");
break;//yazip silebilirsin silince or olur
case "monday":
System.out.println("java class");
break;

//daha kisa yolu var mi bakalim
//tusday veya monday arasinda break koymazsak or yerine geciyor
case "wednesday":
case "thursday":
System.out.println("selenyum");
break;//ardinda curly brace oldugu icin break koymak zorunda degiliz


/*
 1. write a program that can display the days
        if the day is Monday or Tuesday:
                        Java class days
        if the day is Thursday or Friday:
                        Selenium class days
        if the day is Wednesday or saturday:
                        SQL class days
        otherwise: day off
            (DO NOT use if statement) 
 */

    //  boolean, float, double,  long
    
   /* String day  = "Friday";
    
    switch (day) {
        case "Monday":        
        case "Tuesday":
                System.out.println("Java class");
                break;
                
        case "Wednesday":
        case "Saturday":
                System.out.println("SQL");
                break;
            
        case "Friday":            
        case "Thursday":
                System.out.println("Selenium");
                break;
                            
        default:
            System.out.println("Day off");
    

    }*/

}






}


}
