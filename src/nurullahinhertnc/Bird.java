package nurullahinhertnc;

public class Bird extends Animal{

//wings sadece birde has yani uniq oldugu icin ona ayrica burda verib
	//tanimliyoruz

private int wings;//uniq forbirds

public Bird(int age,int size,int wings) {
	super( 1, 1,"bird",5);
	this.setWings(wings);
}
@Override
public void move() {
	System.out.println("is fast moving and running");
}


@Override
public void walk() {
	
	
}
public void fly() {
	System.out.println("flying");//bu da kusa ozgu uniq
}
//kisaca ortakozellikleri inherit edip uniqleri ekle
//ortak olmayan ozlliklerine constrctru cagirip default volue ver 1
public int getWings() {
	return wings;
}
public void setWings(int wings) {
	this.wings = wings;
}
}
