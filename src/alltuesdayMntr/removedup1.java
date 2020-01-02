package alltuesdayMntr;

public class removedup1 {

public static void main(String[] args) {
String remove=	removeDup("AAABBBCCCDDD");	
System.out.println(remove);

}

public static String removeDup(String str) {
String 	remove="";//AAABBBCCC
for (int i = 0; i <str.length(); i++) {
if(!remove.contains(""+str.charAt(i))) {
	remove+=str.charAt(i)+"";
}
}





return remove;
}




}
