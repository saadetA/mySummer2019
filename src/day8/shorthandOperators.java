package day8;

public class shorthandOperators {
	

	/*
    += : addition assignment
    -= : subtraction assignment
    
    
    */
   
   public static void main(String[] args) {
       // +=:
       int a=9;
       //  a = a+3;  //12
       
           a += 3;  //  a =  a+3 
       
           System.out.println(a);  //12
       
       int b =     a += 5 ;  // a=17
           //      17 
       System.out.println(b); 
       // a=17 ,  b= 17 
       
       
       int c =  a += b ;   //   a= 34,   c=34 , b=17
       //       17 += 17  = 34
       System.out.println(c);
       
       int d = a += c; //   a= 68, d=68, c= 34, b=17
               //34+=34
       System.out.println(d);
       
       
       int e = (d+=b) * 2;
       //       (68+17) *2
       //        85 *2 = 170
       
       System.out.println(e);  // d = 85, b 17, e= 170, c=34
       System.out.println(d); // 85
       System.out.println(c); // 34
       System.out.println(b); //17
       
       
       // break till: 11:18 am
       
           
       
   }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

