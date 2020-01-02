package day46;

class B{
public B() {//default
System.out.println("super");	
}	


}







public class DefaultConstractor extends B{
public DefaultConstractor () {//burda super() diyp constrc cagirmamiza gerek yok
	//cunku super classtaki default icinde paramtr yok 
	System.out.println("sub");//sonrasinda birsey cagiramayiz
}

public static void main(String[] args) {
 	DefaultConstractor obj= new DefaultConstractor();	
}

}





