package ExampleOOP;

public class School {
String teacher;
String manager;
int students;
boolean scholinfo;
int workingDay;
String offDay;
public School() {
this("ahmet","mehmet",200);
	System.out.println("today is firstday");	
}



public School(String teacher,String manager,int students) {
	this(true);
	this.teacher=teacher;
	this.manager=manager;
this.students=students;
System.out.println("school info : "+"teacher name is"+teacher+"manager  name is "+manager+
	"students counts :"+students);
}
public School(boolean schoolinfo) {
	this.scholinfo=schoolinfo;
	System.out.println("school info "+schoolinfo );
}

public void teachEnglish() {
	System.out.println("All teachers can teach English");
}

public int succsesfull(int num) {
	//num=300;
System.out.println("our successfull students are: ");
return num;
}
public void getinfo() {
	
	System.out.println("info :"+workingDay+offDay);
}


}
