package day8;

public class RelatinalOperatior {
	
	
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
       
       /*
       Relational Operators: return boolean expression
          >  : greater than  
          >= : greater than or equal
          <  : less than
          <= : less than or equal
          == : equal
          != : not equal
          
          =: assign
          !: Exclamation mark in java means the logical opposite
                  NOT
       */
      
      
          
          System.out.println(  10 > 9   );  //
          boolean resultA = 10 > 9;
          System.out.println( resultA );
          
          
          System.out.println( 10 >= 9); // greater or equal
          
          boolean resultB = 10 >= 9;
          System.out.println( resultB );
          
          boolean resultC = 10 <= 9 ;  // less than or equal
          System.out.println( resultC );
          
          boolean resultD = 1100 < 1200; // less than
          System.out.println( resultD );
          
          boolean resultE  = 1000 < 1000; // less than
          System.out.println(resultE);
          
          boolean resultF = 1000 <= 1000;  // less than or equal
          System.out.println( resultF );  // true
          
          
          // == 
          
              boolean resultG = 19 == 19;  // equal
              System.out.println( resultG ); // true
              
          // !: NOT
              boolean resultH =  20 != 20;
              System.out.println(resultH);
              
              boolean A = ! false;   // true
              System.out.println(A);
              
              boolean B = !true ;   // false
          
              /*
               in java:
                  true == true, false == false    
                  !false equal to true, !true equal to false
                  so therefore :
                      !false does not equal !true
                      and
                      true equal !false.
               
               */
              
              
              boolean C = !false != !true; 
              System.out.println(C);
              
              boolean D = true == !false ; 
              System.out.println(D);
              
              boolean E = !(!true);
              System.out.println(E);
              
               boolean F = 10 > 9 == 9 <10 ; 
               //           true  ==  true  ==> true
               System.out.println(F);  // !false
               
          
               
               // practice ! (not):   
                   boolean g = false;
                   System.out.println( !g ); 
                   
               System.out.println( !true == false );
               //                 false == false ==> true  
               
              
               boolean h = "Batch12" == "Batch13";  // false
               System.out.println(h);
               
               System.out.println(  "batch12" == "Batch12" );  // java is case sensitive
               
               System.out.println( "cybertek" != "club" );  // true
               
               System.out.println("Kuzzat" == "bad guy"); // false
               
          System.out.println("Assistant teacher in class"  ==  "Awesome"); // false
          
          
          int num = 198;
          System.out.println( num %= 2 );
          
          
          
          byte ByteNum = 30;
      //  int Inum =  Inum +=ByteNum;  // we must give value to local variables
          
          String str;
      //  System.o    
       
   }

	
	
	
	
	
	
	
	
	
	
	
}

