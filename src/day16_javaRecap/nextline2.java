package day16_javaRecap;
import java.util.Scanner;
public class nextline2 {
public static void main(String[] args) {
	
Scanner input=new Scanner(System.in);
System.out.println("enter zip cod");
int zip=input.nextInt();
System.out.println("enter city name");
input.nextLine();
String city=input.nextLine();
System.out.println("enter zip cod");//input.nextLine ornextInt// demezseknextline dan sinrasini okumaz
input.nextInt();
System.out.println(" zip cod :"+zip );
System.out.println("enter phonenumber ");
input.nextInt();
System.out.println("enter statename ");
input.nextLine();
String statename=input.nextLine();
System.out.println("your zip:" +zip);

}
}
