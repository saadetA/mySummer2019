package TryToDo;
import java.util.Scanner;//between package and class
public class reveiwDay_15 {
public static void main(String[] args) {
	
	/*/*Write a program that determines the change to be dispensed from a vending
	machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
	increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
	dollar bill to pay for the item.
	Input: 
	Enter price in cents: 95↵
	Output:
	Your change is 0 quarters, 0 dimes, and 1 nickels.
	Collapse

1 quarter = 25 cents.
1 dimes = 10 cents.
1 nickels  = 5 cents.
you will need to use assignment and short hand operators for this task. Good luck (edited) 
*/

Scanner scanner=new Scanner(System.in);
System.out.println("enter price in cents");
int change=scanner.nextInt();
int quarter =change/25;
int dime=(change%25)/10;
int nickel=(change%25)%10/5;
int penny=(change%25)%10%5;
System.out.println("you change is "+quarter+"quarters, "+dime+" dimes,"+nickel+" nickels,and "
+penny+" pennies.");

/*Write a Java program to calculate total amount of sale based on the unit price 
 *and quantity of a product taken.   
User should be able to enter unit price and quantity.
Then the program will perform calculations and display amounts.
The discount rate is 10% for the quantity purchased between 100 and 120 units,
 and 15% for the quantity purchased greater than 120 units.
If the quantity purchased is less than 100 units, the discount rate is 0%.
See the example output as shown below:
Input:
Enter unit price: 25
Enter quantity: 110
Output:
Grand Total: $ 2750.0
Discount: 10%
Discount applied: $ 275.0
Total: $ 2475. 
 */














}
}
