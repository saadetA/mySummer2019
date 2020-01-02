package day33_methods;
import java.util.*;
public class practice {
public static void main(String[] args) {
	
ArrayList<String>isimler=new ArrayList<>();
isimler.add("emine");
isimler.add("mustafa");
isimler.add("akif");
System.out.println(isimler);
isimler.add(1,"ayse");//emine,ayse,mustafa,akif
isimler.add(0,"sibel");//sibel,emine,ayse,mustafa,akif
System.out.println(isimler);
System.out.println(isimler.size());
for (int i = 0; i < isimler.size(); i++) {
	 String yeni=isimler.get(i)+" ";
	System.out.print(yeni);
}




}




}
