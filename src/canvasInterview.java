import java.util.Arrays;

public class canvasInterview {
	/*Write a return method that check if a string is build out of the same letters as another string.

			Ex:  same("abc",  "cab"); -> true 

			same("abc",  "abb"); -> false:

	*/		 

public static void main(String[] args) {
boolean yeni=	sameLetters("abc","bac");
System.out.println(yeni);
}

public static boolean sameLetters(String str,String str2) {
	
boolean result=true;	

	char []ch=str.toCharArray();
	
char[]ch2=str2.toCharArray();

Arrays.sort(ch);
Arrays.sort(ch2);

String a1="";
String b1="";

for(char each:ch) {
	a1+=each;
}
for(char each:ch2) {
	b1+=each;
}

if(a1.equals(b1)){
result=true;
}else {
	result=false;
}
return result;
}




}
