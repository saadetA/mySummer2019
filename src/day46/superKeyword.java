package day46;



class A{//super class
	String name="Hacer";


public void methodA() {
	
}
public A(int a) {//constrctr
	
}

}

public class superKeyword extends A {
              //sub              //super

	 
    public superKeyword(double b) {//olusturdugumz constrc yoksa superclasstakini cagiramayiz
        super(10);  // super class' constructor MUST be called in the sub class
    }//constrc ilk yazilmak zorunda

	
	
	//String name="Hacer";
/*public void method() {
	//instance method olusturup yukardaki inst ver kullanip degistirmek
	//istersem
super. name="sefik";//superclasstan cagirdigimiz zaman inhrt yaptigimizda kullnrz
this.name="sibel";//inst metodun icine inst cagirdigimizda bunun icin inhrtns gerek yok
*/
public void method() {
    super.name = "Mahir";
    this.name = "Ihsan";
    super.methodA();
    this.methodA();
}


}





