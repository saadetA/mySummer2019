package personal_Homework;

public class middleof {
	import java.util.Scanner;
    public class ConvertNumbers {
        public static void main(String[] args) {
            
            Scanner scan =new Scanner(System.in);
            System.out.println("Enter your name");
            
            String name = scan.next();
            
            // Finding middle letter of a String
            //1.Step find the length of the name
            
            int nameL = name.length();
            String midlet="";
            //2.Step divide the length by 2 to find mid num
            int midL = nameL/2 ;
            if(nameL%2==0) {
                midlet = name.substring(midL-1, midL +1);   
            }else {
                midlet = name.substring(midL,midL+1);
            }
            
            //3. Step find the place of the letter (midL)
            
            
            
            System.out.println("My middle letter is + " + midet);
}
