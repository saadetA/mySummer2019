package TryToDo;

public class practiceMyself {
public static void main(String[] args) {
int numberofWatermelon;
boolean lotsofWatermelon=false;	
numberofWatermelon=40;	
if(numberofWatermelon>=20) {	
System.out.println("I have more than 20 watermelon");
lotsofWatermelon=true;
}

if(lotsofWatermelon) {
System.out.print("good jub");
}
if(lotsofWatermelon==false);{
System.out.println(" "+"i  need more Watermelon");

}
int hour= 12;  
boolean am =true;
if (hour<=12&& am) {
System.out.println("good morning");

}
else if(hour<=12&&hour<=3&&!am) {
System.out.println("good afternoon"); 

}

else if(hour>3&&!am){

System.out.println("good evening");

}

else {
System.out.println("have a good one");
}

int Z=70;
int A=80;
int D=60;

if(D<=Z&& A>Z) {
System.out.println("A is largest");
}
else if(Z>=60&&Z<90) {
System.out.println("pass");
}
else if(Z>=90){
System.out.println("passsed with");

 }
int hou=4;
boolean am1 =true;//less than 12noon //??????4pm 0r 4 am yazabilirmyim
boolean pm=true;
if(hou<12&&am) {
System.out.println("good morning");

}
else if(hou>=12&&hou<=3&&pm) {
System.out.println("good afternoon");
}

else if(hou>=3&&pm) {
System.out.println("good evening");

}
else if(hou==4&&pm==true) {  
System.out.println("good night");
}
/*1. triangle: has three angles, 
	and sum of three angles MUST be equal to 180
	
1. declare three variables angle1, angle2, angle3
2. write a program to check if the triangle is valid or not
*/
int ang1=150;
int ang2=20;
int ang3=10;
boolean a=(ang1+ang2+ang3)==180;
if(!a) {//!
System.out.println("it is avalid triangle");

}
else {
System.out.println("invalid triangle");

}
	/*90 <= grade <= 100    ==> A
	80 <= grade < 90  ==> B
	70 <= grade < 80 ==> C
	60 <= grade < 70 ==> D
		else  ==> F

*/
int grade=80;

if(grade<=90&&100<=grade) {
System.out.println("A");
}

else if(grade<=80&&90>grade) {
System.out.println("B");
}

else {
System.out.println("failed");
}
	/*
 Task02:
		 	1. write a program that:
		 			1. 0 ~12 ==> good morning
		 			2. 12 ~ 15 ==> good afternoon
		 			3. 15 ~ 23 ==> good night
		 			4. 12 ==> good noon



*/
int x=5;
boolean sabah=x>=0&&12>=x;
boolean oglesonrasi = x>=12&&15>=x;
boolean ogle=x==12;
boolean gece= x<=15&&23>x;
if(sabah) {
System.out.println("good morning");
}
else if(ogle) {
System.out.println("god noon");
}	
else if(oglesonrasi) {	
System.out.println("good afternoon");	
	
}	
else if(gece) {
System.out.println("good night");	
	
}	
else {	
System.out.println("have a good one");	
}	

//Task:
	/* int num1, num2, num3, 
	 	find the bigger number
	 	
	 	*/ 
	 	
;
int num1 =30,num2=20,num3=50;
	 boolean y =num1>num2&&num2<num3;//num3
     boolean n=(num1+num3)<num2;//num2
     boolean t =num2==num3&&num3<num1;//num1
if(y) {
System.out.println("num3 is bigger");
}
else if(n) {
System.out.println("num2 is bigger");
}
else if(t) {
System.out.println("num1 is bigger");

}
else {
System.out.println("none of them");
}

if(false) {
	System.out.println("Today is friday");
	System.out.println("Tomorrow is day off");
	System.out.println("there is no java class tomorrow");
}

if(false)
	System.out.println("Today is Friday");
}
/*
	warm up:
		1. declare an int variable "Year"
		 write a java program that can check if the year is a leap year
	    if a year can be devided by 4 ==> leap
	    	Do Not use single If statement
*/





}





