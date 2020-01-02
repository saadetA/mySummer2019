package day31Reveiw;

public class ParseVoluOfmethod {
	 public static void main(String[] args) {
		
	 
	/*
    methods:
            max_value
            min_value
            parse methods
            valueof methods
            
    */
    
    int max = Integer.MAX_VALUE;
//  int max2 =  Double.MAX_VALUE; //  int != double
    System.out.println(max -1);
    
    System.out.println( Double.MAX_VALUE ); 
    System.out.println( Byte.MAX_VALUE );  // 127
    
    
    byte min  = Byte.MIN_VALUE;  // -128
    int min2 = Short.MIN_VALUE;  // 
    System.out.println(min);
    System.out.println(min2);
    
    
    
//parse methods:    returns primitves, ignores the  the case sensitivity
    short s1 = Short.parseShort("1234");
    System.out.println(s1 +1 );
    
    double d1 = Double.parseDouble( "78.5");  //none
    Double d2 = Double.parseDouble( "78.5"); //auto-boxing
    System.out.println(d2);
    
        boolean r1 = Boolean.parseBoolean("lunch") ; //none, 
        System.out.println(  r1  );
        
    
// ValueOf methods: returns wrapper class,  ignores case sensitivity
            Integer num =  Integer.valueOf("123");  // non
            System.out.println(num);
            
            int num2 =  Integer.valueOf("123");   // un-boxing
            System.out.println(num2+2);
            
            byte num3 = Byte.valueOf("12");
            
            
            boolean R1 = Boolean.valueOf("123213");  // unboxing
            System.out.println(R1);
    
}        
}


