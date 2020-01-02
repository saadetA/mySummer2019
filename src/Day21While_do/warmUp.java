package Day21While_do;

public class warmUp {
	  /*
    1. write a java program that can count how many time 
       the word "book" is appeared in a String
       Ex:
       input: I like books, I have books, I need book
       output: 3
    */
   
   public static void main(String[] args) {
       
String sentence ="I like book, I have book, I need book, I buy book";
       // index:        z
   int count = 0;
   for(int z= 0; z < sentence.length() - 3 ; z++) {
       if(sentence.substring(z, z+4 ).equals("book") ) {
               //            0, 4
               //            1, 5
                //           2, 6
           //               ...
           //                16,  20  ==> 16, 19
           
           count++;
       }
       
   }
   
   System.out.println(count);
       
       
       
       
       
   }
}

