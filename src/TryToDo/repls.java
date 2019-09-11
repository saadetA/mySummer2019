package TryToDo;
import java.util.Scanner;//repl22
public class repls {
public static void main(String[] args) {


String firstName;
String lastName;
String fullName;
String  email;
String street;
String  state;
String  city;
String  address;
String Contacts;
int age;
int zipcode;
double height;
double weight;
boolean isMarried=true;
long workPhoneNumber;
long personalPhoneNumber;
Scanner scan=new Scanner(System.in);
System.out.println("Welcome to the patient portal!");
System.out.println("Please enter your personal information");
System.out.println("Enter your first name");
firstName =scan.next();
System.out.println("Enter your last name");
lastName=scan.next();
System.out.println("Enter your email");
email=scan.next();
System.out.println("Enter your street");
street=scan.nextLine();scan.nextLine();                 
System.out.println("Enter your city");
city=scan.next();
System.out.println("Enter your state");
state=scan.next();
System.out.println("Enter your zip code");
zipcode=scan.nextInt();
System.out.println("Enter your work phone number");
workPhoneNumber=scan.nextInt();
System.out.println("Enter your personal phone number");
personalPhoneNumber=scan.nextInt();
System.out.println("Enter your age");
age=scan.nextInt();
System.out.println("Enter your height");
height=scan.nextDouble();
System.out.println("Enter your weight");
weight=scan.nextDouble();
System.out.println("Are you married");
isMarried=scan.nextBoolean();
 Contacts=("work phone number"+"-"+workPhoneNumber+","+"personal phone number"+"-"+"\t"
		+ personalPhoneNumber+","+" "+"email:"+email);
 fullName=("Full name:"+" "+firstName+","+lastName);
	address=("Address:"+street+","+city+","+state+","+zipcode);	

System.out.println("Patient personal Information");
System.out.println("Full name:"+" "+fullName);
System.out.println("Address:"+" "+address);
System.out.println("Contacts:"+" "+Contacts);
System.out.println("Age:"+" "+age);
System.out.println("Height:"+" "+height);
System.out.println("Weight:"+" "+weight);
System.out.println("Married?:"+" "+true);


}

}
