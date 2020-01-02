
public class primenumber {

	
	
	public static void main(String[] args) {
	
int count=0;
int number=5;	
	while(count<1000) {
		if(isprimenumber(number))
	System.out.print(number);
	count++;
	
	}
	number++;
	boolean sonuc=(isprimenumber(number));
	System.out.println(sonuc);
	
	}

	public static boolean isprimenumber(int number) {
		for (int i = 2; i < number; i++) {
		if(number%i==0) {
		return false;
		}
		
	}
return true;
//1 den 100 e kadar olan prime numberlari ver prime=1 ve kendinden baska
	//birsayiya bolunmeyen




}


}
