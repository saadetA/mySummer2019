package personal_Homework;

public class day10_ifElse {
public static void main(String[] args) {

	//task 1
	
//1. Program :•Declare 3 numbers•Program should display which one is largest	
	
//2.write a java program for the following logic:	
	
	//§If marks < 60, then print “Fail”
	
	//If marks >= 60, but less than 90, then print “Pass”
	//If marks >= 90, then print “Passed with Distinction”
	
	//task2
	
	//if hour is less than 12 noon, greet with Good Morning
	//if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon3
	//if hour is greater than or equal to 3 pm, greet with Good Evening
	
//Average,90-100,80-89,70-79,60,69,0-59,
 //        A      B     C     D      F	
	
//90==>100==A,80==>89==B,70==>79==C,60==>69==D,else==F
	int grade = 67;
if(grade>=100&&grade>=90) {	 
	System.out.println("you made A");	//boolean A = grade>=100&&grade>=90 //boolean C ......
	
}	
else if (grade>=80&&grade>=89) {	//boolean B=grade>=80&&grade>=89	// boolean D.......
}
else if (grade >=70&& grade>=79) {// also we can write else if (A)
System.out.println("you made C");//sys("you made A")
}
else if(grade>=60&&grade>=69) {
System.out.println("you made D");
}
else if(grade < 50){
System.out.println("you made F");
}
else {
System.out.println("you failed");	
}
}

/*
warm up:
   1. declare an int variable "Year"
    write a java program that can check if the year is a leap year
   if a year can be devided by 4 ==> leap
       Do Not use single If statement
  
  2. grade calculator
       A => 90 ~100
       B => 80 ~ 89
       C => 70 ~ 79
       D => 60 ~ 69
       F =>  0 ~ 59

*/

int year = 2000;  
boolean leapyear1 = year % 4 ==0;

if(leapyear1) {
    
    System.out.println("year "+year+" is a leap year");
    
} 
else {
    
    System.out.println("year "+year+" is NOT a leap year");

}


/*
 
  2. grade calculator
        A => 90 ~100:  
        B => 80 ~ 89
        C => 70 ~ 79
        D => 60 ~ 69
        F =>  0 ~ 59
 
 */

int grade = 105;
boolean A = grade >= 90 && grade <= 100;
boolean B = grade >= 80 && grade <= 89;
boolean C = grade >= 70 && grade <= 79;
boolean D = grade >= 60 && grade <= 69;
boolean ValidGrade = grade >=0 &&  grade <= 100;

if(ValidGrade) {
// in order to multi-brach if gets executed, first ValidGrade has to be true

if(A) {   //  100 >= grade >= 90
    System.out.println("You made A");
}
else if(B) {  //  90> grade >= 80
    System.out.println("You made B");
}
else if(C) { //  80> grade >= 70
    System.out.println("You made C");
}
else if(D) {  //  70> grade >= 60
    System.out.println("You made D");
}
else {  // 0 =< grade < 60  
    System.out.println("You made F");
}

} 
else {   // grade < 0  || grade >100

System.out.println("Invalid Grade");
} 





}




//nested if;if cond can be to multiple senarios 	

// if(cnd1){

//if(cnd2){

//}
//}

int age =21;
boolean GoodPerson = false;
    
if( age >= 18) {

    if(GoodPerson) {
        System.out.println("Alcohol is bad for your health");
    }
    else { // GoodPerson=false, && age >=18
        
        System.out.println("You can buy Cigrates");
        if(age>=21) {
            System.out.println("You can buy Hookah");
        }
        if(age >= 25) {
            System.out.println("You can buy Alcohol");
        }
        
    }
    
    
}

declare an int variable called Age
declare a boolean variable "GoodPerson"

if goodperson is false:
        age >= 18 => cigra
        age >= 21 => Hookah
        age >= 25 => alcohol
        
        age < 18  => milk
        
else 
// bad for your health




*/
int age =30;
boolean GoodPerson = false;

if( age >= 18) {
System.out.println("you can buy milk");

if(GoodPerson) {
   System.out.println("Alcohol is bad for your health");
}
else { // GoodPerson=false, && age >=18
   
   System.out.println("You can buy Cigrates");
   
   if(age>=21) {
       System.out.println("You can buy Hookah");
   }
   if(age >= 25) {
       System.out.println("You can buy Alcohol");
   }
   
}


} else {  // age < 18
System.out.println("buy milk");
}




/*
1. write a program that can find the number of days in a month
(Assume that Feb has 28 days)

int month=0~12;
1     2    3    4      5    6     7       8    9    10    11    12
Jan,  Feb,  Mar,  Apr,  May,  Jun,  Jul,  Aug, Sep , Oct, Nov, Dec
31    28    31      30     31   30   31    31   30   31    30   31

MUST use nested if

28 days: 2
30 days: 4,6, 9, 11
31 days: 1,3,5,7,8,10,12

even number of 30 days: 4 &6
odd number of 30 days: 9 & 11

even number of 31 days: 8, 10, 12
odd number of 31 days: 1,3,5, 7

*/
int month = 5;  
if( month >0 && month < 13) {
if(month==1) {
   System.out.println("31 days ");
}
else if(month==2) {
   System.out.println("28 days");
}
else if(month==3){
   System.out.println("31 days");
}
else if(month == 4) {
   System.out.println("30 days");
}
else if( month ==5 ) {
   System.out.println("31 days");
}
else if(month == 6) {
   System.out.println("30 days");
}
else if(month ==7) {
   System.out.println("31 days");
}
else if(month %2 ==0 ) {  
// months greater than 7, if it's even number ==> 31 days
   System.out.println("31 days");
   
}else {
// months greater than 7, if it's odd number ==> 30 days
   System.out.println("30 days");
}   


}
else {
System.out.println("Invalid Entry");
}


/*

28 days: 2
30 days: 4,6, 9, 11
31 days: 1,3,5,7,8,10,12

Leap year:
   29 days: 2


*/
int month2 = 13;
int year = 2000;
if(month2>0 && month2 <13) {  //  1~12

   if(month2 ==2 ) { // month2=2
       if(year%4 == 0) {
           System.out.println("29 days");
       } 
       else {
           System.out.println("28 days");
       }
   }
   
   else if( month2== 4 || month2==6 ) { // month2=4 or month2=6
       
       System.out.println("30 days");
       
   } else if ( month2==9 || month2==11) { // month2=9 or month2=11
       System.out.println("30 days");
       
   } else { //  month2 : 1,3,5,7,8,10,12
       System.out.println("31 days");
   }

} else {

System.out.println("Invalid Entry");

}



}


	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}

