package day06_AritmeticOperators;

public class AritmeticOperators {

	
	/*
    casting: converting larger primitive to smaller size
               datatype variablename  = (datatype) value
    
               castings : Explicit & implicit
                       
               
    primitives:  byte, short, int, long, float, double
    
    */
   
   public static void main(String[] args) {
//explicit casting:
       int a = 128;
       byte b = (byte) a;      // explicit casting
       System.out.println(b);
       
       
       double DecimalNumber = 10.5;
       float FloatNumber =  (int)  DecimalNumber; // double > float
           //  FloatNumber = 10;
       
       System.out.println(FloatNumber);
       
       
   long LongNum = 300L;
   
       //  int IntNum = (int)LongNum;
           int IntNum = (short)LongNum;
           
           System.out.println( IntNum ); 
//implicit casting:
               byte ByteNum = 100;
               int IntNum2 = ByteNum;
               
                   // same with: 
               int IntNum3 =  (int) ByteNum;
           
               
       short SHortNum =100;
           long LongNum2 =  SHortNum; 
               // same with:
           long LongNum3 = (long)SHortNum;
       
               
       
           
   // explicit casting practices:
           double LargestNumber = 100.8765; 
           
           byte ByteValue = (byte) LargestNumber;
           //                      100  
           
           float FloatValue = (float) LargestNumber;
           //                      100.8765F
           
           float FloatValue2 = (int) LargestNumber;
           float FloatValue3 = (byte) LargestNumber;  
           //                          100.0
           
           float FloatValue4 = (short) LargestNumber;
           float FloatValue5 = (long) LargestNumber;
           
           
           System.out.println(FloatValue);  // 100.8765
           
       // break till: 11:25 am

           

       
       
      
      
      
      
      
      
   }
   	
	
	
	
	
	
	
	
	
	
	
}
