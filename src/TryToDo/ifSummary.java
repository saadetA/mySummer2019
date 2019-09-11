package TryToDo;

public class ifSummary {
public static void main(String[] args) {
	
	int year = 2000;
	boolean leapyear =  year % 4 == 0;
	  if(leapyear) {
	System.out.println("year"+" "+year+" " +"is a leapyear");
	}
	  else {
	System.out.println("not leapyear");

	  }	
/*	
	
 declare an int variable called Age
			 declare a boolean variable "GoodPerson"
			 
			 if goodperson is false:
					 age >= 18 => cigra
					 age >= 21 => Hookah
					 age >= 25 => alcohol
					 
					 age < 18  => milk	
	*/
	
int age=42;	
boolean goodperson=false;
if(age>=18) {
if(age==18) {	
System.out.println("can buy cigar");	
}	
else if(age>18&&age<=21) {	
System.out.println("can buy hokka");	
}	
else if(age>=25) {
System.out.println("can buy alcohol");
}
else {	
System.out.println("drink milk");

}	
}
}
}