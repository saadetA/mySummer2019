package day34Costractors;
import java.util.*;

//import java.util.Collections;



public class ConstructorsPractice {

	
	// decleration access modifier class name and(parametr)
//her classin bir constractri olmasi lazim
//classta mutlaka constracter create emeniz
	//lazim eger createetmezsenizz compailer sizin yerinize default constracter olusturur yani argumenti
	//olmayan bir const olusturur

//constrc u ancak constrctrin icinde cagirabiliriz mainde veya baska classta cagiramayiz
//classname ile constrct ayni olmali
//constrctirdan nasil cikariz?object create etmezsen cikarsin
//object create etmek icin classname veriablename(referansname)=new existingconstrctr 
//bu method sadece classta object crate etmek icin kullaniriz
     
    //importlari ekle
    
    
 // arrayList sorting:
             Integer[] array = {1000, 900, 80, 765, 123, 542};
             
        // ArrayList<Integer> price = new ArrayList<>();
           //  price.addAll(  Arrays.asList(array) );
             
           //  System.out.println(price);
             
      //   Collections.sort( price );  // sorts the arrayList in ascending order
         
       //  System.out.println(price);
             
         
         //  public sort() {   }    in constructor, the method name MUST be same with the name of the class
         
         // default constructor
       
         
         public static void main(String[] args) {
             
         //  ConstructorsPractice obj = new ConstructorsPractice();  // does not exist
             
      // default (no-arg) constructor is given by default, when there is no other constructors
             
             
         //  ConstructorsPractice obj2 = new ConstructorsPractice("Hello");
                 // we don't have constror that bpasses String parameter
             
             
             method1();
             
         //  ConstructorsPractice(10) ;
             
             
             ConstructorsPractice obj3 = new ConstructorsPractice(10);
                     // constructor' execution is ALWAYS depends on the creation of object
             
             
              method2();
             
         }
         
         
         public static void method1() {
             
             System.out.println("Regular method");
             
         }
         
         public static void method2() {
             
             ConstructorsPractice obj4 = new ConstructorsPractice(10);
             method1();
         }
           
             
         
         public ConstructorsPractice(int a) {
             
             
             
             System.out.println("Hi I am constructor with parameter of int: "+ a);
             
             
             
         }       
             
     
 }
 













