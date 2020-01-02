package day26foreach;

public class wurmup1 {
public static void main(String[] args) {
	String a="aabbc",b="cab";//step1 remove duplicates
//a="abc"  b="cab",
String a1="";//store all the non diplucted volue

for (int j = 0; j < a1.length(); j++) {
	

for (int i = 0; i < a.length(); i++) {//step2 duplic
	//if(!a.contains("a"))//bunu her chractericin tekrarlamam gerekecek b
          // a1+=("a");{  //bunun icin nested loop lazim a yi degistir
           
       if(!a1.contains(a.substring(j,j+1))) {
         a1+=a.substring(j,j+1);
       }            //3ifle chara cevir
}

}
System.out.println(a1);
//charAtla yaparsak
String b1="";

for (int i = 0; i < args.length; i++) {
	
}




}
}















