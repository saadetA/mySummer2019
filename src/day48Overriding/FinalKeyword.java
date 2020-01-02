package day48Overriding;

class Credentials{
	
}






class Holly{
	public void printname() {//a
		System.out.println("erhan");
	}// instance method old icin ayni classta overload yapabilieriz
}     //ovverride yapmak icin inherit edip sub class yapmamiz lazim (baska clssta)acces
 //modf ya same ya da more visible olmasi lazim yine public deriz
//final degistirelemez override meth degistirmek icin var bu yuzden final keywrd override yapilmaz
//final ve accs modfr yeri degisebilir

//public final veya final public



public class FinalKeyword {

	
	
	
	
	
	final private String username="cybertek";
	        //local veriable
	int Age;//2-instance veriable objeye bagli istd kadar obj create et cagir
static int Age1;//3-static veriable	tumclass memberlari paylasir degismez tek deger alir
//bunlari final yaparsak hemen assign etmemiz lazim ama final dersek 	

//private final String username="cybertek";
//public void String setusername(String usernama)
//this.username= username err verir final degistirilmez
//get methodu ile cagirip okuyabiliriz 
public String getusername(String username) {
return username;	
}

public static void main(String[] args) {
	//1-local verible can be assigned before we use
	
	//uc cesit veriable gorduk instance,statik ve local
	//simdi final =reassigned atadiktan sonra degistiremezsin
//degistirmek istemedigimiz veriabllar SSN mesela
//final 
		final String SSN ="1234";
//SSN="455667"diyemeyiz final veriables are constant and cannot be reassignedsyso
//obj create etmeden kullanabiliriz        //sabitlemek
System.out.println(SSN);
final String DateOfBirth;

//System.out.println(DateOfBirth);initilize etmeden kullanamayiz cunku local
//finali methoda eklersek method degistirilemez override yaptamayiz final geldigi yeri immituble yapar
FinalKeyword obj=new FinalKeyword();
obj.Age=18;
System.out.println(obj.Age);	

}


public final static void add(int a, int b) {
    System.out.println(a+b);
}

public static double add(double x, double y ) {
    return x+y;
}












}
