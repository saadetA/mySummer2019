package REPL;
import java.util.*;
public class Repl160 {
	public static void main(String[] args) {
        System.out.println(hamletQuote(true, false));
        System.out.println(hamletQuote(false, true));
        System.out.println(hamletQuote(true, true));
        System.out.println(hamletQuote(false,false));

    }
    public static boolean hamletQuote(boolean toBe, boolean notToBe ){
        if(toBe== false && notToBe == false){
            return false;
        }else{
            return true;
        }
    




    }

}
