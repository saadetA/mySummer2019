package Day29_return;

public class Return_1 {
	
	/*
	 * access-modifier specifier returnType name(parameter){ statements; }
	 */
	public static void main(String[] args) {
		method1();
		name(); // this is a String value
		// "z"

		System.out.println(name()); // return methods are either printed or assigned to the variable

		String str = name();

		System.out.println(str);
	
	
	}

	public static boolean result() {
		return 8 > 9;
	}

	// if return type is void:
	public static void method1() {//return does not work
		System.out.println("Hello");
		//return;
	}

	// if the return type of the method is not void:
	public static String name() {
		return "bacth12";
		// System.out.println();
		// once return statement executed it exits the method immedietly
	}
		public static int wordCount(String words) {
		 
			int count=0;  
	int a =words.length();
		  for (int i = 0; i < words.length()-1; i++) {
		if(a==i) {
		count++;
		
		}
	}return count;
	
			
		}	
	
	}

