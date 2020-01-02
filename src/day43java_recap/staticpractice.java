package day43java_recap;



public class staticpractice {
public static void main(String[] args) {
	

	//staticKeyword printName() {//instnce methd olunca staticclassname ile cagiramyz
	

  //  staticKeyword.printName();  // Nurzat
    // static methods can be called through the class name  
    
    
    // staticKeyword.printName2(); 
        //instance method cannot called through the class name
    
 //   Practice.printN(); //Semra
    
    printName(); // semra
    
    
    System.out.println(  staticKeyword.StaName  );
    // static features can be called through class name
    
//  System.out.println( staticKeyword.InsName );
        // instance vairables belong to the object, cannot be called through class name
    
    
    staticKeyword obj = new staticKeyword();
        obj.printName2();  
    // in order to call none static in statics, we MUST create object
    
}

public static void printName() {
    System.out.println("Semra");
}





}












