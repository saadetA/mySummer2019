package day_30_Wrapper_ArraysList;

import java.util.ArrayList;
import java.util.Scanner;


public class exampleaArylist {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);	

	ArrayList<String>isimler=new ArrayList<>();//burda size vermemize gerek yok
//add method                                //kac isim yazarsak kendi otomatik ekliyor dinamic
	   ArrayList<String> studentNames = new ArrayList<>();
       
       
       while(true) {
           System.out.println("Enter a name");
           String name = scan.nextLine();
               studentNames.add(name);
               
           System.out.println("do you want to add another name");    
           String answer = scan.nextLine().toLowerCase();
           
           if( !(answer.equals("yes")||answer.equals("no")) ) {
               System.out.println("Invalid");
               break;
           }
           
           if(answer.equals("no")) {
               break;
           }
           
       }
           
           System.out.println( studentNames ); 












}
}
