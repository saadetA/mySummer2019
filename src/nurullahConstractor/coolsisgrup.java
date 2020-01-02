
package nurullahConstractor;

public class coolsisgrup {
 public String member;
public String teacher;
public int quiz;

private int Id;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}



public void resultquiz(int quiz) {
this.quiz=quiz;	
if(quiz>=80) {
	System.out.println("you passed");
}else {
	System.out.println("you failed");
}


}
public coolsisgrup() {
//this("default name","default name",000,56);	
	
	System.out.println("default constrctr");
	this.member="Default name";
this.quiz=00;
this.teacher="Default name";
//bilgileri elimizde olmayanlar icin 3. member mesela bos constrc cagrilir

//boyle tektek yazacagimiza parametreli constrctri cagrip icine def valulari verebiliriz
} 

public coolsisgrup(String member1,String teacher1,int quiz1,int Id1) {
System.out.println("please check your info");
	
	this.member=member1;	
this.teacher=teacher1;
this.quiz=quiz1;
this.Id=Id1;
}











}
