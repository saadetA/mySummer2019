package REPL;

public class Repl_159 {
	public static void main(String[] args) {
		
	
	System.out.println(c_profits(100,1500));
    System.out.println(c_profits(20,5));
    System.out.println(c_profits(100,100));
}

public static String c_profits(int buyPrice, int sellPrice){

    String result= (sellPrice>buyPrice)? "profit":(buyPrice>sellPrice)?"loss":"no loss";

    return result;

}
}