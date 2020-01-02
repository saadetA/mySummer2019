package volkanistekmethod;

public class characterclass {
public static void main(String[] args) {
	
char char1='A';//charakter demek sayi demek
int i=char1;//ch 16 bit int 32 bit atabiliriz
//ch++;
System.out.println(char1);
System.out.println((int)char1);
System.out.println(char1++);
System.out.println(char1);


System.out.println("Merhaba \"java\"sinifi");
System.out.println("mehaba arkadaslar alt satir"+" \n"+" nasilsiniz");
System.out.println("merhaba" +"\f"+"yenisembol");
System.out.println("\\merhaba");
System.out.println("\"merhaba");
//Character sinifi ozellikleri
//java langin icinde
//characterlerin ilk degeri sifirdir ascciye gidersek de null dir
Character ch1;
char ch2='a';
Character.isDigit(char1);//returns true if chrc digit
Character.isLetter(char1);//returns true if chrc letter
Character.isLowerCase(char1);//returns true if chrc islowca
Character.isUpperCase(char1);//returns true if chrc is upcs
Character.toLowerCase(char1);//returns the lowercase
Character.toUpperCase(char1);//returns the upperCase
System.out.println("isDigit('a')is "+Character.isDigit('a'));
System.out.println("isletter('a')is "+Character.isLetter('a'));

System.out.println("isLowercase('a')is "+Character.isLowerCase('a'));
System.out.println("isUppercase('a')is "+Character.isUpperCase('a'));

System.out.println("to lowercase "+Character.toLowerCase('a'));
System.out.println("to uppercase "+Character.toUpperCase('a'));

}


}
