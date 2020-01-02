
class Hayvan{	

public void talk() {
	System.out.println("Animal is talking");
}



}
class tiger extends Hayvan{
	public void hunt(){
	System.out.println("Tiger is hunting");	
	}
	public void talk() {
		System.out.println("Animal is running");
}
}
class ahtapot extends Hayvan{
	public void swim() {
	System.out.println("ahtapot is swmming");	
	}

	public void talk() {
		System.out.println("Animal is eating");
}

}




public class Hayvanat{
public static void main(String[] args) {
tiger tiger1=new tiger();	
ahtapot ahtapot1=new ahtapot();	
//reftype	
	tiger[]tigers= {tiger1,new tiger()};
ahtapot[]ahtapotlar= {ahtapot1,new ahtapot()};
//parent class ref olunca tum sub classlarinin objelerine
//ulasabiliyoruz

Hayvan hayvan1=new tiger();
Hayvan hayvan2=new ahtapot();

}
}








