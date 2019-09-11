package TryToDo;
import java.util.Scanner;
public class homwrkscanner {
public static void main(String[] args) {
	
Scanner keybord =new Scanner(System.in);
int quantity;
double unitprice;
double discount=0;
double discountapplied=0;
double Totalsale=0,grandtotal=0;

System.out.println("enter unitprice");
 unitprice = keybord.nextDouble();



System.out.println("enter quantitiy");
 quantity=keybord.nextInt();


System.out.println("enter grandtotal $");
 grandtotal=keybord.nextInt();


if(quantity<=100&&quantity<=120) {
discount=0.10;

}

else if(quantity>120) {
discount=0.15;	
}
else  {
	discount=0;

	
}
/*	write a program that can convert numbers (between 0~9) to words.
if the number is greater than 9, the out put should be "invalid number.
            DO NOT USE IF STATEMENT
ex 1: 
input:
enter a number between 0 to 9:
1
out put:
you have entered: one
ex 2:
input:
enter a number between 0 to 9:
2
output:
you have entered: two
ex 3:
enter a number between 0 to 9:
10
output:
you have entered: Invalid number*/




}
 
}

