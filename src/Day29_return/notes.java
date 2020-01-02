package Day29_return;

public class notes {

/*	Warm up:
		1. write a method that can find the frequency of characters in String.
		    Ex: 
		        FrequencyTest("XXXYYYZZZ")
		        output: X3Y3Z3
		        FrequencyTest("AAABBBBBCCCC")
		        output: A3B5C4
		        THIS IS A JAVA INTERVEIW QUESTION
		    
		method decleration: 
		    access-modifier specifier  returnType name(parameter){}
		         public       static     void 
		    return-Type: void or other data-types (int, String..)
		            if the return is not void, it MUST be primitive or non primitives.
		            there can only be one return-type
		    if the return-type is void, the method does not return any value
		    if the retun-Type is not void: the method MUST return a value
		return statement: it's used for exiting the current method, we can also use return statement to retun a vlue from the method
		continue statement: skips the current iteration of the loop
		break statement: exits from  loop or switch statement
		System.exit(0): java stops all the execution
		return method:
		            1. does not have "void" as return Type
		            2. MUSt return a Value
		            3. the returning value MUST macth with the return-Type of the method
		            4. the method body Must be closed with return statement
		optional task:
		    1. write a method that accepts String array, and returns the longest String value form the array
		void method VS return method:
		            void methoddoesnt return any value
		            return method MUST return a value
		Method overloading: 
		        it's a feature that allows us to have more than one method with same name, the methods MUST have different parameters
		        return-type of the methods doesn't have to be same
		why do we need overload method: 
		            1. improves the reusability
		            2. improves the readability
*/
	 public static void main(String[] args) {
	        
	        String[] cars = {"BMW", "WV", "audi"};
	        
	                      //
	        String[] words = new String[5];
	        //"java" null  null  null  null
	        //   0     1     2    3     4
	        System.out.println(words[0]);
	        words[0] = "java";
	        words[1] = "c++";
	        words[2] = "ruby";
	        System.out.println(words[0]);
	        
	        words = new String[3];
	        // null null null 
	        //0      1    2  
	        
	        
	        
	        
	        
	    }














}
