package canvasInterview;

public class UniqValue {
//Unique("AABBCDEEE")  ==> "CD"
public static String uniqvolue(String str) {
	String uniq="";
for (int i = 0; i < str.length(); i++) {
	
	int count=0;
	for (int j = 0; j < str.length(); j++) {
		if(str.charAt(i)==str.charAt(j)) {
			count++;
		}
	
	}
if( count==1){
uniq+=str.charAt(i);	
}

}

return uniq;
}
	


public static void main(String[] args) {
String yeni=	uniqvolue("aaabbcdeee");
System.out.println(yeni);
}

}