package day35warmupconstractor;

public class ConstructorMethod {
// constrctr used for created object 
//evry single class must have constrctr
//if you dont crete constrc java compler create a default consrcter
//declert of constr===>access modifer==>classname===>if no parameter==>constrc==>default constrctr
//constrc very special methd because has so many rules
//

//constrc exc depends on created of the class object ==>use new  existingConstrctor keybord
//constrc name must be same classname
//constrc only can call another constrctr
//no return type or no specifer(static)
//can be overload same name diffrnt parameters	
//constr cant be called with its name we must use this keybord to call current	
//you need to practice all rules
//ifyou call anothr call once this cagircz sonra syso yazcz
//bir constrc kendi icine enfazla bir constrctr cagirabilir
	
	public ConstructorMethod(int a){
	System.out.println("with argument "+a);
} 


public static void main(String[] args) {
	ConstructorMethod obj=new ConstructorMethod(9);//new verip constrdemezsek main print vermez	
                               //existing
	ConstructorMethod obj1=new ConstructorMethod(true);
}

public ConstructorMethod(boolean a){
	//constructorMethod(9)boyle cagiramazsin this lazim
//this den once sout olmaz
	//this ikincisini yani ikinci constrctr cagiramayiz
	//constrctr kendi icinde cagrilamaz//constrctr cannnot call itself
	//doubla kendi icinde this(10,5)diyemeyiz
	//eger double constrc int constra cagirdiysak artik o double
	//kapsiyordur birdaha double da inti cagiramayiz
	
	this(100);
System.out.println("constrctr with argument of "+a);
} 














}
