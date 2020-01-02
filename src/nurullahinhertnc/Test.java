package nurullahinhertnc;

public class Test {
public static void main(String[] args) {
	

Bird bird1=new Bird(3,4,6);
bird1.fly();//uniq kendi classinda create ettik
bird1.eat();//parent classtan geldi
//move methodunu direk parenttan aynisini almakyerine 
//bird classinda onu override edip buraya bird objesiyle cagirabilirim
bird1.move();

}

}
