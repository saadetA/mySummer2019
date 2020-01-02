package day_30_Wrapper_ArraysList;

public class wrappermethds2 {
	 /*
    useful methods of Wrapper class: 
               Max_Value
               Min_Value
               parse methods
               ValueOf methods
    */
   public static void main(String[] args) {
       
       // max_Value: returns the maximum value of the primitive
           int maximum = Integer.MAX_VALUE;
           
           System.out.println( maximum );
           
           double maximumDouble = Double.MAX_VALUE;
           System.out.println(maximumDouble);
           
           byte maximumByte = Byte.MAX_VALUE;
           System.out.println(maximumByte);
           
           char maximumChar = Character.MAX_VALUE;
           System.out.println(maximumChar );
           
           char ch = 12324;
           System.out.println(ch);
           
   
   // min_Value: returns the minimum value of primitive
           
           int minimum = Integer.MIN_VALUE;
           System.out.println(minimum);
    
           byte minimumByte = Byte.MIN_VALUE;
           System.out.println( minimumByte );
           
           
   
   // parse methods: converts String values to primitives, returns primitive values
           
           // parseInt("strValue"): takes the String and converts the string to int primitive
           
           Integer num1 = Integer.parseInt("123");   // auto-boxing
           System.out.println( num1 + 1 );
           
           int num2 = Integer.parseInt("125");  // none
           System.out.println( num2+1 );
           
           
   // parseByte("strValue"): takse the string and converts the string value to byte
           
           //  byte num3 = Byte.parseByte("198");  // out of range
           
               byte num3 = Byte.parseByte("18");  // none
               System.out.println(num3 + 1); 
               
               Byte num4 = Byte.parseByte("18");  // auto-boxing
               System.out.println( num4 + 1 );
               
   
   
   // parseShort("strValue"): takes the string and convrts it to short primitive value
           
               short num5 = Short.parseShort("200");
               System.out.println( num5+1 );
               
               Short num6 = Short.parseShort("200");  // auto-boxing
               System.out.println( num6+1 );
           
           
   // parseLong("strValue"): takes string value and converts to long primitive
               
           int num7 =  (int)Long.parseLong("1222"); 
           long num8  = Long.parseLong("1222"); 
           System.out.println( num7 );
           System.out.println( num8 );
           
   
   //parseFloat("StrValue"): takes string value and converts it to float primitive
           
           float num9 = Float.parseFloat("12.5"); // none
           System.out.println(num9 + 1 );
           
           Float num10 = Float.parseFloat("12.5f");   // Auto-boxing
           System.out.println( num10 +1 );
           
   
  // parseDouble("StrValue"): takes string value and converts it to double primitive
           
             float num11 = (int)Double.parseDouble("8.5");  // none
             System.out.println(num11);
             
           double num12 = Double.parseDouble("8.5");
           System.out.println( num12 );
           
           Double num13 = Double.parseDouble("8.5");  // auto-boxing
           System.out.println(num13);
               
               
   // parseBoolean("StrValue"): takes string value and converts to boolean primitive
        
           boolean A = Boolean.parseBoolean("CybertekBatch12");
                           // any string values other than true will return false
           
           System.out.println(A);  
           
           boolean B = Boolean.parseBoolean("TrUe");  // method ignores the case sensitivity
           System.out.println(B);
           
           
           boolean C = Boolean.parseBoolean("10 > 9");  // "10 > 9 "  != "true"
           System.out.println(C);
           
           
           Boolean D = Boolean.parseBoolean("TrUe"); // Auto-boxing
           System.out.println(D);
           
           
           
   // ===============================================
           
           int a=10; 
           double b =a;
           
       //  Double c = a ; // Double wrapper class is only Dedicated to double primitive
           
           
           int A1 = Byte.parseByte("19");
           Integer  A2 =   (int)Byte.parseByte("19");
           
           
           Short  A3 =  (short)Double.parseDouble("10.9");
           
           
           int A5 =100;
           Float A6 = (float)A5 ; // Floeat wrapper class is only dedicated to float primitive
           
           
           
           
       
   }
   
   
   
}
