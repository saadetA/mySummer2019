package day45Inheritance;

class Testbase{
static	String chromeDriver="fire fox";//default// inheritance classi burdakileri miras alir
public static void TakeScreenShot() {//
	System.out.println("took screenshot");
}
private static void closeBrowser() {//inheritable degil
	System.out.println(" Browser closed");
}
}



//hangisi super olck  requarmenta gore biz karar verebiliriz
//ama extendsin solundaki sub sagindaki super
               //sub              //super
public class Inheritance extends Testbase {
             //sub child              //super//parent
//sub class is gonna inherit all the visible or protected
	//from the super class
//sadece veriable degil methoduda inherit  edebilir

    // sub class is gonna inherit all the visible or protected features from the super class
        
    /*
        static String chromeDriver;
        
        public static void TakeScreenShot() {
            System.out.println("Took screenshot");
        }
        
        those variable and method we can not see them but they are somewhere in this class
     */
	
	
	
	
	
	public static void main(String[] args) {
	System.out.println(chromeDriver);

	TakeScreenShot();
}
//features public or protected acces modifers can be inherited anywhere even another package
//features default accsecs modifers can only be in the same package
//features that have private access modifer can never be inherted


}






