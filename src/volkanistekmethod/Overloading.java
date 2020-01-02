package volkanistekmethod;

public class Overloading {

	
	
	
	
	public static void main(String[] args) {
		double d1=5.5;
		double d2=10.5;
	double result=	max(d1,d2);	
System.out.println(result);
method();
	}

	public static double max(int num1,int num2) {
		int max;
		
		max=num1>num2?num1:num2;
		
		
		return max;
	}

	
	
	
	
	
	public static double max(double num1,double num2) {
	double max;
	
	max=num1>num2?num1:num2;
	
	
	return max;
}
public static void method() {
	int x=1;
	int y= 1;
	for (int i = 0; i < 10; i++) {
		x+=i;
	}
System.out.println(x);

for (int i = 0; i < 10; i++) {
	y+=i;
}
System.out.println(y);

}


}
