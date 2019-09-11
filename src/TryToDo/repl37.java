package TryToDo;
import java.util.*;
public class repl37 {
public static void main (String[] args){
Scanner scan=new Scanner(System.in);
int age;
System.out.println("Enter age");
age=scan.nextInt();
boolean a=age<2,b=age==2, c=age>=3&&age<=5,d=age>=6&&age<=7,e=age>=8&&age<=10,f=age>=11&&age<=12;

boolean g=age==13,h=age>=14&&age<=16,k=age>=17&&age<=18,y=age>18;
if(a) {
System.out.println("inaligible");

}
else if(b) {
System.out.println("toddler");

}
else if(c) {
System.out.println("early childhood");

}
else if(d) {
System.out.println("reader");

}
else if(e) {
System.out.println("elementary");

}
else if(f) {
System.out.println("middle");

}
else if(g) {
System.out.println("impossible");

}
else if(h) {
System.out.println("high school");

}
else if(k) {
System.out.println("schoolar");

}
else  {
System.out.println(" ineligible");

}












}
}
