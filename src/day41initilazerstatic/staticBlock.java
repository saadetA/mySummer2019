package day41initilazerstatic;

public class staticBlock {
//main olmadan static block calismaz main bos bileolsa create etmek lazim
//main create ederiz ama once static execute olur
//yeri onemli degil	
//==========================	
	
	
	
	static {
	System.out.println("static block 1");//only execute one time does not depend create on the objec
}                                       //iki static block create edebiliriz hangisi ilk yazilrsa o exc eder
                                        //just we can initilaze static veriables
static {
	System.out.println("static block 2");
}	
	public static void main(String[] args) {
	System.out.println("main method");//kackez obj createedersek okadar exec eder
staticBlock obj1=new staticBlock();
staticBlock obj2=new staticBlock();
staticBlock obj3=new staticBlock();

}
//========================
//constractor

public staticBlock() {
	System.out.println("This is constractor");

}
static {
	System.out.println("static block 3");
}	



}
