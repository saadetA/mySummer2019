package day22While;

public class warmUp {
public static void main(String[] args) {
	   /*1. write a program which prints out the numbers from 1 to 30:
	        1. for numbers which are divisible by 3, print "FIN" instead of the number.
	        2. for numbers which are divisible by 5, print "RA" instead of the number
	        3. for numbers which are a divisible by booth 3 and  5, print "FFINRA" instead of the number
	                DO NOT USE FOR LOOP
	    2. write a program that can check if the String is plaindrome. if it's print "true", otherwise print "false"    DO NOT USE FOR LOOP
	        Ex: input: level
	           output: true,  (because reversed value is still "level")	
*/ 

    String str ="";// "" + 1 + 2 + 3 + 4 + 5 ....+30
    int i =1 ;
    
    while(i <= 30 ) {
        
        if( i % 3 == 0 && i %5 ==0 ) {
            str += "FINRA ";
        }else if(i % 3 == 0  ) {
            str += "FIN ";
        }else if(i %5 ==0) {
            str += "RA ";
        }else {
            str += i +" ";
        }
        
        i++;
    }
    
    
    System.out.println(str);
    
    
}
}







