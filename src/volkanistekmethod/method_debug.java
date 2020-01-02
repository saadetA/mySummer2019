package volkanistekmethod;

public class method_debug {
	public static void main(String[] args) {
//Define/invoke max method main method
		int i = 5;
		int j = 2;
		int k = max(i, j);
		System.out.println("The maximum of " + i + " and " + j + " is " + k);
	
	
	}

// define method
	/** Return the max of two numbers */
	public static int max(int num1, int num2) {
		int result;
		if (num1 > num2)
			result = num1;
		else
			result = num2;
		return result;

	}
	public static void printGrade(double score) { 
		if (score < 0 || score > 100) {
		System.out.println("Invalid score");
		return; }//eger not 0 dan kucukse 100 den buykse devam etme don demek
		if (score >= 90.0) { System.out.println('A');
		}
		else if (score >= 80.0) {
		System.out.println('B'); }
		else if (score >= 70.0) { System.out.println('C');
		}
		else if (score >= 60.0) {
		System.out.println('D'); }
		else { System.out.println('F');
		} 
		}

}
