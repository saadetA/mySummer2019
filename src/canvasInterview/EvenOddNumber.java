package canvasInterview;

public class EvenOddNumber {
//Write  a method which can identifies given number is even or odd 
//identify(5) ->  "Odd"   

//identify(6) ->  "Even"
//EX: 

public static void TypeOfNumber(int a) {
	String type=a%2==0?"even number":"odd number";

System.out.println(type);

}

public static void main(String[] args) {
	TypeOfNumber(10);	


}
/*
public  static  String  identifyOddEven( int  n ) {

return  n%2==0 ? "Even" : "odd" ; ikinci method

*/



}
