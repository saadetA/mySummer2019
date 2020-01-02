package Day20_forloop;

import java.util.Scanner;

public class warmup3Muhtar {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);	
String word=scan.nextLine();
/*When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
*/
int total=word.length();


if(total%2==1&&total<=3){
	String middle=word.substring(total/2,total/2+1);
		
System.out.print(middle+middle+middle);

}

else if(total%2==0&&total<=3){
	String middle=word.substring(total/2,total/2+1);	
	System.out.print(middle+middle+middle);
}

else if(total%2==0&&total>=4){
	String middle=word.substring(total/2-2,total/2);	
	System.out.print(middle);
}

else if(total%2==0&&total<=4){
	String middle=word.substring(total/2-2,total/2);	
	System.out.print(middle+middle);
}









}
}
