package day49_Recap;
abstract class shapes {
	
	public abstract void Area();
	
}

abstract class T extends shapes{
	// public abstract void Area();   inherited
}

// concrete
class traingle extends shapes{
	
	
	public  void Area() {
		System.out.println("Area of the triangle is ...");
	}
	
}




















public class Practice {

}
