package TryToDo;
import java.util.Scanner;
public class repl {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
  String name1 =" Max Payne";  
String name2="Alan Wake";
System.out.println("Enter full name");
String str=input.nextLine();
boolean fullname1=name1.equalsIgnoreCase("Max Payne");
boolean fullname2=name2.equalsIgnoreCase("Alan Wake");
if(fullname1||fullname2) {
System.out.println("User found!");
}
else {
System.out.println("not found");
}

}
}
