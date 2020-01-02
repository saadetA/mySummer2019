package ExampleOOP;

public class Teachers {

public static void main(String[] args) {
	School firstschool=new School();
School firstschool1=new School("celil","ibrahim",300);

School firstschool2=new School(true);
//firstschool1.manager="ibrahim halil";
System.out.println("the best teacher in scool is: "+firstschool1.manager);
firstschool.teachEnglish();
System.out.println(firstschool.succsesfull(300) );
firstschool1.workingDay=5;
firstschool1.offDay="\tsonday,saturday";
firstschool1.getinfo();

}








}
