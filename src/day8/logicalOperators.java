package day8;

public class logicalOperators {

	public static void main(String[] args) {
        /*
         && : And  logic        true && true ==> true,   other wise ==> false
         || : or  logic         
                                true  || false  ==> true
                                true  || true   ==> true
                                false || false  ==> false
            if both conditions are false it will return false, other wise will return true
         
         */
        
        
        // &&:
        
        boolean ResultA = 9 ==0  &&  "Muhtar" == "good";
        //                 false          false   ==> false
        
        System.out.println( ResultA );
        
        boolean ResultB =  8 >5  &&  7 == (8-2+1) ;
        //                  true  &&  true  ==> true
        
        System.out.println(ResultB);
        
        boolean ResultC = !false !=true   &&  !false ==!(!true);
        //                  true != true   &&  true == !false
        //                      false     &&    true  ==> false
        System.out.println( ResultC );
        
        
        
        	
	
	
	
	
	}	
	
	
	
	
	
	
}
