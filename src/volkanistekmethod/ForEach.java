package volkanistekmethod;

public class ForEach {
public static void main(String[] args) {
	int result=sumforeach(2,3,4);	
}

public static int[] sumforeach(int[]num2) {
	 
	int sum=0;
	for(int each:num2) {
		sum+=each;
	
	}	
	System.out.println(sum);
return sum;
}	
	
	}