package REPL;

import java.util.Scanner;

public class repl109 {
public static void main(String[] args) {
	//repl 101
Scanner input = new Scanner(System.in);
String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
for (int i = 0; i < words.length; i++) {
System.out.println(words[i].substring(0,1)+words[i].substring(words[i].length()-1));	
}	



}

}
