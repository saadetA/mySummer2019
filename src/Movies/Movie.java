package Movies;

public abstract class Movie {
//4 types access modifrs
String name;
public int duration;
private int budget;
protected String relaseDate;
//OOP====>e
//keywords static,final,abstract( veribla verilmez 
//sadece method veya classa verilir)methoda vermek icin clss
//abstract olmasi lazim
static String movieTypes;
final String COUNTRY="USA";
//abst methd should be inabstrct class


public abstract void playMovie();





public int getBudget() {
	return budget;
}
public void setBudget(int budget) {
	this.budget = budget;
}

public void Plot() {
	System.out.println("parent movie can not explain anything");
}








}
