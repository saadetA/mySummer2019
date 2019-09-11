package TryToDo;

public class TenaryConditional {

public static void main(String[] args) {
	
int n1=5,n2=10;

int max;
if(n1>n2) {
max=n2;
System.out.println("max number is"+n1);
}
else {
System.out.println("max number is"+n2);
}
   max =   (n1>n2)? n1:n2;
System.out.println(max);


String action;	
boolean isGreen=true;	
/*
if(isGreen) {	
action="can drive";	
	
}	
else {	
action="can not drive";
}
*/
//System.out.println(action);

action=isGreen?"can  drive":"can not drive";
System.out.println(action);
int bill=2000;
int discount;
if(bill>2000) {
discount=15;
	System.out.println("");
}	
	else {
	discount=15;
	}

discount=(bill>2000)?15:50;


System.out.println(discount);

String day;
boolean monday =true;
if(monday){
day="schoolday";
}
else {
day="holiday";
}
System.out.println(day);

int x=0;
//if(true){
/*x=100;
}
else {
x=20;
}
System.out.println(x);
   }
*/
int z=true?100:20;
System.out.println(z);

String schoolname="";
boolean Batch12=true;
/*if(true) {
schoolname="cybertek";
}
else {
schoolname="invalid";
}
System.out.println(schoolname);
*/
String bestschool=true ?"cybertek":"invalid";
System.out.println(bestschool);

double d=10;
if(true) {
d=10.5;
}
else {
d=12.5;
}
double t=(true)?10.5:12.5;
System.out.println(t);

double interestrate=0;
boolean goodcreditcart=true;
 interestrate=true?0.5:0.9;
System.out.println(interestrate);

 int grade= 60;
boolean passed=grade>=60;
String score =(grade>=60)?"passed":"failed";
//or boolean passed=grade>=60?true:false;
System.out.println(score);

char Finalgrade='C';
String group="";

group =Finalgrade=='A'?"earlybird":Finalgrade==
'B'? "Group 1":"lastGroup";
System.out.println(group);

int k=10000,k2=3000,k3=400;
int c=(k>k2&&k2<k3)?k:
       (k2>k&&k<k3)?k2:k3;

System.out.println(c);




}
}


