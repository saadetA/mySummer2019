import java.util.Scanner;
public class StringHomework {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
/*Write a Java program that can check the URL

Valid extensions for URL are: com, net, edu, org, gov

- check that it starts with www.
- check if it contains the ending dot right before the extension
- assign String domain and 
String extension.
- print them
"Domain:" amazon
"Extension:" com 




	
	
	
	
	
*/	
	String domain="www.amazon.com";

System.out.println(domain.substring(0,3));
int a=domain.lastIndexOf('.');
System.out.println(a);
System.out.println(domain.substring(10,11));
System.out.println(domain.substring(11,14));
int begin=domain.indexOf('a');
int end=domain.indexOf('n')+1;
System.out.println(begin);
System.out.println(end);
String name=domain.substring(4,10);

System.out.println("Domain: "+name);
String extension=domain.substring(11,14);
System.out.println("Extension: "+extension);

/*Write a Java method to display the middle character of a string. Go to the editor
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.


Input:
Input a string: elephant 
Output:

The middle character in the string: ph
*/String nam;













}
}
