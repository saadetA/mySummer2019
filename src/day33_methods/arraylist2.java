package day33_methods;
import java.util.*;
public class arraylist2 {

    public static void main(String[] args) {
        
// declaration of arraylist:
      //iki turlu arryalist yazilir 
    	ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();
        
        
        
    // add(object):
        ArrayList<String> shoppingList = new ArrayList<>();
            shoppingList.add("apple");  // index: 0 ,  size: 1
            shoppingList.add("orange"); //  index: 1,  size: 2
            shoppingList.add("grape");  // index: 2,   size: 3
        
            System.out.println( shoppingList );
        
    // add(index, object): adds the object at the given index number
                // WE CANNOT SKIP THE INDEXES
            
            //  shoppingList.add("Strawberry");
             shoppingList.add(1, "Strawberry" );
                System.out.println( shoppingList ); 
                
          shoppingList.add(4 , "Toyota Corolla");  // it does not skip indexes
            System.out.println( shoppingList );     
            
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(0,  5);  // [5]
            numbers.add(1,  10); // [5, 10]
            numbers.add(2,  15); // [5, 10, 15]
            
            numbers.add(1,  1);   // [5, 1, 10, 15]
            
            numbers.add(1, 6);  //[5, 6, 1, 10, 15]
            
            System.out.println(numbers);
    
    //  get(index number): returns the object
            ArrayList<String> names = new ArrayList<>();
                names.add("Homayra");//==> 0 humeyra
                names.add("Meri");//==> 1 meri
                names.add(1, "Mikrigul");//humeyra , mikrigul,meri
                names.add(1, "Tabriz");//humeyra,tabriz,mikrigul,meri
                names.add(0, "Asiya");//asyan,humeyra,tabriz,meri,mikrigul
                String str1 = names.get(1); 
                System.out.println( str1 );
                
    // size(): returns the length of the arrayList as an Int value
            int length = names.size();
            System.out.println(length);
                                                 //  for u yazdiktan sonra
            for(int i =0; i < names.size(); i++) {//duz string string names=i;
                    String each = names.get(i) +" ";//arry string a=names.[i];
                    System.out.print( each );        //arrylist string b=names.get(i);//index
            }
            
            System.out.println();
            
            for( String each  : names ) {
                System.out.print(each+" ");
            }
            
            System.out.println();
            
    // clear(): removes all the objects from the arraylist
            ArrayList<String> students = new ArrayList<>();
                    students.add("Holly");
                    students.add("Erhan");
                    students.add("Nadira");
                    students.add("Seyfo");
                    students.add("Cihan");
            
                System.out.println(students);
                System.out.println(students.size());  // 5
                    students.clear();
                System.out.println(students);
                System.out.println(students.size());  //0
            
    // set(index number, object): the given object will replace the object at the given index number
            ArrayList<String> Javengers = new ArrayList<>();
                Javengers.add("Ferhat"); //ferhat
                Javengers.add(1,"Lexi");//ferhat,lexi
                
                Javengers.add(1,"Asiya");   //ferhat,asya, lexi,         "Shawkrat"
                Javengers.add("Ozgen");//
                Javengers.add("Alex");//ferhat,asya,lexi,ozgen,alex
                Javengers.add(0,"Safwan");  //safwan, [Ferhat, Lexi, Asiya, Ozgen, Alex, Safwan]
                //  ["Safwan", "Ferhat",  
                
                System.out.println(Javengers);
                
                Javengers.set(1 , "Shawkrat"); //[Ferhat, Lexi, Shawkrat, Ozgen, Alex, Safwan]
                
                System.out.println(Javengers);
        
                
    // contains(object):  checks if the given object is contained in the ArrayList or not, and returns boolean value    
        ArrayList<String> goodGuys = new ArrayList<>();
            goodGuys.add("Hakan");
            goodGuys.add("Ihsan");
            goodGuys.add("Tim");
            goodGuys.add("Ibrohim");
            goodGuys.add("Dilyar");
            
            boolean result = goodGuys.contains("Tim");
            System.out.println(result);
        
    // equals(ArrayList): checks if the two arraylist are equal or not, returns boolean value
        ArrayList<String> badGuys = new ArrayList<>();
            badGuys.add("Hakan");
            badGuys.add("Ihsan");
            badGuys.add("Tim");
            badGuys.add("Ibrohim");
            badGuys.add("Dilyar");
        
                boolean result2 = badGuys.equals(goodGuys);  // false
                System.out.println(result2);
                
    
        if( goodGuys.contains("Ibrohim") && badGuys.contains("Ibrohim")) {
            System.out.println("Ibrohim is good guy");
        }
        
        
        
        
                
                
                
                
                
        
    }                
    
}
