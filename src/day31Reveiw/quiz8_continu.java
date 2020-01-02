package day31Reveiw;

public class quiz8_continu {
public static void main(String[] args) {
	
}
	// q11:
	// dosum(10.0 , 20.0 ) ==> double sum 30.0
	// dosum(10, 20) ==> int sum 30
	public static void dosum(double x, double y) {
		System.out.println("double sum: " + (x + y));
	}

	public static void dosum(Integer x, Integer y) {
		System.out.println("Integer sum: " + (x + y));

	}

	public static void dosum(int x, int y) {
		System.out.println("int sum: " + (x + y));
	}

	public static void dosum(float x, float y) {
		System.out.println("float sum is " + (x + y));
	}

}
