package TryToDo;
import java.util.*;
public class ornek {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int sira=scan.nextInt();
	for (int i = sira; i >=1; i--) {         //
		for (int z = i; z >=1; z--) {
			System.out.print(z+" ");	
		}
	for (int k= 2; k <=i ; k++) {		
			
		
			System.out.print(k+" ");		
			}
		System.out.println("");
	}




}
}
