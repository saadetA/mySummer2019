package Asiya_office;

public class methods2 {

    /*return --> always promise give you one specific data type result
             -->  keyword: return 
     how to call a return menthod? 
        2 ways: 
        1: inside System.out.println( hello() );
        2:whatever the promised data type. assign the method to it
    */
    
    public static String hello() {
        return "Hi, good morning";
    }
    
    public static int sayi() {
    	int a=10;int b=20;
    return a+b;
    }
    
    
    public static void main(String[] args) {
        
        //I want to call my return method 
        //there are two ways : 
        //1st one: 
        System.out.println( hello() );
                
        //what is data type that hello() method promised to return? 
        String greating = hello();
        System.out.println(greating);
     //  System.out.println(sayi()); 
    int yenisayi=sayi();
    System.out.println(yenisayi);
    
    
    
    
    
    
    
    
    
    
    
    }
}
