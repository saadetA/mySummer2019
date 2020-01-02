package day41initilazerstatic;

public class instanceBlock {
	{
System.out.println("instance block");//1-main ve oj create etmeden calismz
	}
public static void main(String[] args) {
	instanceBlock obj=new instanceBlock();//2-simdi calisir
	//instanceBlock obj1=new instanceBlock();
	instanceBlock obj2=new instanceBlock();//4-iki obj daha create edince sirayla once instance sonra constrc uc kez calisir
}//her obj create ettigimizde instanse bloc calisir ardindan constrc calisir

public instanceBlock() {
System.out.println("constractor");//3-once instance block calisir sonra constrc calisir	
}               
//uc tane instance block creaye edip bir obj create edersek tum instance blocklar  print eder
//sonra constrctr printolur dene
 

{
System.out.println("instance block 3");
}



}
