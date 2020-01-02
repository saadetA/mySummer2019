package day23arry;

public class udemy {
	/*armup task:
    1. write a program that can return the maximum value from an int array
    2. write a program that can return the second maximum value from an int array
    3. write a program that return the minimum value from an int array
    4. write a program that return the second minimum valye from an int array
*/

public static int maximum(int[]array) {
	int []b= {20,30,40,50,60};
int maximum=0;
for (int i = 0; i < b.length; i++) {
	if(maximum<array[i]) {
		maximum=array[i];
	}
}	
return maximum;
}	
	
	public static void main(String[] args) {
	int []b= {20,30,40,50,60};
	arrayibastir(b); 
	System.out.println(ortalama(b));
	System.out.println(maximum(b));
	}

public static void arrayibastir(int[]array) {

for (int i = 0; i < array.length; i++) {
	System.out.println("element"+(i+1)+":"+array[i]);
}
	
}
public static double ortalama(int []array) {
	int sonuc=0;
for (int i = 0; i < array.length; i++) {
	sonuc+=array[i];

}
return(double) sonuc/array.length;
}








}

