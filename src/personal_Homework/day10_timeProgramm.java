package personal_Homework;

public class day10_timeProgramm {
public static void main(String[] args) {
	
/*write a program that:
		 			1. 0 ~12 ==> good morning
		 			2. 12 ~ 15 ==> good afternoon
		 			3. 15 ~ 23 ==> good night
		 			4. 12 ==> good noon
  	
 */
int hour =11;		
String am ="am";
String pm="pm";



if(hour>=0 &&hour<=12) {	
System.out.println(" good morning");
}
else if(hour<=12&&hour<=15) {
System.out.println("good afternoon");
}

else if(hour<= 15 && hour <=23) {
System.out.println("good night");
}
else if(hour==12) {
System.out.println("good noon");
}
}
}


	
	
	
	
	
	
	
	

