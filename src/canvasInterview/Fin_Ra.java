package canvasInterview;

public class Fin_Ra {
/*
Write a method which prints out the numbers 
from 1 to 30 but for numbers which are a multiple 
of 3, print "FIN" instead of the number and for 
numbers which are a multiple of 5, print "RA" 
instead of the number. for numbers which are a 
multiple of both 3 and 5, print "FINRA" instead of
 the number.
*/
 
public static void returnword(int a) {//sonuc yanlis cikiyor
	//str="FINRA";
	String word="";
	
	for (int i = 1; i <=30; i++) {
word+=(i%3==0&&i%5==0)?word+="FINRA":(i%5==0)?word+="RA":(i%3==0)?word+="FIN":"";

	}

System.out.println(word);


}

public static void main(String[] args) {
	returnword(3); 
}

}
