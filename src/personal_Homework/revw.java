package personal_Homework;

import java.util.Scanner;

public class revw {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
int[]arry=new int[5];

for (int i = 0; i < arry.length; i++) {
	System.out.println("enter five numbers");
           arry[i]=scan.nextInt();
}      int sum= 0;             scan.nextLine();
      for (int i = 0; i < arry.length; i++) {
		sum+=arry[i];
    	  
    	  System.out.print(sum);
      }



}
}