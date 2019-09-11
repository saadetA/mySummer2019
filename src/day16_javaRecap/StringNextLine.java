package day16_javaRecap;
import java.util.Scanner;
public class StringNextLine {
public static void main(String[] args) {

Scanner input=new Scanner(System.in);	
System.out.println("enter your phone number and name");	
	//1234578 Enter
	int phonenumber=input.nextInt();String name=input.next();

	//hemen string yazmaya izin vermyor oyuzden araya
	input.nextLine();//dememiz lazim

//nextline will take evrything in scanner's memory(including"enter"up to the new line)
System.out.println(" your name is"+name);
String name2=input.nextLine();


//recordu izle tamamla 

}
}
