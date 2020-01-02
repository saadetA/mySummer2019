package w3resourc;

import java.util.Scanner;

public class methods {
/*
. Write a Java method to find the smallest number among three numbers. Go to the editor
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0
Click me to see the solution
*/

public static void smallest () {
Scanner scan=new Scanner(System.in);	
double a=scan.nextDouble();
double b=scan.nextDouble();
double c=scan.nextDouble();
double smallest=a<b&&a<c?a:b<a&&b<c?b:c;

System.out.println(smallest);
smallest=scan.nextDouble();
}
public static void main(String[] args) {
	
	//count1() ; 
//
	
	System.out.println(count1(("count1(String words")));	
	
	Scanner scan=new Scanner(System.in);	
	
	Scanner in = new Scanner(System.in);
    System.out.print("Input the string: ");
    String str = in.nextLine();

 
			 
	
	// b=scan.nextDouble();
	// c=scan.nextDouble();
//double average=(a+b+c)/3;
	
	
	
	
	System.out.println(middleCharacter("ayse"));	
	smallest(); 	
	small();
System.out.println(average(10, 100,200));




}
/*Write a Java method to compute the average of three numbers. Go to the editor
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0
*/
public static double small() {
	Scanner scan=new Scanner(System.in);	
	double a=scan.nextDouble();
	double b=scan.nextDouble();
	double c=scan.nextDouble();
	double smallest=a<b&&a<c?a:b<a&&b<c?b:c;

	//System.out.println(smallest);
	double small=scan.nextDouble();
return small;
}

public static double average(double a, double b,double c) {
	Scanner scan=new Scanner(System.in);	
	 a=scan.nextDouble();
	 b=scan.nextDouble();
	 c=scan.nextDouble();
double average=(a+b+c)/3;

	//System.out.println(smallest);
	 average=scan.nextDouble();
return average;



}

/*Write a Java method to display the middle character of a string.

Note: a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.

Test Data:
Input a string: 350
*/

public static String middleCharacter(String b) {
	int mida=b.length()/2;
	String middle=b.length()%2!=0?b.substring(mida-1,mida+2):b.substring(mida, mida+1);

return middle;
}

/*Write a Java method to count all vowels in a string.

Sample Solution:

Test Data:
Input the string: w3resource

Pictorial Presentation:
*/

public static int count(String str) {
	   int count = 0;
       for (int i = 0; i < str.length(); i++)
       {
           if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                   || str.charAt(i) == 'o' || str.charAt(i) == 'u')
           {
               count++;
           }
       }
       return count;
   }
/*Write a Java method to count all words in a string.

Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
*/

public static int count1(String str) {
	int count = 0;
    if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                count++;
            }
        }
        count = count + 1; 
    }
    return count; // returns 0 if string starts or ends with space " ".
}


public boolean sleepIn(boolean weekday, boolean vacation) {
	  
return(!weekday||vacation)?true: false;
  
  
}








}
