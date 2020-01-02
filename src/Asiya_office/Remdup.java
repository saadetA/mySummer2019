package Asiya_office;

public class Remdup {

//AAABBBCCC


public static String RemoveDup(String str){
String remove="";	
for (int i = 0; i < str.length(); i++) {
	remove=(!remove.contains(""+str.charAt(i)))?remove+=str.charAt(i)+"":"";

}





return remove;
}

public static void main(String[] args) {
String remove=	 RemoveDup("AAABBBCCC");

System.out.println(remove);

}








}
