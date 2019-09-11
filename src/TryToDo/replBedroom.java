package TryToDo;
import java.util.*;
public class replBedroom {
public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);
    
    System.out.println("Welcome to Cybertek Apartments!");
    System.out.println("Number of bedrooms you are interested:");
    int numberOfBedrooms = scan.nextInt();
    int startingPrice=0;
    if(numberOfBedrooms==1) {System.out.println("One Bedroom Selected");
    startingPrice=1100;
    System.out.println("Starting Price:"+" "+startingPrice);
    startingPrice=scan.nextInt();
    
    
    
    }
    if(numberOfBedrooms==2) {System.out.println("Two Bedrooms Selected");
    startingPrice=2550;
    String selected=scan.next();
    
    }    

    if(numberOfBedrooms==3) {System.out.println("Three Bedrooms Selected");
    startingPrice=2550;
    String selected=scan.nextLine();
    
    }    
    else {
System.out.println("No such Bedrooms available");
String selected=scan.nextLine();
    startingPrice=0;
    System.out.println("Starting Price:"+" "+startingPrice);
    startingPrice=scan.nextInt();
    }




}








}
