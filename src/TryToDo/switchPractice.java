package TryToDo;

public class switchPractice {
public static void main(String[] args) {
	//switch(expression){
/*	case constant1:
statement1;
statement2;
statement3;
break;
case constant2:
statement1;
statement2;
statement3;
break;
case constant2:
statement1;
statement2;
statement3;
break;

}
*/
String program="dell";
switch (program) {
case "apple":System.out.println("to");
break;
case "acer":System.out.println("chpone");
break;
case "dell":System.out.println("no virus");	
break;	
default:System.out.println("do not buy");
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
}        
        
String gun ="ptesi";        
switch (gun) {      
case "sali":System.out.println("bugun sali");       
 break;       
case "carsamba":System.out.println("bugun carsamba");        
  break;      
case "persembe":System.out.println("bugun persembe");       
 default:System.out.println("haftasonu");       
}        
char word=' ';
switch(word) {
case 'A':System.out.println("passed");
break;
case 'B':System.out.println("wait");
break;
case 'C':System.out.println("two step");
break;
default:System.out.println("none of");
break;
}
String day="thursday";
if(true) {        
System.out.println("java class day");        
}        
else if(false) {
System.out.println("Selenyum class day");	
}	
else  {	
System.out.println("Sql class day");
}

char note ='B';
switch(note) {
case'A':
System.out.println("good job");
break;
case'B':
System.out.println("need more ex");
break;
}
}

}



	





/*1.long2.double3.float4.Boolean
 *switch statement does not accept: 
 * Content’s value must match with expression’ value 
 *Break statement is not mandatory 
 *default section can change
 * 
 */
