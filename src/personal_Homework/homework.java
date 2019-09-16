package personal_Homework;
import java.util.Scanner;
public class homework {
public static void main(String[] args) {
	/*Write a Java method to display the middle character of a string. Go to the editor
	a) If the length of the string is even there will be two middle characters.
	b) If the length of the string is odd there will be one middle character.


	Input:
	Input a string: elephant 
	Output:

	The middle character in the string: ph	
*/
	
	Scanner scan=new Scanner(System.in);
	
System.out.println("enter  your name");
String name=scan.nextLine();
int a= name.length();
System.out.println(a);
if(a%2==0) {
System.out.println(name.substring(2,4));
}
else {
System.out.println(name.substring(2,3));
}
}
}
/*     
String domain, extension, url;
Scanner input = new Scanner(System.in);
       System.out.println("Domain: ");
    domain = input.nextLine();
        System.out.println("Extension: ");
     extension = input.nextLine();
    
     url ="www."+ domain.toLowerCase().concat(".") + extension.toLowerCase();
     
     System.out.println("Domain: "+ domain.toLowerCase());
     System.out.println("Extension: "+ extension.toLowerCase());
     System.out.println("URL: "+ url);
*/
}