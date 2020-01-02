package canvasInterview;
import java.util.Scanner;
public class lastletter {
public static void main(String[] args) {
	
Scanner scan=new Scanner(System.in);
//last letter?

System.out.println("enter your name");
String name1=scan.nextLine();
int indexletter=name1.length()-1;

String lastletter=" "+name1.charAt(indexletter);
System.out.println("last letter is:"+lastletter);



}
}
