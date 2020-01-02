package nurullahConstractor;

public class coolsisTest {
public static void main(String[] args) {
	coolsisgrup group1=new coolsisgrup("saadet","alper",90,56677);
coolsisgrup group2=new coolsisgrup("maral","suleyman",95,899);

System.out.println(group1.member+group1.teacher+" "+group1.quiz+" "+group1.getId());

System.out.println(group2.member+" "+group2.teacher+" "+group2.getId()+group2.quiz);
coolsisgrup group3=new coolsisgrup();

System.out.println(group3.member+" "+group3.teacher);
}
//String member,String teacher,int quiz,int Id)
}
